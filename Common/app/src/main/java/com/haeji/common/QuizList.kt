package com.haeji.common

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class QuizList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_list)

        val music : TextView = findViewById(R.id.musicBtn)
        val movie : TextView = findViewById(R.id.movieBtn)
        val word : TextView = findViewById(R.id.wordBtn)

        music.setOnClickListener {
            val intent = Intent(this, Quiz2::class.java)
            startActivity(intent)
        }

        movie.setOnClickListener {
            val intent = Intent(this, Quiz3::class.java)
            startActivity(intent)
        }

        word.setOnClickListener {
            val intent = Intent(this, Quiz::class.java)
            startActivity(intent)
        }
    }
}