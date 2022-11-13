package com.hana897trx.repository.core.anime

import com.hana897trx.lib.share.data.anime.DataModel
import com.hana897trx.lib.share.data.anime.DataType
import com.hana897trx.lib.share.utils.DataState

interface AnimeRepository {
    suspend fun getAnime(litMin: Int) : DataState<List<DataModel>>
}