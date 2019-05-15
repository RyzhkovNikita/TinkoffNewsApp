package com.aura.project.tinkoffnewsapp.room

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class News(@PrimaryKey
                var id: Int,
                var title: String,
                var publicationDate: Long)