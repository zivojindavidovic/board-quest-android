package com.boardquest.data.repository

import com.boardquest.domain.Game

class HomeRepository {
    fun getGames(): List<Game> {
        return listOf(
            Game(
                id = 1,
                name = "Šah",
                category = "Strategija",
                minPlayers = 2,
                maxPlayers = 2,
                rating = 3.5,
                description = "Opis igrice"
            ),
            Game(
                id = 2,
                name = "Monopol",
                category = "Porodično",
                minPlayers = 2,
                maxPlayers = 8,
                rating = 3.5,
                description = "Opis igrice"
            ),
            Game(
                id = 3,
                name = "Catan",
                category = "Strategija",
                minPlayers = 3,
                maxPlayers = 4,
                rating = 3.5,
                description = "Opis igrice"
            )
        )
    }
}