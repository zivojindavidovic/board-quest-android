package com.boardquest.data.repository

import com.boardquest.domain.Game

class HomeRepository {
    fun getGames(): List<Game> {
        return listOf(
            Game(id = 1, name = "Šah", category = "Strategija", minPlayers = 2, maxPlayers = 2),
            Game(id = 2, name = "Monopol", category = "Porodično", minPlayers = 2, maxPlayers = 8),
            Game(id = 3, name = "Catan", category = "Strategija", minPlayers = 3, maxPlayers = 4),
            Game(id = 4, name = "Uno", category = "Kartaška", minPlayers = 2, maxPlayers = 10),
            Game(id = 5, name = "Risk", category = "Strategija", minPlayers = 2, maxPlayers = 6)
        )
    }
}