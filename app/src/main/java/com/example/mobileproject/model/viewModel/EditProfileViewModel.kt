package com.example.mobileproject.model.viewModel


import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.viewModelScope
import com.example.mobileproject.model.repositories.UserRepository
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

class EditProfileViewModel(private val userRepository: UserRepository) : ViewModel() {
    var userUiState by mutableStateOf(UsersUiState())
        private set

    fun updateUsername(newUsername: String) {
        val updatedDetails = userUiState.usersDetails.copy(username = newUsername)
        userUiState = userUiState.copy(usersDetails = updatedDetails)
    }

    fun updateEmail(newEmail: String) {
        val updatedDetails = userUiState.usersDetails.copy(email = newEmail)
        userUiState = userUiState.copy(usersDetails = updatedDetails)
    }

    fun fetchUserData(userId: Int) {
        viewModelScope.launch {
            val user = userRepository.getOneStream(userId).first()
            if (user != null) {
                userUiState = user.toUserUiState()
            }
        }
    }

    fun saveChanges(onResult: (Boolean, String?) -> Unit) {
        viewModelScope.launch {
            try {
                userRepository.update(userUiState.usersDetails.toUsers())
                onResult(true, null)
            } catch (e: Exception) {
                onResult(false, e.message)
            }
        }
    }
}