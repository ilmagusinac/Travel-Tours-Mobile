package com.example.mobileproject.model.viewModel

import androidx.compose.runtime.getValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import kotlinx.coroutines.flow.first
import com.example.mobileproject.model.repositories.UserRepository



class SignUpViewModel(private val userRepository: UserRepository) : ViewModel() {
    var userUiState by mutableStateOf(UsersUiState())
        private set

    fun updateUiState(userDetails: UsersDetails) {
        userUiState = userUiState.copy(usersDetails = userDetails)
    }

    fun validateInput(): Boolean {
        val details = userUiState.usersDetails
        return details.username.isNotBlank() && details.email.isNotBlank() && details.password.isNotBlank()
    }

    fun registerUser(onResult: (Boolean, String?) -> Unit) {
        viewModelScope.launch {
            if (validateInput()) {
                val existingUser = userRepository.getEmail(userUiState.usersDetails.email).first()
                if (existingUser != null) {
                    onResult(false, "Email already registered")
                } else {
                    userRepository.insert(userUiState.usersDetails.toUsers())
                    onResult(true, null)
                }
            } else {
                onResult(false, "Invalid input")
            }
        }
    }
}