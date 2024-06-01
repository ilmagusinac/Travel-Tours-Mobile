package com.example.mobileproject.model.daos


import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.mobileproject.model.models.Attractions
import com.example.mobileproject.model.models.Reservations
import com.example.mobileproject.model.models.TourAttraction
import com.example.mobileproject.model.models.Tours
import kotlinx.coroutines.flow.Flow

@Dao
interface AttractionsDao{
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(attraction: Attractions)

    @Update
    suspend fun update(attraction: Attractions)

    @Delete
    suspend fun delete(attraction: Attractions)
    @Query("SELECT * FROM Attractions WHERE id = :id")
    fun getAttraction(id: Int): Flow<Attractions>

    @Query("SELECT * FROM TourAttraction " +
            "JOIN Attractions ON Attractions.id = TourAttraction.attraction_id " +
            "WHERE Attractions.id = :id")
    fun getTourAttraction(id: Int): Flow<List<TourAttraction>>


}