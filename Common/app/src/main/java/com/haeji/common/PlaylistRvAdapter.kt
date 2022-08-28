package com.haeji.common

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PlaylistRvAdapter(private val context : Context) : RecyclerView.Adapter<PlaylistRvAdapter.ViewHolder>(){

    var datas = mutableListOf<AlbumData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.playlist_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindDatas(datas[position])
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val title : TextView = itemView.findViewById(R.id.title)
        private val singer : TextView = itemView.findViewById(R.id.singer)
        private val album : ImageView = itemView.findViewById(R.id.album)

        fun bindDatas(item: AlbumData) {
            title.text = item.title
            singer.text = item.singer
            Glide.with(itemView).load(item.img).into(album)


        }
    }

    override fun getItemCount(): Int = datas.size

}