package com.example.gymassistant.models

data class Exercise (
    val name: String,
    val groupsWorked: List<MuscleGroup>
)