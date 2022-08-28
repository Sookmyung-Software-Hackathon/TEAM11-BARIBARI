package com.haeji.common

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Playlist : AppCompatActivity() {
    lateinit var playlistRvAdapter: PlaylistRvAdapter
    val datas = mutableListOf<AlbumData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playlist)

        initRecycler()
    }

    private fun initRecycler(){
        playlistRvAdapter = PlaylistRvAdapter(this)
        val playListRV = findViewById<RecyclerView>(R.id.playlistRV)
        playListRV.adapter = playlistRvAdapter

        datas.apply {
            add(AlbumData(img = R.drawable.album, title = "으르렁", singer = "엑소"))
            add(AlbumData(img = R.drawable.album, title = "다이너마이트", singer = "방탄소년단"))
            add(AlbumData(img = R.drawable.album, title = "Heart Beat", singer = "2PM"))
            add(AlbumData(img = R.drawable.album, title = "아주 나이스", singer = "세븐틴"))
            add(AlbumData(img = R.drawable.album, title = "cheer up", singer = "트와이스"))
            add(AlbumData(img = R.drawable.album, title = "빨간맛", singer = "레드벨벳"))
            add(AlbumData(img = R.drawable.album, title = "이게 무슨 일이야", singer = "B1A4"))
            add(AlbumData(img = R.drawable.album, title = "NO NO NO", singer = "에이핑크"))
            add(AlbumData(img = R.drawable.album, title = "핫이슈", singer = "포미닛"))
            add(AlbumData(img = R.drawable.album, title = "내꺼하자", singer = "인피니트"))
            add(AlbumData(img = R.drawable.album, title = "touch my body", singer = "씨스타"))
            add(AlbumData(img = R.drawable.album, title = "링딩동", singer = "샤이니"))

            playlistRvAdapter.datas = datas
            playlistRvAdapter.notifyDataSetChanged()
            

        }
        Log.d("데이터",datas.toString())
    }
}