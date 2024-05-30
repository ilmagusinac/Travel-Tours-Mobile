package com.example.mobileproject.model.viewModel


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mobileproject.model.models.Reservations
import com.example.mobileproject.model.repositories.AttractionRepository
import com.example.mobileproject.model.repositories.ReservationRepository
import com.example.mobileproject.model.repositories.TourRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

data class ToursViewUiState(
    val tourDetails: ToursDetails? = null,
    val attractionsList: List<AttractionsDetails> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null,
    val successMessage: String? = null,
    val bookingSuccess: Boolean = false,
    val bookingFailure: Boolean = false
)

class ToursViewViewModel(
    private val tourRepository: TourRepository,
    private val attractionRepository: AttractionRepository,
    private val reservationRepository: ReservationRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(ToursViewUiState())
    val uiState: StateFlow<ToursViewUiState> = _uiState

    fun fetchTourDetails(tourId: Int) {
        viewModelScope.launch {
            _uiState.value = ToursViewUiState(isLoading = true)
            try {
                val tour = tourRepository.getOneStream(tourId).first()
                val tourAttractions = tourRepository.getTourAttraction(tourId).first()
                val attractions = tourAttractions.map {
                    attractionRepository.getOneStream(it.attractionId).first()
                }.filterNotNull().map { it.toAttractionsDetails() }
                _uiState.value = ToursViewUiState(
                    tourDetails = tour?.toToursDetails(),
                    attractionsList = attractions,
                    isLoading = false
                )
            } catch (e: Exception) {
                _uiState.value = ToursViewUiState(error = e.message, isLoading = false)
            }
        }
    }
    /*
    fun bookTrip(userId: Int, tourId: Int) {
        viewModelScope.launch {
            try {
                reservationRepository.insert(Reservations(userId = userId, tourId = tourId))
                _uiState.value = _uiState.value.copy(successMessage = "Trip booked successfully!")
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(error = e.message)
            }
        }
    }

     */
    fun bookTrip(userId: Int, tourId: Int) {
        viewModelScope.launch {
            try {
                // Check if the reservation already exists
                val existingReservation = reservationRepository.getReservationByUserAndTour(userId, tourId).first()
                if (existingReservation == null) {
                    reservationRepository.insert(Reservations(userId = userId, tourId = tourId))
                    _uiState.value = _uiState.value.copy(bookingSuccess = true)
                } else {
                    _uiState.value = _uiState.value.copy(bookingFailure = true)
                }
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(error = e.message, isLoading = false)
            }
        }
    }
}