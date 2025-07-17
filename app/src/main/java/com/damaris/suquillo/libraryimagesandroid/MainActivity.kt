package com.damaris.suquillo.libraryimagesandroid

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.card.MaterialCardView

class MainActivity : AppCompatActivity() {
    lateinit var cardGlide: MaterialCardView
    lateinit var cardPicasso: MaterialCardView
    lateinit var cardCoil: MaterialCardView
    lateinit var buttonPrincipal: LinearLayout
    lateinit var btnGlide: LinearLayout
    lateinit var btnPicasso: LinearLayout
    lateinit var btnCoil: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Redirección del botón Glide
        cardGlide = findViewById(R.id.cardGlide)
        cardGlide.setOnClickListener {
            val intent = Intent(this, GlideActivity::class.java)
            startActivity(intent)
        }

        //Redirección del botón Picasso
        cardPicasso = findViewById(R.id.cardPicasso)
        cardPicasso.setOnClickListener {
            val intent = Intent(this, PicassoActivity::class.java)
            startActivity(intent)
        }

        //Redirección del botón Coil
        cardCoil = findViewById(R.id.cardCoil)
        cardCoil.setOnClickListener {
            val intent = Intent(this, CoilActivity::class.java)
            startActivity(intent)
        }

        //Redirección del botón principal
        buttonPrincipal = findViewById(R.id.buttonPrincipal)
        buttonPrincipal.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        //Redirección del botón Glide
        btnGlide = findViewById(R.id.btnGlide)
        btnGlide.setOnClickListener {
            val intent = Intent(this, GlideActivity::class.java)
            startActivity(intent)
        }
        //Redirección del botón Picasso
        btnPicasso = findViewById(R.id.btnPicasso)
        btnPicasso.setOnClickListener {
            val intent = Intent(this, PicassoActivity::class.java)
            startActivity(intent)
        }
        //Redirección del botón Coil
        btnCoil = findViewById(R.id.btnCoil)
        btnCoil.setOnClickListener {
            val intent = Intent(this, CoilActivity::class.java)
            startActivity(intent)
        }
    }
}