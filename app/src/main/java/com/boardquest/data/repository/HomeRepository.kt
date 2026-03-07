package com.boardquest.data.repository

import com.boardquest.data.remote.RetrofitInstance
import com.boardquest.domain.Game

class HomeRepository {
    private val api = RetrofitInstance.gameApi

    suspend fun getPopularGames(page: Int, perPage: Int): HomePage {
        val response = api.getGames(page = page, perPage = perPage)
        return HomePage(
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
            }
        )
    }
}
