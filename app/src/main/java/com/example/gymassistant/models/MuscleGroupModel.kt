package com.example.gymassistant.models

data class MuscleGroup (
    val name: String,
    val subgroups: List<MuscleGroup>?
)