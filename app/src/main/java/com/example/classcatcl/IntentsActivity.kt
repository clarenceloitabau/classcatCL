package com.example.classcatcl

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class IntentsActivity :AppCompatActivity() {
    var buttonSms: Button ?= null
    var buttonEmail: Button ?= null
    var buttonCamera: Button ?= null
    var buttonShare: Button ?= null
    var buttonMpesa: Button ?= null
    var buttonCall: Button ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intents)
        buttonSms = findViewById(R.id.button1)
        buttonEmail = findViewById(R.id.button2)
        buttonCamera = findViewById(R.id.button3)
        buttonShare = findViewById(R.id.button4)
        buttonMpesa = findViewById(R.id.button5)
        buttonCall = findViewById(R.id.button6)

        buttonSms!!.setOnClickListener {
            val uri: Uri = Uri.parse("smsto:0115816970")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body", "ssup CLARENCE")
            startActivity(intent)
        }
        buttonEmail!!.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "clarenceloitabau@gmail.com", null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "JOB APPLICATION")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Dear sir kindly give me the interview")
            startActivity(Intent.createChooser(emailIntent, "Send email..."))

        }
        buttonCamera!!.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takePictureIntent, 1)

        }
        buttonShare!!.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")
            startActivity(shareIntent)

        }
        buttonMpesa!!.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }

        }
        buttonCall!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+254718147604"))
            if (ContextCompat.checkSelfPermission(
                    this@IntentsActivity,
                    Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@IntentsActivity,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                startActivity(intent)
            }
        }
    }
}