package com.example.mobileproject.model.viewModel

import com.example.mobileproject.model.models.Reservations

data class ReservationsDetails(
    val id: Int = 0,
    val userId: Int = 0,
    val tourId: Int = 0
)

data class ReservationsUiState(
    val reservationsDetails: ReservationsDetails = ReservationsDetails(),
    val isEntryValid: Boolean = false
)
fun ReservationsDetails.toReservations(): Reservations = Reservations(
    id = id,
    userId = userId,
    tourId = tourId
)

fun Reservations.toReservationsDetails() = ReservationsDetails(
    id = id,
    userId = userId,
    tourId = tourId
)

fun Reservations.toReservationsUiState(isEntryValid: Boolean = false): ReservationsUiState = ReservationsUiState(
    reservationsDetails = this.toReservationsDetails(),
    isEntryValid = isEntryValid
)
