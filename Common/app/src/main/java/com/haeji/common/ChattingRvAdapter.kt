package com.haeji.common

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ChattingRvAdapter(private val context : Context) : RecyclerView.Adapter<ChattingRvAdapter.ViewHolder>() {

    var datas = mutableListOf<ChatData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.chatting_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindDatas(datas[position])
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val who : TextView = itemView.findViewById(R.id.who)
        private val chat : TextView = itemView.findViewById(R.id.chat)
        private val profile : ImageView = itemView.findViewById(R.id.profile)

        fun bindDatas(item: ChatData) {
            who.text = item.who
            chat.text = item.chat
            Glide.with(itemView).load(item.img).into(profile)


        }
    }

    override fun getItemCount(): Int = datas.size
}