package com.example.gymassistant.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "exercise")
data class ExerciseEntity(
    @PrimaryKey val id: Int,
    val name: String?,
)