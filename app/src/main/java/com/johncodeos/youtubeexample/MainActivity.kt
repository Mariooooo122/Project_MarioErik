package com.johncodeos.youtubeexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_bicept.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.bicept
import kotlinx.android.synthetic.main.activity_main.tricept
import kotlinx.android.synthetic.main.activity_tricept.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chest.setOnClickListener {
            val intent = Intent(this, Chest::class.java)
            ContextCompat.startActivity(this, intent, null)
        }

        bicept.setOnClickListener {
            val intent = Intent(this, Bicept::class.java)
            ContextCompat.startActivity(this, intent, null)
        }
        tricept.setOnClickListener {
            val intent = Intent(this, Bicept::class.java)
            ContextCompat.startActivity(this, intent, null)
        }
        forearm.setOnClickListener {
            val intent = Intent(this, Tricept::class.java)
            ContextCompat.startActivity(this, intent, null)
        }
    }
}
