package com.boardquest.data.remote

import com.boardquest.data.remote.api.GameApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val BASE_URL = "https://board-quest-backend-production.up.railway.app/api/v1/"

    val gameApi: GameApi by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(GameApi::class.java)
    }
}
