package com.example.classcatcl

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class WebActivity :AppCompatActivity() {
    var myWebView: WebView ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        myWebView = findViewById(R.id.mWebSite)
        var webSettings = myWebView!!.settings
        webSettings.javaScriptEnabled = true
        myWebView!!.loadUrl("https://www.emobilis.ac.ke")
    }
}