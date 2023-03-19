package com.example.first

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val upload = findViewById<Button>(R.id.Light)
        val download = findViewById<Button>(R.id.Dark)
        val layout=findViewById<LinearLayout>(R.id.linearLayout)
        val text=findViewById<TextView>(R.id.textView)
        val next=findViewById<Button>(R.id.next)
        upload.setOnClickListener {
            layout.setBackgroundResource(R.color.white)
            Toast.makeText(applicationContext,"Changed to read Mode",Toast.LENGTH_SHORT).show()
            text.setTextColor(Color.parseColor("#FF000000"))
        }
        download.setOnClickListener {
            layout.setBackgroundResource(R.color.black)
            Toast.makeText(applicationContext,"Changed to dark mode",Toast.LENGTH_SHORT).show()
            text.setTextColor(Color.parseColor("#FFFFFFFF"))
        }
        next.setOnClickListener {
            intent= Intent(applicationContext, second::class.java)
            startActivity(intent)
        }
    }
}