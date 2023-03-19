package com.example.first

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.cardview.widget.CardView

class second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val rick=findViewById<CardView>(R.id.rick)
        val cam=findViewById<CardView>(R.id.camera)
        val button=findViewById<Button>(R.id.button)
        val phone=findViewById<Button>(R.id.phone)
        rick.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.youtube.com/watch?v=dQw4w9WgXcQ")
            startActivity(intent)

        }

        cam.setOnClickListener {
            val intent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
        button.setOnClickListener {
            intent =Intent(applicationContext,third::class.java)
            startActivity(intent)
        }
        phone.setOnClickListener {
            val phn=Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919831291201"))
            startActivity(phn)
        }
    }
}