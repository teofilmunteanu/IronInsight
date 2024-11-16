package com.example.gymassistant.constants

//data class MuscleGroup(val name: MajorGroups, val subgroups: Map<MajorGroups, MuscleGroup> = emptyMap())

enum class MuscleGroups(val displayName: String) {
    ARMS("Arms");

    override fun toString(): String = displayName

    enum class Arms(val displayName: String) {
        BICEPS("Biceps");

        open override fun toString(): String = displayName

        enum class Biceps(val displayName: String) {
            LongHead("Long Head Bicep"),
            ShortHead("Short Head Bicep");

            override fun toString(): String = displayName
        }
    }
}

fun main(){
    
}