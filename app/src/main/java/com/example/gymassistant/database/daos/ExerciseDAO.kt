package com.example.gymassistant.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.gymassistant.entities.ExerciseEntity

@Dao
interface ExerciseDAO {
    @Query("SELECT * FROM exercise")
    fun getAll(): List<ExerciseEntity>

    @Query("SELECT * FROM exercise WHERE id IN (:exerciseIds)")
    fun loadAllByIds(exerciseIds: IntArray): List<ExerciseEntity>

    @Query("SELECT * FROM exercise WHERE name LIKE :name LIMIT 1")
    fun findByName(name: String): ExerciseEntity

    @Insert
    fun insertAll(vararg exercises: ExerciseEntity)

    @Delete
    fun delete(exercise: ExerciseEntity)
}