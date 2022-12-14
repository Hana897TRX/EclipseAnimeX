package com.hana897trx.repository.di

import android.content.Context
import android.net.ConnectivityManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier

@Module
@InstallIn(SingletonComponent::class)
abstract class CoreDI {
    @IsConnected
    @Provides
    fun isConnected(ctx: Context) : Boolean {
        val cm : ConnectivityManager = ctx.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        return cm.activeNetworkInfo?.isConnected ?: false
    }
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class IsConnected