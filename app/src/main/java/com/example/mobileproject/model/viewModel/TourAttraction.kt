package com.example.mobileproject.model.viewModel

import com.example.mobileproject.model.models.TourAttraction

data class TourAttractionDetails(
    val id: Int = 0,
    val attractionId: Int = 0,
    val tourId: Int = 0
)

data class TourAttractionUiState(
    val tourAttractionDetails: TourAttractionDetails = TourAttractionDetails(),
    val isEntryValid: Boolean = false
)
fun TourAttractionDetails.toTourAttraction(): TourAttraction = TourAttraction(
    id = id,
    attractionId = attractionId,
    tourId = tourId
)

fun TourAttraction.toTourAttractionDetails() = TourAttractionDetails(
    id = id,
    attractionId = attractionId,
    tourId = tourId
)

fun TourAttraction.toTourAttractionUiState(isEntryValid: Boolean = false): TourAttractionUiState = TourAttractionUiState(
    tourAttractionDetails = this.toTourAttractionDetails(),
    isEntryValid = isEntryValid
)
