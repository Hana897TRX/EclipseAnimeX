package com.hana897trx.repository.core.anime

import com.hana897trx.data.core.anime.AnimeRemoteDS
import com.hana897trx.lib.share.data.anime.DataModel
import com.hana897trx.lib.share.utils.DataState
import com.hana897trx.repository.di.IsConnected
import javax.inject.Inject

class AnimeRepositoryI @Inject constructor(
    private val animeRemoteDS: AnimeRemoteDS,
    @IsConnected private val isConnected: Boolean
): AnimeRepository {
    override suspend fun getAnime(litMin: Int): DataState<List<DataModel>> {
        return if(isConnected) {
            animeRemoteDS.getAnime(litMin)
        } else {
            DataState.Success(emptyList())
        }
    }
}