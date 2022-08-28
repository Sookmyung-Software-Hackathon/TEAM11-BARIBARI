package com.haeji.common

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val title = intent.getStringExtra(Constants.CORRECT_ANSWERS)
        Log.d("점수 확인",title.toString())
        val score : TextView = findViewById(R.id.score)
        score.text = title.toString()

        val main : Button = findViewById(R.id.button)
        main.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}