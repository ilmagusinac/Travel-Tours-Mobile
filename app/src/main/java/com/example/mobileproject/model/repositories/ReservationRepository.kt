package com.example.mobileproject.model.repositories

import com.example.mobileproject.model.daos.ReservationsDao
import com.example.mobileproject.model.models.Reservations
import kotlinx.coroutines.flow.Flow

class ReservationRepository(private val reservationsDao: ReservationsDao): BaseRepository<Reservations> {
    override suspend fun insert(t: Reservations) = reservationsDao.insert(t)

    override suspend fun update(t: Reservations) = reservationsDao.update(t)

    override suspend fun delete(t: Reservations) = reservationsDao.delete(t)

    override fun getOneStream(id: Int): Flow<Reservations?> = reservationsDao.getReservation(id)

    fun getReservationByUserAndTour(userId: Int, tourId: Int): Flow<Reservations?> = reservationsDao.getReservationByUserAndTour(userId, tourId)

    suspend fun deleteByUserIdAndTourId(userId: Int, tourId: Int) {
        reservationsDao.deleteByUserIdAndTourId(userId, tourId)
    }
}
