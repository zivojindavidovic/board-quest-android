package com.boardquest.data.remote.dto

import com.google.gson.annotations.SerializedName

data class GameDto(
    @SerializedName("id") val id: String,
    @SerializedName("title") val title: String,
    @SerializedName("description") val description: String,
    @SerializedName("min_players") val minPlayers: Int,
    @SerializedName("max_players") val maxPlayers: Int,
    @SerializedName("play_time_minutes") val playTimeMinutes: Int,
    @SerializedName("year_published") val yearPublished: Int,
    @SerializedName("image_url") val imageUrl: String,
    @SerializedName("avg_rating") val avgRating: String,
    @SerializedName("rating_count") val ratingCount: Int
)
