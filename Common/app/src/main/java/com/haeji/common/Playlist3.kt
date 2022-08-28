package com.haeji.common

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Playlist3 : AppCompatActivity() {
    lateinit var playlistRvAdapter: PlaylistRvAdapter
    val datas = mutableListOf<AlbumData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playlist)

        val generation = findViewById<TextView>(R.id.generation_check)
        generation.text = "X"

        initRecycler()
    }

    private fun initRecycler(){
        playlistRvAdapter = PlaylistRvAdapter(this)
        val playListRV = findViewById<RecyclerView>(R.id.playlistRV)
        playListRV.adapter = playlistRvAdapter

        datas.apply {
            add(AlbumData(img = R.drawable.album, title = "서른 즈음에", singer = "김광석"))
            add(AlbumData(img = R.drawable.album, title = "내게 돌아와", singer = "듀스"))
            add(AlbumData(img = R.drawable.album, title = "그대에게", singer = "신해철"))
            add(AlbumData(img = R.drawable.album, title = "널 그리며", singer = "박남정"))
            add(AlbumData(img = R.drawable.album, title = "붉은 노을", singer = "이문세"))
            add(AlbumData(img = R.drawable.album, title = "새들처럼", singer = "변진섭"))
            add(AlbumData(img = R.drawable.album, title = "엄마가 딸에게", singer = "양희은"))
            add(AlbumData(img = R.drawable.album, title = "보랏빛 향기", singer = "강수지"))
            add(AlbumData(img = R.drawable.album, title = "여행을 떠나요", singer = "자전거 탄 풍경"))
            add(AlbumData(img = R.drawable.album, title = "일과 이분의 일", singer = "투투"))
            add(AlbumData(img = R.drawable.album, title = "순정", singer = "코요태"))
            add(AlbumData(img = R.drawable.album, title = "쿵따리 샤바라", singer = "클론"))
            add(AlbumData(img = R.drawable.album, title = "너는 왜", singer = "철이와 미애"))
            add(AlbumData(img = R.drawable.album, title = "난 알아요", singer = "서태지"))


            playlistRvAdapter.datas = datas
            playlistRvAdapter.notifyDataSetChanged()
            

        }
        Log.d("데이터",datas.toString())
    }
}