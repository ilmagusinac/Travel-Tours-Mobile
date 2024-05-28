package com.example.mobileproject.model

import android.content.Context
import com.example.mobileproject.model.repositories.AttractionRepository
import com.example.mobileproject.model.repositories.ReservationRepository
import com.example.mobileproject.model.repositories.TourAttractionRepository
import com.example.mobileproject.model.repositories.TourRepository
import com.example.mobileproject.model.repositories.UserRepository

interface AppContainer {
    val userRepository: UserRepository
    val tourRepository: TourRepository
    val attractionRepository: AttractionRepository
    val reservationRepository: ReservationRepository
    val tourAttractionRepository: TourAttractionRepository
}
class AppDataContainer(private val context: Context): AppContainer {


    override val userRepository: UserRepository by lazy {
        UserRepository(UserDatabase.getDatabase(context).userDao())
    }


    override val tourRepository: TourRepository by lazy {
        TourRepository(UserDatabase.getDatabase(context).tourDao())
    }


    override val attractionRepository: AttractionRepository by lazy {
        AttractionRepository(UserDatabase.getDatabase(context).attractionDao())
    }

    override val reservationRepository: ReservationRepository by lazy {
        ReservationRepository(UserDatabase.getDatabase(context).reservationDao())
    }

    override val tourAttractionRepository: TourAttractionRepository by lazy {
        TourAttractionRepository(UserDatabase.getDatabase(context).tourAttractionDao())
    }
}