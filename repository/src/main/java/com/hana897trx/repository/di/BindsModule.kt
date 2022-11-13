package com.hana897trx.repository.di

import com.hana897trx.repository.core.anime.AnimeRepository
import com.hana897trx.repository.core.anime.AnimeRepositoryI
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class BindsModule {
    @Binds
    abstract fun getAnimeRepository(
        impl: AnimeRepositoryI
    ) : AnimeRepository
}