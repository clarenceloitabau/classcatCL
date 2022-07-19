package com.example.classcatcl

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var calcbutton:Button ?= null
    var webbutton:Button ?= null
    var intentsbutton:Button ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calcbutton= findViewById(R.id.mbtn1)
        calcbutton!!.setOnClickListener {
var gotocalc = Intent(applicationContext,CalcActivity::class.java)
            startActivity(gotocalc)
        }
        webbutton= findViewById(R.id.mbtn2)
        webbutton!!.setOnClickListener {
            var gotoweb = Intent(applicationContext,WebActivity::class.java)
            startActivity(gotoweb)
        }
        intentsbutton= findViewById(R.id.mbtn3)
        intentsbutton!!.setOnClickListener {
            var gotointent = Intent(applicationContext,IntentsActivity::class.java)
            startActivity(gotointent)
        }


    }
}
//Create an application with 4 pages
//On the first page place 3 respective buttons linking you on different pages
//on the second page, implement a simple calculator
//on the third page,display a website of your choice
//on the last page,implement the six intents in today's class