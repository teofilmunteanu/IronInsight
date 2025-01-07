package com.example.gymassistant.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.gymassistant.database.daos.ExerciseDAO
import com.example.gymassistant.entities.ExerciseEntity

@Database(entities = [ExerciseEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun exerciseDao(): ExerciseDAO
}