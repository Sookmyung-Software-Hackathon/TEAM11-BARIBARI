package com.haeji.common

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PlaylistRVAdapter(val items : MutableList<String>) : RecyclerView.Adapter<PlaylistRVAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistRVAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.playlist_item,parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlaylistRVAdapter.ViewHolder, position: Int) {
        holder.bindItems(items[position])
    }
    // 전체 리사이클러뷰의 개수
    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(item : String) {

        }
    }

}