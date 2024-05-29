package com.example.mobileproject.model.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mobileproject.model.repositories.TourRepository
import com.example.mobileproject.model.repositories.UserRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.launch

class ProfileViewModel(
    private val userRepository: UserRepository,
    private val tourRepository: TourRepository
) : ViewModel() {

    var userUiState by mutableStateOf(UsersUiState())
        private set

    var toursUiState by mutableStateOf(ToursUiState())
        private set


    fun fetchUserData(userId: Int) {
        viewModelScope.launch {
            userRepository.getOneStream(userId).collect { user ->
                user?.let {
                    userUiState = user.toUserUiState()
                }
            }
        }
    }


    fun logout(onLogout: () -> Unit) {
        userUiState = UsersUiState()  // Reset user UI state
        toursUiState = ToursUiState()  // Reset tours UI state
        onLogout()
    }

    fun fetchPreviousTours() {
        viewModelScope.launch {
            tourRepository.getAllTours().collect { tours ->
                toursUiState = ToursUiState(toursList = tours.filter { it.id >= 5 }.map { it.toToursDetails() })
            }
        }
    }
}
