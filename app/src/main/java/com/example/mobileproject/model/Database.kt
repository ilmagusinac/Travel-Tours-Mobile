package com.example.mobileproject.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mobileproject.model.daos.UsersDao
import com.example.mobileproject.model.daos.ToursDao
import com.example.mobileproject.model.daos.AttractionsDao
import com.example.mobileproject.model.daos.ReservationsDao
import com.example.mobileproject.model.daos.TourAttractionDao
import com.example.mobileproject.model.models.Users
import com.example.mobileproject.model.models.Tours
import com.example.mobileproject.model.models.Attractions
import com.example.mobileproject.model.models.Reservations
import com.example.mobileproject.model.models.TourAttraction


@Database(entities = [Users::class, Tours::class, Attractions::class, TourAttraction::class, Reservations::class], version = 1, exportSchema = false)
abstract class UserDatabase: RoomDatabase() {
    abstract fun userDao(): UsersDao
    abstract fun tourDao(): ToursDao
    abstract fun attractionDao(): AttractionsDao

    companion object{
        @Volatile
        private var Instance: UserDatabase? = null

        fun getDatabase(context: Context): UserDatabase {
            // if the Instance is not null, return it, otherwise create a new database instance.
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, UserDatabase::class.java, "UserAPPDatabase")
                    .build().also { Instance = it }
            }
        }

    }
}