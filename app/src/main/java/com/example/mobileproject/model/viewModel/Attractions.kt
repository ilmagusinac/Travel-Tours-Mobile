package com.example.mobileproject.model.viewModel

import com.example.mobileproject.model.models.Attractions

data class AttractionsDetails(
    val id: Int = 0,
    val name: String = "",
    val description: String = ""
)

data class AttractionsUiState(
    val attractionsDetails: AttractionsDetails = AttractionsDetails(),
    val isEntryValid: Boolean = false
)
fun AttractionsDetails.toAttractions(): Attractions = Attractions(
    id = id,
    name = name,
    description = description
)

fun Attractions.toAttractionsDetails() = AttractionsDetails(
    id = id,
    name = name,
    description = description
)

fun Attractions.toAttractionsUiState(isEntryValid: Boolean = false): AttractionsUiState = AttractionsUiState(
    attractionsDetails = this.toAttractionsDetails(),
    isEntryValid = isEntryValid
)
