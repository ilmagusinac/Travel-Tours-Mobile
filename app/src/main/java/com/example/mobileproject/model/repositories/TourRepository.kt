package com.example.mobileproject.model.repositories



import android.os.Build
import androidx.annotation.RequiresApi
import com.example.mobileproject.model.daos.ToursDao
import com.example.mobileproject.model.daos.UsersDao
import com.example.mobileproject.model.models.Tours
import com.example.mobileproject.model.models.Users
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.map
import androidx.room.Dao
import androidx.room.Query
import com.example.mobileproject.model.models.Reservations
import com.example.mobileproject.model.models.toTour
import kotlinx.coroutines.flow.flatMapConcat
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class TourRepository(private val toursDao: ToursDao): BaseRepository<Tours> {
    override suspend fun insert(t: Tours) = toursDao.insert(t)

    override suspend fun update(t: Tours) = toursDao.update(t)

    override suspend fun delete(t: Tours) = toursDao.delete(t)

    override fun getOneStream(id: Int): Flow<Tours?> = toursDao.getTour(id)

    fun getReservations(id: Int) = toursDao.getReservations(id)
    fun deleteAll() = toursDao.deleteAll()
    fun getTourAttraction(id: Int) = toursDao.getTourAttraction(id)

    fun getAllTours(): Flow<List<Tours>> = toursDao.getAllTours()
    fun getUserBookedTours(userId: Int): Flow<List<Tours>> {
        return toursDao.getUserBookedTours(userId).flatMapConcat { reservations ->
            getAllTours().map { tours ->
                reservations.mapNotNull { reservation -> reservation.toTour(tours) }
            }
        }
    }
    fun getUserPreviousTours(userId: Int): Flow<List<Tours>> {
        return toursDao.getUserBookedTours(userId).flatMapConcat { reservations ->
            toursDao.getPreviousTours().map { tours ->
                reservations.mapNotNull { reservation -> reservation.toTour(tours) }
            }
        }
    }
}
