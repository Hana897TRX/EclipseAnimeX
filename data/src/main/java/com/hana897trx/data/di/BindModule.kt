package com.hana897trx.data.di

import com.hana897trx.data.core.anime.AnimeRemoteDS
import com.hana897trx.data.core.anime.AnimeRemoteDSI
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class BindModule {
    @Binds
    abstract fun provideAnimeRemoteDS(
        imp: AnimeRemoteDSI
    ) : AnimeRemoteDS
}