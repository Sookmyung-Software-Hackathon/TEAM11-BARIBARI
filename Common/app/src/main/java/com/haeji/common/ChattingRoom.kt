package com.haeji.common

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView

class ChattingRoom : AppCompatActivity() {
    lateinit var chattingRoomRvAdapter: ChattingRoomRvAdapter
    val datas = mutableListOf<ChattingData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chatting_room)

        initRecycler()
    }

    private fun initRecycler(){
        chattingRoomRvAdapter = ChattingRoomRvAdapter(this)
        val chattingRoomRv = findViewById<RecyclerView>(R.id.chattingRoomRV)
        chattingRoomRv.adapter = chattingRoomRvAdapter

        datas.apply {
            add(ChattingData(img = R.drawable.album, name = "바리스타", chat = "안녕하세요"))
            add(ChattingData(img = R.drawable.album, name = "바리스타2", chat = "안녕하세요"))
            add(ChattingData(img = R.drawable.album, name = "바리스타3", chat = "안녕하세요"))


            chattingRoomRvAdapter.datas = datas
            chattingRoomRvAdapter.notifyDataSetChanged()


        }
        Log.d("데이터",datas.toString())
    }
}