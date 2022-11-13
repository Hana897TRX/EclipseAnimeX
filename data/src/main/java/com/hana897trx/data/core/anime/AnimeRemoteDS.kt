package com.hana897trx.data.core.anime

import com.hana897trx.lib.share.data.anime.DataModel
import com.hana897trx.lib.share.utils.DataState

interface AnimeRemoteDS {
    suspend fun getAnime(litMin: Int) : DataState<List<DataModel>>
}