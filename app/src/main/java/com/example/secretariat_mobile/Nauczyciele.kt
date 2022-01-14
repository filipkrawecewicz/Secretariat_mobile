package com.example.secretariat_mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class Nauczyciele : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nauczyciele)
        title = "KotlinApp"
        val button: Button = findViewById(R.id.btnOpenAct2)
        button.setOnClickListener{
            val i = Intent(this@Nauczyciele, MainActivity::class.java)
            startActivity(i)
        }
    }
}