package com.boardquest.data.remote.dto

import com.google.gson.annotations.SerializedName

data class GamesResponseDto(
    @SerializedName("success") val success: Boolean,
    @SerializedName("data") val data: List<GameDto>,
    @SerializedName("meta") val meta: MetaDto
)

data class MetaDto(
    @SerializedName("current_page") val currentPage: Int,
    @SerializedName("last_page") val lastPage: Int
)
