package com.hana897trx.lib.share.data.anime

data class AnimeData (
    override val id: String,
    override val title: String,
    override val subTitle: String,
    override val description: String,
    override val coverUrl: String,
    override val extendedCoverUrl: String,
    override val dataType : String
) : DataModel