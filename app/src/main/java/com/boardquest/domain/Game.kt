package com.boardquest.domain

data class Game(
    val id: Int,
    val name: String,
    val category: String,
    val minPlayers: Int,
    val maxPlayers: Int
)