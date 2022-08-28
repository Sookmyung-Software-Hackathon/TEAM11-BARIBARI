package com.haeji.common

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class MyPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_page)

        val nickname : TextView = findViewById(R.id.nickname)
        val generation : TextView = findViewById(R.id.generation_value)
        val common : TextView = findViewById(R.id.common_value)

        nickname.text = "바리바리스타"
        generation.text = "X"
        common.text = "70"

    }
}