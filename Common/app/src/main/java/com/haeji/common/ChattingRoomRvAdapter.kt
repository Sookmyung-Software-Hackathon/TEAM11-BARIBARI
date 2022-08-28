package com.haeji.common

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ChattingRoomRvAdapter(private val context : Context) : RecyclerView.Adapter<ChattingRoomRvAdapter.ViewHolder>() {

    var datas = mutableListOf<ChattingData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.chattingroom_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindDatas(datas[position])
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val user1_name : TextView = itemView.findViewById(R.id.user1_name)
        private val user1_chat : TextView = itemView.findViewById(R.id.user1_chat)
        private val user1_img : ImageView = itemView.findViewById(R.id.user1_img)

        private val user2_chat : TextView = itemView.findViewById(R.id.user2_chat)


        fun bindDatas(item: ChattingData) {
            user1_name.text = item.name
            user1_chat.text = item.chat
            Glide.with(itemView).load(item.img).into(user1_img)
            user2_chat.text = item.chat

        }
    }

    override fun getItemCount(): Int = datas.size
}