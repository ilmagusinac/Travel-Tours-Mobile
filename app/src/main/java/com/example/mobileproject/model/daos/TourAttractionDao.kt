package com.example.mobileproject.model.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.mobileproject.model.models.Reservations
import com.example.mobileproject.model.models.TourAttraction
import com.example.mobileproject.model.models.Tours
import kotlinx.coroutines.flow.Flow

@Dao
interface TourAttractionDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(tourAttraction: TourAttraction)

    @Update
    suspend fun update(tourAttraction: TourAttraction)

    @Delete
    suspend fun delete(tourAttraction: TourAttraction)

    @Query("SELECT * FROM TourAttraction WHERE id = :id")
    fun getTourAttraction(id: Int): Flow<TourAttraction>
}