package com.hana897trx.lib.share.data.anime

data class AnimeModel(
    override val id: String = String(),
    override val title: String = String(),
    override val subTitle: String = String(),
    override val description: String = String(),
    override val coverUrl: String = String(),
    override val extendedCoverUrl: String = String(),
    override val dataType: String = String()
): DataModel