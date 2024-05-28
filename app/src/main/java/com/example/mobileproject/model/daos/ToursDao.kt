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
interface ToursDao{
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(tour: Tours)

    @Update
    suspend fun update(tour: Tours)

    @Delete
    suspend fun delete(tour: Tours)

    @Query("SELECT * FROM Tours WHERE id = :id")
    fun getTour(id: Int): Flow<Tours>

    @Query("SELECT * FROM Reservations " +
            "JOIN Tours ON Tours.id = Reservations.tour_id " +
            "WHERE Tours.id = :id")
    fun getReservations(id: Int): Flow<List<Reservations>>

    @Query("SELECT * FROM TourAttraction " +
            "JOIN Tours ON Tours.id = TourAttraction.tour_id " +
            "WHERE Tours.id = :id")
    fun getTourAttraction(id: Int): Flow<List<TourAttraction>>
}