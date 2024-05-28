package com.example.mobileproject.model.repositories

import com.example.mobileproject.model.daos.TourAttractionDao
import com.example.mobileproject.model.models.TourAttraction
import kotlinx.coroutines.flow.Flow

class TourAttractionRepository(private val tourAttractionDao: TourAttractionDao): BaseRepository<TourAttraction> {
    override suspend fun insert(t: TourAttraction) = tourAttractionDao.insert(t)

    override suspend fun update(t: TourAttraction) = tourAttractionDao.update(t)

    override suspend fun delete(t: TourAttraction) = tourAttractionDao.delete(t)

    override fun getOneStream(id: Int): Flow<TourAttraction?> = tourAttractionDao.getTourAttraction(id)
}
