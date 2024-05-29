package com.example.mobileproject

import android.app.Application
import com.example.mobileproject.model.AppContainer
import com.example.mobileproject.model.AppDataContainer


class UserApplication: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}
