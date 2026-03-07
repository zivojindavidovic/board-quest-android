package com.boardquest.domain

data class Game(
    val id: String,
    val name: String,
    val description: String,
    val rating: Double,
    val ratingCount: Int,
    val minPlayers: Int,
    val maxPlayers: Int,
    val playTimeMinutes: Int,
    val yearPublished: Int,
    val imageUrl: String
)
