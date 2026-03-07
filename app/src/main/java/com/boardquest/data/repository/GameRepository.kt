package com.boardquest.data.repository

import com.boardquest.data.remote.RetrofitInstance
import com.boardquest.domain.Game

data class GamesPage(
    val games: List<Game>,
    val hasNextPage: Boolean
)

data class HomePage(
    val games: List<Game>
)

class GameRepository {
    private val api = RetrofitInstance.gameApi

    suspend fun getGames(page: Int = 1, perPage: Int = 10): GamesPage {
        val response = api.getGames(page = page, perPage = perPage)
        return GamesPage(
            games = response.data.map { dto ->
                Game(
                    id = dto.id,
                    name = dto.title,
                    description = dto.description,
                    rating = dto.avgRating.toDoubleOrNull() ?: 0.0,
                    ratingCount = dto.ratingCount,
                    minPlayers = dto.minPlayers,
                    maxPlayers = dto.maxPlayers,
                    playTimeMinutes = dto.playTimeMinutes,
                    yearPublished = dto.yearPublished,
                    imageUrl = dto.imageUrl
                )
            },
            hasNextPage = response.meta.currentPage < response.meta.lastPage
        )
    }
}
