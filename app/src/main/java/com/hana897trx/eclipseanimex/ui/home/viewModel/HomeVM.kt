package com.hana897trx.eclipseanimex.ui.home.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hana897trx.domain.core.anime.core.GetAllAnimeUC
import com.hana897trx.eclipseanimex.ui.home.event.AnimeHomeTileEvent
import com.hana897trx.lib.share.utils.DataState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class HomeVM @Inject constructor(
    private val getAllAnimeUC: GetAllAnimeUC
): ViewModel() {

    private var animePager = 0
    private var _animeState : MutableStateFlow<AnimeHomeTileEvent> = MutableStateFlow(AnimeHomeTileEvent.Loading)
    val animeState : StateFlow<AnimeHomeTileEvent> = _animeState

    init {
        getAllAnime(animePager)
    }

    fun getAllAnime(limMin: Int) {
        getAllAnimeUC().onEach { response ->
            when(response) {
                is DataState.Error -> _animeState.emit(AnimeHomeTileEvent.Error(errorCode = response.errorCode, errorMessage = response.errorMessage))
                is DataState.Loading -> _animeState.emit(AnimeHomeTileEvent.Loading)
                is DataState.Success -> _animeState.emit(
                    AnimeHomeTileEvent.Success(response.data)
                )
            }
        }.launchIn(viewModelScope)
    }
}