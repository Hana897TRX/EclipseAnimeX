package com.hana897trx.data.core.anime

import com.google.firebase.firestore.FirebaseFirestore
import com.hana897trx.lib.share.data.anime.AnimeModel
import com.hana897trx.lib.share.data.anime.DataModel
import com.hana897trx.lib.share.utils.DataState
import javax.inject.Inject
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class AnimeRemoteDSI @Inject constructor(
    private val fb: FirebaseFirestore
): AnimeRemoteDS {
    override suspend fun getAnime(litMin: Int) : DataState<List<DataModel>> = suspendCoroutine<DataState<List<DataModel>>> {
        fb.collection("anime")
            .startAt(litMin)
            .endAt(litMin + com.hana897trx.lib.share.utils.Utils.LIMIT)
            .get()
            .addOnSuccessListener { snapshot ->
                val data: List<DataModel> = snapshot.documents.map { doc ->
                    AnimeModel(
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
}