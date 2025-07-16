package com.damaris.suquillo.libraryimagesandroid

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var buttonGlide: Button
    lateinit var buttonPicasso: Button
    lateinit var buttonCoil: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Redirección del botón Glide
        buttonGlide = findViewById(R.id.buttonGlide)
        buttonGlide.setOnClickListener {
            val intent = Intent(this, GlideActivity::class.java)
            startActivity(intent)
        }

        //Redirección del botón Picasso
        buttonPicasso = findViewById(R.id.buttonPicasso)
        buttonPicasso.setOnClickListener {
            val intent = Intent(this, PicassoActivity::class.java)
            startActivity(intent)
        }

        //Redirección del botón Coil
        buttonCoil = findViewById(R.id.buttonCoil)
        buttonCoil.setOnClickListener {
            val intent = Intent(this, CoilActivity::class.java)
            startActivity(intent)
        }
    }
}