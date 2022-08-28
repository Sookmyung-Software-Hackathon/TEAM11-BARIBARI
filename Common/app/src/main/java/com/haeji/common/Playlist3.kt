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
            add(AlbumData(img = R.drawable.album, title = "타인의 기억", singer = "넬"))
            add(AlbumData(img = R.drawable.album, title = "summer", singer = "tvt"))
            add(AlbumData(img = R.drawable.album, title = "머물러줘", singer = "성규"))


            playlistRvAdapter.datas = datas
            playlistRvAdapter.notifyDataSetChanged()
            

        }
        Log.d("데이터",datas.toString())
    }
}