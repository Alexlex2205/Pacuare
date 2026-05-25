package com.example.pacuare

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val usuario = findViewById<EditText>(R.id.user)
        val contra = findViewById<EditText>(R.id.password)

        val imglogin = findViewById<ImageView>(R.id.btnlog)
        val txtlogin = findViewById<TextView>(R.id.btnlogtxt)


    }
}

