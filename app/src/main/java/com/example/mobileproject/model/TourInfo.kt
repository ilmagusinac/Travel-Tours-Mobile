package com.example.mobileproject.model

import com.example.mobileproject.R


data class TourInfo(
    val imageRes: Int,
    val title: String,
    val description: String,
    val attractions: List<Attraction>
)

data class Attraction(
    val name: String,
    val description: String,
    val iconRes:Int
)

val sampleTour = TourInfo(
    imageRes = R.drawable.tourpage, // Use a valid drawable resource for preview
    title = "Nordic Cottage",
    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
    attractions = listOf(
        Attraction("Attraction 1", "Description of Attraction 1", R.drawable.globe),
        Attraction("Attraction 2", "Description of Attraction 2", R.drawable.globe),
        Attraction("Attraction 3", "Description of Attraction 3", R.drawable.globe)
    )
)