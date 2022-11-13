package com.hana897trx.lib.share.data.dataTile

import com.hana897trx.lib.share.data.anime.DataModel

data class NewsDataTile(
    override val title: String,
    override val list: List<DataModel>
) : DataTile<DataModel>