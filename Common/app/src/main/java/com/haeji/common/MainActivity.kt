package com.haeji.common

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.haeji.common.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.chatBtn.setOnClickListener {
//            val intent = Intent(this, Playlist::class.java)
//            startActivity(intent)
//
//        }
    }
}