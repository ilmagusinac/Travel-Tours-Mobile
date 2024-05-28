package com.example.mobileproject.model.repositories



import com.example.mobileproject.model.daos.AttractionsDao
import com.example.mobileproject.model.daos.ToursDao
import com.example.mobileproject.model.daos.UsersDao
import com.example.mobileproject.model.models.Attractions
import com.example.mobileproject.model.models.Tours
import com.example.mobileproject.model.models.Users
import kotlinx.coroutines.flow.Flow

class AttractionRepository(private val attractionsDao: AttractionsDao): BaseRepository<Attractions> {
    override suspend fun insert(t: Attractions) = attractionsDao.insert(t)

    override suspend fun update(t: Attractions) = attractionsDao.update(t)

    override suspend fun delete(t: Attractions) = attractionsDao.delete(t)

    override fun getOneStream(id: Int): Flow<Attractions?> = attractionsDao.getTour(id)

    fun getTourAttraction(id: Int) = attractionsDao.getTourAttraction(id)
}
