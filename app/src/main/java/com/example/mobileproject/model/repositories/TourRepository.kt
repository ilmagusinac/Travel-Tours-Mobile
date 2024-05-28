package com.example.mobileproject.model.repositories



import com.example.mobileproject.model.daos.ToursDao
import com.example.mobileproject.model.daos.UsersDao
import com.example.mobileproject.model.models.Tours
import com.example.mobileproject.model.models.Users
import kotlinx.coroutines.flow.Flow

class TourRepository(private val toursDao: ToursDao): BaseRepository<Tours> {
    override suspend fun insert(t: Tours) = toursDao.insert(t)

    override suspend fun update(t: Tours) = toursDao.update(t)

    override suspend fun delete(t: Tours) = toursDao.delete(t)

    override fun getOneStream(id: Int): Flow<Tours?> = toursDao.getTour(id)

    fun getReservations(id: Int) = toursDao.getReservations(id)
    fun getTourAttraction(id: Int) = toursDao.getTourAttraction(id)
}
