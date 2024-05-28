package com.example.mobileproject.model

import android.content.Context
import com.example.mobileproject.model.repositories.AttractionRepository
import com.example.mobileproject.model.repositories.TourRepository
import com.example.mobileproject.model.repositories.UserRepository

interface AppContainer {
    val userRepository: UserRepository
    val tourRepository: TourRepository
    val attractionRepository: AttractionRepository
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
}