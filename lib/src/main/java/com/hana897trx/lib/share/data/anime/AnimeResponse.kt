package com.hana897trx.lib.share.data.anime

data class AnimeResponse(
    override val id: String = String(),
    override val title: String = String(),
    override val subTitle: String = String(),
    override val description: String = String(),
    override val coverUrl: String = String(),
    override val extendedCoverUrl: String = String(),
    override val dataType: String = String(),
) : DataModel

fun List<AnimeResponse>.toAnimeData(): List<DataModel> =
    this.map {
        AnimeData(
            id = it.id,
            title = it.title,
            subTitle = it.subTitle,
            description = it.description,
            coverUrl = it.coverUrl,
            extendedCoverUrl = it.extendedCoverUrl,
            dataType = it.dataType
        )
    }
