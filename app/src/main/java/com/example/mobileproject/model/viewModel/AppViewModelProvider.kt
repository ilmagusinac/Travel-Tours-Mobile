package com.example.mobileproject.model.viewModel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
//import com.example.mobileproject.UserApplication
import com.example.mobileproject.UserApplication

object AppViewModelProvider {

    val Factory = viewModelFactory {
        initializer {
            SignUpViewModel(
                UserApplication().container.userRepository
            )
        }
    }
}


fun CreationExtras.UserApplication(): UserApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as UserApplication)