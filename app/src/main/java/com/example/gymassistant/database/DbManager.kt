package com.example.gymassistant.database

import android.content.Context
import androidx.room.Room

class DbManager {
    @Volatile
    private var dbInstance: AppDatabase? = null

    fun getInstance(context: Context): AppDatabase {
        // Double-checked locking to ensure thread safety
        return dbInstance ?: synchronized(this) {
            dbInstance ?: Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "database-name"
            ).build().also { dbInstance = it }
        }
    }
}