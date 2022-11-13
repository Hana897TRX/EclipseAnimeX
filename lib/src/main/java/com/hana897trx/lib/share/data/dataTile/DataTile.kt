package com.hana897trx.lib.share.data.dataTile

interface DataTile<T> {
    val title: String
    val list: List<T>
}