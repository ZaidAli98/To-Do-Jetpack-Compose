package com.example.to_docompose.navigation

import com.example.to_docompose.util.Action
import kotlinx.serialization.Serializable

@Serializable
sealed class Screen {
    @Serializable
    data class List(val action: Action = Action.NO_ACTION): Screen()
    @Serializable
    data class Task(val id: Int): Screen()
}