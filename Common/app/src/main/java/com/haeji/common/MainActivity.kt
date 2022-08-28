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
        // 채팅
        binding.chatBtn.setOnClickListener {
            val intent = Intent(this, Chatting::class.java)
            startActivity(intent)

        }
        // 마이페이지
        binding.imageView.setOnClickListener {
            val intent = Intent(this, MyPage::class.java)
            startActivity(intent)

        }
        // 퀴즈
        binding.quizImg.setOnClickListener {
                val intent = Intent(this, QuizList::class.java)
            startActivity(intent)

        }

        // 테스트

        // 플레이리스트
        binding.XplaylistImg.setOnClickListener {
            val intent = Intent(this, Playlist::class.java)
            startActivity(intent)

        }
    }
}