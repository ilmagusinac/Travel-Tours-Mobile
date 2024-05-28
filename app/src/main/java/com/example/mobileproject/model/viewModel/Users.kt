package com.example.mobileproject.model.viewModel


import android.provider.ContactsContract.CommonDataKinds.Email
import com.example.mobileproject.model.models.Users

data class UsersDetails(
    val id: Int = 0,
    val username: String = "",
    val email: String = "",
    val password: String = ""
)

data class UsersUiState(
    val usersDetails: UsersDetails = UsersDetails(),
    val isEntryValid: Boolean = false
)

fun UsersDetails.toUsers(): Users = Users(
    id = id,
    username = username,
    email = email,
    password = password
)

fun Users.toUsersDetails() = UsersDetails(
    id = id,
    username = username,
    email = email,
    password = password
)

fun Users.toUserUiState(isEntryValid: Boolean = false): UsersUiState = UsersUiState(
    usersDetails = this.toUsersDetails(),
    isEntryValid = isEntryValid
)

