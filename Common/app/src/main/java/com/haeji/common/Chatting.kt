package com.haeji.common

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView

class Chatting : AppCompatActivity() {

    lateinit var chattingRvAdapter: ChattingRvAdapter
    val datas = mutableListOf<ChatData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chatting)

        initRecycler()
    }

    private fun initRecycler(){
        chattingRvAdapter = ChattingRvAdapter(this)
        val chattingRv = findViewById<RecyclerView>(R.id.chattingRV)
       chattingRv.adapter = chattingRvAdapter

        datas.apply {
            add(ChatData(img = R.drawable.album, who = "바리스타", chat = "안녕하세요"))
            add(ChatData(img = R.drawable.album, who = "하릐리", chat = "안녕안녕"))
            add(ChatData(img = R.drawable.album, who = "지니", chat = "ㅋㅋㅋㅋㅋㅋㅋ"))
            add(ChatData(img = R.drawable.album, who = "미뇽", chat = "ㅎㅇ"))

            chattingRvAdapter.datas = datas
            chattingRvAdapter.notifyDataSetChanged()


        }
        Log.d("데이터",datas.toString())
    }
}