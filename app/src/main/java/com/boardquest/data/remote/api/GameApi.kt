package com.boardquest.data.remote.api

import com.boardquest.data.remote.dto.GamesResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface GameApi {
    @GET("games")
    suspend fun getGames(
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): GamesResponseDto
}
