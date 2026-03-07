package com.boardquest.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.boardquest.data.repository.HomeRepository
import com.boardquest.domain.Game
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

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
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true) }
            try {
                val result = repository.getPopularGames(page = 1, perPage = 3)
                _uiState.update { it.copy(isLoading = false, popularGames = result.games) }
            } catch (e: Exception) {
                _uiState.update { it.copy(isLoading = false, error = e.message) }
            }
        }
    }
}

data class HomeUiState(
    val isLoading: Boolean = false,
    val popularGames: List<Game> = emptyList(),
    val error: String? = null
)