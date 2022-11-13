package com.hana897trx.lib.share.utils

sealed class DataState<out T> {
    data class Error(val errorCode: Int = -1, val errorMessage: String = String()) : DataState<Nothing>()
    data class Success<out T>(val data: T) :  DataState<T>()
    object Loading: DataState<Nothing>()
}