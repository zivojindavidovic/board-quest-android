package com.boardquest.data.repository

import com.boardquest.domain.Game

class HomeRepository {
    fun getPopularGames(): List<Game> {
        return listOf(
            Game(
                id = "1",
                name = "Šah",
                minPlayers = 2,
                maxPlayers = 2,
                rating = 3.5,
                ratingCount = 0,
                playTimeMinutes = 60,
                yearPublished = 0,
                description = "Opis igrice",
                imageUrl = "https://cdn.mobygames.com/covers/7806161-catan-universe-nintendo-switch-front-cover.jpg"
            ),
            Game(
                id = "2",
                name = "Monopol",
                minPlayers = 2,
                maxPlayers = 8,
                rating = 3.5,
                ratingCount = 0,
                playTimeMinutes = 120,
                yearPublished = 0,
                description = "Opis igrice",
                imageUrl = "https://cdn.mobygames.com/covers/7806161-catan-universe-nintendo-switch-front-cover.jpg"
            ),
            Game(
                id = "3",
                name = "Catan",
                minPlayers = 3,
                maxPlayers = 4,
                rating = 3.5,
                ratingCount = 0,
                playTimeMinutes = 90,
                yearPublished = 0,
                description = "Opis igrice",
                imageUrl = "https://cdn.mobygames.com/covers/7806161-catan-universe-nintendo-switch-front-cover.jpg"
            )
        )
    }
}
