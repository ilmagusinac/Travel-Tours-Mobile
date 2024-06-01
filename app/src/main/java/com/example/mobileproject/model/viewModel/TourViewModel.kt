package com.example.mobileproject.model.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mobileproject.model.models.Tours
import kotlinx.coroutines.launch
import com.example.mobileproject.model.repositories.TourRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.first
/*
class ToursViewModel(private val tourRepository: TourRepository) : ViewModel() {

    var toursUiState by mutableStateOf(ToursUiState())
        private set

    fun updateUiState(toursDetails: ToursDetails) {
        toursUiState = toursUiState.copy(toursDetails = toursDetails)
    }

    fun validateInput(): Boolean {
        val details = toursUiState.toursDetails
        return details.name.isNotBlank() && details.destination.isNotBlank() && details.description.isNotBlank() && details.date.isNotBlank()
    }

    fun fetchTours() {
        viewModelScope.launch {
            val tours = tourRepository.getAllTours().first() // This returns a List<Tours>
            if (tours.isNotEmpty()) {
                val toursDetailsList = tours.map { it.toToursDetails() }
                // Assuming you want to update the UI for the first tour for simplicity
                toursUiState = toursUiState.copy(toursDetails = toursDetailsList.first())
            }
        }
    }

    fun addTour(tourDetails: ToursDetails) {
        viewModelScope.launch {
            if (validateInput()) {
                tourRepository.insert(tourDetails.toTours())
            }
        }
    }

    fun updateTour(tourDetails: ToursDetails) {
        viewModelScope.launch {
            if (validateInput()) {
                tourRepository.update(tourDetails.toTours())
            }
        }
    }

    fun deleteTour(tourDetails: ToursDetails) {
        viewModelScope.launch {
            tourRepository.delete(tourDetails.toTours())
        }
    }
}*/

/*
data class TourUiState(
    val toursList: List<ToursDetails> = emptyList(),
    val error: String? = null
)

class ToursViewModel(private val tourRepository: TourRepository) : ViewModel() {

    var uiState by mutableStateOf(TourUiState())
        private set

    init {
        fetchTours()
    }

    private fun fetchTours() {
        viewModelScope.launch {
            try {
                val tours = tourRepository.getAllTours().first()
                val firstFourTours = tours.take(4).map { it.toToursDetails() }
                uiState = TourUiState(toursList = firstFourTours)
            } catch (e: Exception) {
                uiState = uiState.copy(error = e.message)
            }
        }
    }
}*/
data class TourUiState(
    val toursList: List<ToursDetails> = emptyList(),
    val error: String? = null
)

class ToursViewModel(private val tourRepository: TourRepository) : ViewModel() {

    private val _uiState = MutableStateFlow(TourUiState())
    val uiState: StateFlow<TourUiState> = _uiState

    init {
        fetchTours()
        insertSampleTours()
    }

    private fun fetchTours() {
        viewModelScope.launch {
            try {
                val tours = tourRepository.getAllTours().first()
                val firstFourTours = tours.take(4).map { it.toToursDetails() }
                _uiState.value = TourUiState(toursList = firstFourTours)
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(error = e.message)
            }
        }
    }

    private fun insertSampleTours() {
        viewModelScope.launch {
            val sampleTours = listOf(
                Tours(name = "Western Strait", destination = "22.2.2022", description = "Beautiful Western Strait tour", date = "2023-07-01"),
                Tours(name = "Eastern Peaks", destination = "15.3.2022", description = "Exciting Eastern Peaks tour", date = "2024-08-15"),
                Tours(name = "Southern Shores", destination = "10.4.2022", description = "Relaxing Southern Shores tour", date = "2024-09-10"),
                Tours(name = "Northern Lights", destination = "25.5.2022", description = "Amazing Northern Lights tour", date = "2024-10-25")
            )
            sampleTours.forEach { tour ->
                tourRepository.insert(tour)
            }
        }
    }
}