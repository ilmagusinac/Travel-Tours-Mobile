package com.example.mobileproject.model.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import com.example.mobileproject.model.repositories.TourRepository
import kotlinx.coroutines.flow.first
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
}