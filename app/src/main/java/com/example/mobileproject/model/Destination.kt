package com.example.mobileproject.model

import androidx.annotation.DrawableRes

data class Destination(
    val name: String,
    val destination: String,
    val date: String,
    val description: String,
    @DrawableRes var image: Int
)
