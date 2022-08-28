package com.haeji.common

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MyPage : AppCompatActivity() {

    lateinit var musicRvAdapter: MusicRvAdapter
    val datas = mutableListOf<MusicData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_page)

        val nickname : TextView = findViewById(R.id.nickname)
        val generation : TextView = findViewById(R.id.generation_value)
        val common : TextView = findViewById(R.id.common_value)

        nickname.text = "바리바리스타"
        generation.text = "X"
        common.text = "70"

        initRecycler()

    }

    private fun initRecycler(){
        musicRvAdapter = MusicRvAdapter(this)
        val musicRv = findViewById<RecyclerView>(R.id.MusicRV)
        musicRv.adapter = musicRvAdapter

        datas.apply {
            add(MusicData(title = "베로니카의 섬"))
            add(MusicData(title = "still sunset"))
            add(MusicData(title = "난춘"))
            add(MusicData(title = "wonderwall"))


            musicRvAdapter.datas = datas
            musicRvAdapter.notifyDataSetChanged()


        }
        Log.d("데이터",datas.toString())
    }
}