package com.haeji.common

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.haeji.common.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // 채팅
        binding.chatBtn.setOnClickListener {
            //val intent = Intent(this, Chatting::class.java)
            //startActivity(intent)
            val builder = AlertDialog.Builder(this)
            builder
                .setTitle("채팅")
                .setMessage("랜덤 채팅은 Y, " + "일반 채팅은 N을 누르세요")
                .setPositiveButton("YES",
                    DialogInterface.OnClickListener { dialog, id ->
                        val intent = Intent(this, ChattingRoom::class.java)
                        startActivity(intent)
                    })
                .setNegativeButton("NO",
                    DialogInterface.OnClickListener { dialog, id ->
                        // Cancel 버튼 선택 시 수행
                        val intent = Intent(this, Chatting::class.java)
                        startActivity(intent)
                    })
// Create the AlertDialog object and return it
            builder.create()
            builder.show()

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
        binding.genquizimg.setOnClickListener {
            val intent = Intent(this, GenerationTest::class.java)
            startActivity(intent)
        }

        // 플레이리스트
        binding.XplaylistImg.setOnClickListener {
            val intent = Intent(this, Playlist3::class.java)
            startActivity(intent)

        }

        // 플레이리스트
        binding.YplaylistImg.setOnClickListener {
            val intent = Intent(this, Playlist2::class.java)
            startActivity(intent)

        }

        // 플레이리스트
        binding.ZplaylistImg.setOnClickListener {
            val intent = Intent(this, Playlist::class.java)
            startActivity(intent)

        }
    }
}