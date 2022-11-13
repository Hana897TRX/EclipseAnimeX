package com.hana897trx.eclipseanimex.ui.home.event

import com.hana897trx.lib.share.data.dataTile.NewsDataTile

sealed class AnimeHomeTileEvent {
    data class Error(val errorCode: Int = -1, val errorMessage: String = String()) : AnimeHomeTileEvent()
    data class Success(val data: NewsDataTile) :  AnimeHomeTileEvent()
    object Loading: AnimeHomeTileEvent()
}