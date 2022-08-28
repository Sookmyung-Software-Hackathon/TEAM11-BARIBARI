package com.haeji.common

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Playlist2 : AppCompatActivity() {
    lateinit var playlistRvAdapter: PlaylistRvAdapter
    val datas = mutableListOf<AlbumData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playlist)

        val generation = findViewById<TextView>(R.id.generation_check)
        generation.text = "Y"


        initRecycler()
    }

    private fun initRecycler(){
        playlistRvAdapter = PlaylistRvAdapter(this)
        val playListRV = findViewById<RecyclerView>(R.id.playlistRV)
        playListRV.adapter = playlistRvAdapter

        datas.apply {
            add(AlbumData(img = R.drawable.album, title = "프리스타일", singer = "y"))
            add(AlbumData(img = R.drawable.album, title = "브라운아이즈", singer = "벌써 일년"))
            add(AlbumData(img = R.drawable.album, title = "버즈", singer = "가시"))
            add(AlbumData(img = R.drawable.album, title = "모세", singer = "사랑인걸"))
            add(AlbumData(img = R.drawable.album, title = "윤하", singer = "우산"))
            add(AlbumData(img = R.drawable.album, title = "이지", singer = "응급실"))
            add(AlbumData(img = R.drawable.album, title = "린", singer = "사랑했잖아"))
            add(AlbumData(img = R.drawable.album, title = "KCM", singer = "흑백사진"))
            add(AlbumData(img = R.drawable.album, title = "토이", singer = "좋은 사람"))
            add(AlbumData(img = R.drawable.album, title = "휘성", singer = "가슴 시린 이야기"))
            add(AlbumData(img = R.drawable.album, title = "성시경", singer = "거리에서"))
            add(AlbumData(img = R.drawable.album, title = "김동률", singer = "아이처럼"))
            add(AlbumData(img = R.drawable.album, title = "SS501", singer = "내머리가 나빠서"))
            add(AlbumData(img = R.drawable.album, title = "왁스", singer = "화장을 고치고"))
            add(AlbumData(img = R.drawable.album, title = "플라워", singer = "Endless"))
            add(AlbumData(img = R.drawable.album, title = "프리스타일", singer = "수취인불명"))


            playlistRvAdapter.datas = datas
            playlistRvAdapter.notifyDataSetChanged()
            

        }
        Log.d("데이터",datas.toString())
    }
}