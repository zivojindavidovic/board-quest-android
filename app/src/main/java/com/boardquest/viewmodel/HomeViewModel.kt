package com.boardquest.viewmodel

import androidx.lifecycle.ViewModel
import com.boardquest.data.repository.HomeRepository
import com.boardquest.domain.Game
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

@HiltViewModel
class HomeViewModel(
    private val repository: HomeRepository = HomeRepository()
) : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    init {
        loadGames()
    }

    private fun loadGames() {
        _uiState.update { it.copy(isLoading = true) }
        val games = repository.getGames()
        _uiState.update { it.copy(isLoading = false, games = games) }
    }
}

data class HomeUiState(
    val isLoading: Boolean = false,
    val games: List<Game> = emptyList(),
    val error: String? = null
)