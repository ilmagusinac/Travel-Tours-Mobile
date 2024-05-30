package com.example.mobileproject.model.viewModel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.mobileproject.UserApplication


object AppViewModelProvider {

    val Factory = viewModelFactory {
        initializer {
            SignUpViewModel(
                userApplication().container.userRepository

            )
        }
        initializer {
            SignInViewModel(
                userApplication().container.userRepository
            )
        }
        initializer {
            EditProfileViewModel(
                userApplication().container.userRepository
            )
        }
        initializer {
            ToursViewModel(
                userApplication().container.tourRepository
            )
        }
        initializer {
            ProfileViewModel(
                userApplication().container.userRepository,
                userApplication().container.tourRepository
            )
        }
        initializer {
            ToursViewViewModel(
                userApplication().container.tourRepository,
                userApplication().container.attractionRepository,
                userApplication().container.reservationRepository
            )
        }
    }
}


fun CreationExtras.userApplication(): UserApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as UserApplication)