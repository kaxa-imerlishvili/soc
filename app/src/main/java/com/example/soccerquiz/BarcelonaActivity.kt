package com.example.soccerquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BarcelonaActivity : AppCompatActivity() {
    private lateinit var ClubHistory : Button
    private lateinit var ClubQuiz : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_barcelona)

        ClubHistory = findViewById(R.id.barcelonaclubhistory)
        ClubQuiz = findViewById(R.id.barcelonaquiz)

        ClubHistory.setOnClickListener {
            startActivity(Intent(this, Barcelonaimages::class.java))
        }

        ClubQuiz.setOnClickListener {
            startActivity(Intent(this, BarcaQuiz::class.java))
        }



    }
}



