package com.hana897trx.eclipseanimex.ui.home.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.hana897trx.eclipseanimex.databinding.AnimeRowBinding
import com.hana897trx.eclipseanimex.ui.home.event.AnimeHomeTileEvent
import com.hana897trx.eclipseanimex.ui.home.viewHolder.ContentRowVH
import com.hana897trx.lib.share.data.dataTile.DataTile

class HomeAdapter : ListAdapter<DataTile<Any>, RecyclerView.ViewHolder>(DiffUtilItem()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType) {
            HOME_TILE -> ContentRowVH(
                AnimeRowBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
            )
            else -> super.createViewHolder(parent, viewType)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is ContentRowVH -> holder.bind(getItem(position))
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when(getItem(position)) {
            is AnimeHomeTileEvent -> {
                HOME_TILE
            }
            else -> NULL
        }
    }

    private companion object {
        const val HOME_TILE = 1
        const val NULL = 0
    }

    private class DiffUtilItem : DiffUtil.ItemCallback<DataTile<Any>>() {
        override fun areItemsTheSame(oldItem: DataTile<Any>, newItem: DataTile<Any>): Boolean =
            oldItem.toString() === newItem.toString()

        @SuppressLint("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: DataTile<Any>, newItem: DataTile<Any>): Boolean =
            oldItem == newItem
    }
}