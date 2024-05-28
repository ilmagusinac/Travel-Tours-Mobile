package com.example.mobileproject.model.viewModel

import com.example.mobileproject.model.models.Tours

data class ToursDetails(
    val id: Int = 0,
    val name: String = "",
    val destination: String = "",
    val description: String = "",
    val date: String = ""
)

data class ToursUiState(
    val toursDetails: ToursDetails = ToursDetails(),
    val isEntryValid: Boolean = false
)
fun ToursDetails.toTours(): Tours = Tours(
    id = id,
    name = name,
    destination = destination,
    description = description,
    date = date
)

fun Tours.toToursDetails() = ToursDetails(
    id = id,
    name = name,
    destination = destination,
    description = description,
    date = date
)

fun Tours.toToursUiState(isEntryValid: Boolean = false): ToursUiState = ToursUiState(
    toursDetails = this.toToursDetails(),
    isEntryValid = isEntryValid
)
