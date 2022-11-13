package com.hana897trx.data.core.anime

import com.google.firebase.firestore.FirebaseFirestore
import com.hana897trx.lib.share.data.anime.*
import com.hana897trx.lib.share.utils.DataState
import javax.inject.Inject
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class AnimeRemoteDSI @Inject constructor(
    private val fb: FirebaseFirestore
): AnimeRemoteDS {
    override suspend fun getAnime(litMin: Int) : DataState<List<DataModel>> = suspendCoroutine<DataState<List<DataModel>>> {
        fb.collection("anime")
            .get()
            .addOnSuccessListener { snapshot ->
                val data: List<DataModel> = snapshot.documents.map { doc ->
                    AnimeResponse(
                        id = doc["id"].toString(),
                        title = doc["title"].toString(),
                        subTitle = doc["subTitle"].toString(),
                        description = doc["description"].toString(),
                        coverUrl = doc["docverUrl"].toString(),
                        extendedCoverUrl = doc["extendedCoverUrl"].toString(),
                        dataType = doc["dataType"].toString()
                    )
                }
                it.resume(DataState.Success(data))
            }
            .addOnFailureListener{ e ->
                it.resume(DataState.Error(errorMessage = e.message.orEmpty()))
            }
    }

    private fun getAnimeMuckUp() : DataState<List<DataModel>> {
        val list = listOf(
            AnimeData(
                id = "1",
                title = "Demon Slayer",
                subTitle = "Kimetsu no Yaiba",
                description = "Estamos en la era Taisho de Japón. Tanjiro, un joven que se gana la vida vendiendo carbón, descubre un día que su familia ha sido asesinada por un demonio. Para empeorar las cosas, su hermana menor Nezuko, la única superviviente de la masacre, ha sufrido una transformación en demonio.",
                coverUrl = "https://www.crunchyroll.com/imgsrv/display/thumbnail/60x90/catalog/crunchyroll/d48d4a62b0ac6381c87bd040b69b0a89.jpe",
                extendedCoverUrl = "https://www.crunchyroll.com/imgsrv/display/thumbnail/640x360/catalog/crunchyroll/f7adcedd1d7c53ae18d851003a3cfae4.jpe",
                dataType = DataType.ANIME.name
            ),
            AnimeData(
                id = "2",
                title = "Demon Slayer",
                subTitle = "Kimetsu no Yaiba",
                description = "Estamos en la era Taisho de Japón. Tanjiro, un joven que se gana la vida vendiendo carbón, descubre un día que su familia ha sido asesinada por un demonio. Para empeorar las cosas, su hermana menor Nezuko, la única superviviente de la masacre, ha sufrido una transformación en demonio.",
                coverUrl = "https://www.crunchyroll.com/imgsrv/display/thumbnail/60x90/catalog/crunchyroll/d48d4a62b0ac6381c87bd040b69b0a89.jpe",
                extendedCoverUrl = "https://www.crunchyroll.com/imgsrv/display/thumbnail/640x360/catalog/crunchyroll/f7adcedd1d7c53ae18d851003a3cfae4.jpe",
                dataType = DataType.ANIME.name
            ),
            AnimeData(
                id = "3",
                title = "Demon Slayer",
                subTitle = "Kimetsu no Yaiba",
                description = "Estamos en la era Taisho de Japón. Tanjiro, un joven que se gana la vida vendiendo carbón, descubre un día que su familia ha sido asesinada por un demonio. Para empeorar las cosas, su hermana menor Nezuko, la única superviviente de la masacre, ha sufrido una transformación en demonio.",
                coverUrl = "https://www.crunchyroll.com/imgsrv/display/thumbnail/60x90/catalog/crunchyroll/d48d4a62b0ac6381c87bd040b69b0a89.jpe",
                extendedCoverUrl = "https://www.crunchyroll.com/imgsrv/display/thumbnail/640x360/catalog/crunchyroll/f7adcedd1d7c53ae18d851003a3cfae4.jpe",
                dataType = DataType.ANIME.name
            ),
            AnimeData(
                id = "4",
                title = "Demon Slayer",
                subTitle = "Kimetsu no Yaiba",
                description = "Estamos en la era Taisho de Japón. Tanjiro, un joven que se gana la vida vendiendo carbón, descubre un día que su familia ha sido asesinada por un demonio. Para empeorar las cosas, su hermana menor Nezuko, la única superviviente de la masacre, ha sufrido una transformación en demonio.",
                coverUrl = "https://www.crunchyroll.com/imgsrv/display/thumbnail/60x90/catalog/crunchyroll/d48d4a62b0ac6381c87bd040b69b0a89.jpe",
                extendedCoverUrl = "https://www.crunchyroll.com/imgsrv/display/thumbnail/640x360/catalog/crunchyroll/f7adcedd1d7c53ae18d851003a3cfae4.jpe",
                dataType = DataType.ANIME.name
            ),
            AnimeData(
                id = "5",
                title = "Demon Slayer",
                subTitle = "Kimetsu no Yaiba",
                description = "Estamos en la era Taisho de Japón. Tanjiro, un joven que se gana la vida vendiendo carbón, descubre un día que su familia ha sido asesinada por un demonio. Para empeorar las cosas, su hermana menor Nezuko, la única superviviente de la masacre, ha sufrido una transformación en demonio.",
                coverUrl = "https://www.crunchyroll.com/imgsrv/display/thumbnail/60x90/catalog/crunchyroll/d48d4a62b0ac6381c87bd040b69b0a89.jpe",
                extendedCoverUrl = "https://www.crunchyroll.com/imgsrv/display/thumbnail/640x360/catalog/crunchyroll/f7adcedd1d7c53ae18d851003a3cfae4.jpe",
                dataType = DataType.ANIME.name
            ),
            AnimeData(
                id = "6",
                title = "Demon Slayer",
                subTitle = "Kimetsu no Yaiba",
                description = "Estamos en la era Taisho de Japón. Tanjiro, un joven que se gana la vida vendiendo carbón, descubre un día que su familia ha sido asesinada por un demonio. Para empeorar las cosas, su hermana menor Nezuko, la única superviviente de la masacre, ha sufrido una transformación en demonio.",
                coverUrl = "https://www.crunchyroll.com/imgsrv/display/thumbnail/60x90/catalog/crunchyroll/d48d4a62b0ac6381c87bd040b69b0a89.jpe",
                extendedCoverUrl = "https://www.crunchyroll.com/imgsrv/display/thumbnail/640x360/catalog/crunchyroll/f7adcedd1d7c53ae18d851003a3cfae4.jpe",
                dataType = DataType.ANIME.name
            )
        )

        return DataState.Success(list)
    }
}