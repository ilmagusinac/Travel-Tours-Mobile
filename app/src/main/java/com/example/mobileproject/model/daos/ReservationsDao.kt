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
import kotlinx.coroutines.flow.Flow

@Dao
interface ReservationsDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(reservation: Reservations)

    @Update
    suspend fun update(reservation: Reservations)

    @Delete
    suspend fun delete(reservation: Reservations)

    @Query("SELECT * FROM Reservations WHERE id = :id")
    fun getReservation(id: Int): Flow<Reservations>

    @Query("SELECT * FROM Reservations WHERE user_id = :userId AND tour_id = :tourId")
    fun getReservationByUserAndTour(userId: Int, tourId: Int): Flow<Reservations?>

    @Query("DELETE FROM Reservations WHERE user_id = :userId AND tour_id = :tourId")
    suspend fun deleteByUserIdAndTourId(userId: Int, tourId: Int)
}
