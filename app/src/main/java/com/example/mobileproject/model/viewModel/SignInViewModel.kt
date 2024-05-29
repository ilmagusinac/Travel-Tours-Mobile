package com.example.mobileproject.model.viewModel


import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.example.mobileproject.model.repositories.UserRepository
import kotlinx.coroutines.flow.first


class SignInViewModel(private val userRepository: UserRepository) : ViewModel() {
    var userUiState by mutableStateOf(UsersUiState())
        private set

    fun updateUsername(newUsername: String) {
        val updatedDetails = userUiState.usersDetails.copy(username = newUsername)
        userUiState = userUiState.copy(usersDetails = updatedDetails)
    }

    fun updatePassword(newPassword: String) {
        val updatedDetails = userUiState.usersDetails.copy(password = newPassword)
        userUiState = userUiState.copy(usersDetails = updatedDetails)
    }

    fun validateInput(): Boolean {
        return userUiState.usersDetails.username.isNotBlank() && userUiState.usersDetails.password.isNotBlank()
    }

    suspend fun signInUser(onResult: (Boolean, String?) -> Unit) {
        if (validateInput()) {
            val user = userRepository.login(userUiState.usersDetails.password, userUiState.usersDetails.username).first()
            if (user != null) {
                onResult(true, null)
            } else {
                onResult(false, "Invalid username or password")
            }
        } else {
            onResult(false, "Please enter both username and password")
        }
    }
}
