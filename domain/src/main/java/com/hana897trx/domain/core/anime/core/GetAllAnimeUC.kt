package com.hana897trx.domain.core.anime.core

import android.content.Context
import com.hana897trx.domain.R
import com.hana897trx.lib.share.data.anime.DataModel
import com.hana897trx.lib.share.data.dataTile.DataTile
import com.hana897trx.lib.share.data.dataTile.NewsDataTile
import com.hana897trx.lib.share.utils.DataState
import com.hana897trx.repository.core.anime.AnimeRepository
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class GetAllAnimeUC @Inject constructor(
    private val animeRepository: AnimeRepository,
    @ApplicationContext private val ctx: Context
) {
    operator fun invoke(limMin: Int) = flow {
        emit(DataState.Loading)
        try {
            emit(
                animeRepository.getAnime(limMin)
            )
        } catch (e: Exception) {
            emit(DataState.Error(errorMessage = e.message.orEmpty()))
        }
    }.flowOn(Dispatchers.IO)

    operator fun invoke() =
        flow<DataState<NewsDataTile>> {
            emit(DataState.Loading)
            try {
                when (val response = animeRepository.getAnime(0)) {
                    is DataState.Error -> {
                        emit(DataState.Error(response.errorCode, response.errorMessage))
                    }
                    is DataState.Loading -> {
                        emit(DataState.Loading)
                    }
                    is DataState.Success -> {
                        emit(
                            DataState.Success(
                                NewsDataTile(
                                    title = ctx.getString(R.string.news_tile_title),
                                    list = response.data
                                )
                            )
                        )
                    }
                }
            } catch (e: Exception) {
                emit(DataState.Error(errorMessage = e.message.orEmpty()))
            }
        }.flowOn(Dispatchers.IO)
}