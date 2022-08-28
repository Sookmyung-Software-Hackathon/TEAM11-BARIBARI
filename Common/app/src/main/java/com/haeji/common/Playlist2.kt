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
            add(AlbumData(img = R.drawable.album, singer = "프리스타일", title = "y"))
            add(AlbumData(img = R.drawable.album, singer = "브라운아이즈", title = "벌써 일년"))
            add(AlbumData(img = R.drawable.album, singer = "버즈", title = "가시"))
            add(AlbumData(img = R.drawable.album, singer = "모세", title = "사랑인걸"))
            add(AlbumData(img = R.drawable.album, singer = "윤하", title = "우산"))
            add(AlbumData(img = R.drawable.album, singer = "이지", title = "응급실"))
            add(AlbumData(img = R.drawable.album, singer = "린", title = "사랑했잖아"))
            add(AlbumData(img = R.drawable.album, singer = "KCM", title = "흑백사진"))
            add(AlbumData(img = R.drawable.album, singer = "토이", title = "좋은 사람"))
            add(AlbumData(img = R.drawable.album, singer = "휘성", title = "가슴 시린 이야기"))
            add(AlbumData(img = R.drawable.album, singer = "성시경", title = "거리에서"))
            add(AlbumData(img = R.drawable.album, singer = "김동률", title = "아이처럼"))
            add(AlbumData(img = R.drawable.album, singer = "SS501", title = "내머리가 나빠서"))
            add(AlbumData(img = R.drawable.album, singer = "왁스", title = "화장을 고치고"))
            add(AlbumData(img = R.drawable.album, singer = "플라워", title = "Endless"))
            add(AlbumData(img = R.drawable.album, singer = "프리스타일", title = "수취인불명"))


            playlistRvAdapter.datas = datas
            playlistRvAdapter.notifyDataSetChanged()
            

        }
        Log.d("데이터",datas.toString())
    }
}