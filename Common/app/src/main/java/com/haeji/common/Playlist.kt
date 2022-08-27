package com.haeji.common

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Playlist : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playlist)

        val items = mutableListOf<String>()
        items.add("a")
        items.add("b")
        items.add("c")
        Log.d("itemlist", items.toString())

//        val rv = binding.playlistRv
        val rv = findViewById<RecyclerView>(R.id.playlistRv)
        val rvAdapter = PlaylistRVAdapter(items)
        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(this)

    }


}