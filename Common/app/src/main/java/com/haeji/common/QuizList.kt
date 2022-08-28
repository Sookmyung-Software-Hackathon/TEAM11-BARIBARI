package com.haeji.common

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.haeji.common.databinding.ActivityMainBinding
import com.haeji.common.databinding.ActivityQuizListBinding

class QuizList : AppCompatActivity() {

    val binding by lazy{ActivityQuizListBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        //음악퀴즈
        binding.musicBtn.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
        }
        //영화퀴즈
        binding.movieBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
        }
        //단어퀴즈
        binding.wordBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
        }
    }
}