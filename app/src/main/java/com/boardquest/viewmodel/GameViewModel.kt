package com.boardquest.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.boardquest.data.repository.GameRepository
import com.boardquest.domain.Game
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class GameViewModel(
    private val repository: GameRepository = GameRepository()
) : ViewModel() {

    private val _uiState = MutableStateFlow(GameUiState())
    val uiState: StateFlow<GameUiState> = _uiState.asStateFlow()

    private var currentPage = 1

    init {
        loadGames()
    }

    private fun loadGames() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, error = null) }
            try {
                val result = repository.getGames(page = 1, perPage = 10)
                currentPage = 1
                _uiState.update {
                    it.copy(isLoading = false, games = result.games, hasMorePages = result.hasNextPage)
                }
            } catch (e: Exception) {
                _uiState.update { it.copy(isLoading = false, error = e.message) }
            }
        }
    }

    fun loadMore() {
        if (_uiState.value.isLoadingMore || !_uiState.value.hasMorePages) return
        viewModelScope.launch {
            _uiState.update { it.copy(isLoadingMore = true) }
            try {
                val result = repository.getGames(page = currentPage + 1, perPage = 10)
                currentPage++
                _uiState.update {
                    it.copy(
                        isLoadingMore = false,
                        games = it.games + result.games,
                        hasMorePages = result.hasNextPage
                    )
                }
            } catch (e: Exception) {
                _uiState.update { it.copy(isLoadingMore = false, error = e.message) }
            }
        }
    }
}

data class GameUiState(
    val isLoading: Boolean = false,
    val isLoadingMore: Boolean = false,
    val games: List<Game> = emptyList(),
    val hasMorePages: Boolean = true,
    val error: String? = null
)
