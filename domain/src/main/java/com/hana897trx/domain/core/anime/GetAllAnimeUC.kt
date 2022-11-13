package com.hana897trx.domain.core.anime

import com.hana897trx.lib.share.data.anime.DataModel
import com.hana897trx.lib.share.utils.DataState
import com.hana897trx.repository.core.anime.AnimeRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class GetAllAnimeUC @Inject constructor(
    private val animeRepository: AnimeRepository
){
    operator fun invoke(limMin: Int) = flow<DataState<List<DataModel>>> {
        emit(DataState.Loading)
        try {
            emit(animeRepository.getAnime(limMin))
        } catch (e: Exception) {
            emit(DataState.Error(errorMessage = e.message.orEmpty()))
        }
    }.flowOn(Dispatchers.IO)
}