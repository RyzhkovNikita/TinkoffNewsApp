package com.aura.project.tinkoffnewsapp.room

import androidx.room.*

interface NewsDao {
    @Query("select * from news order by publicationDate desc")
    fun getAllNews():List<News>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(news:List<News>)
}