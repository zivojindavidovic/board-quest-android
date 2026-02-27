package com.boardquest.domain

data class Game(
    val id: Int,
    val name: String,
    val category: String,
    val minPlayers: Int,
    val maxPlayers: Int,
    val imageUrl: String = "https://cdn.mobygames.com/covers/7806161-catan-universe-nintendo-switch-front-cover.jpg"
)