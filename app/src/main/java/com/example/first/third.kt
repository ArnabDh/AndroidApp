package com.example.first

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class third : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val web=findViewById<WebView>(R.id.web)
        websetup(web)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun websetup(web: WebView){
        web.webViewClient= WebViewClient()
        web.apply {
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            loadUrl("https://www.youtube.com/")

        }
    }
}