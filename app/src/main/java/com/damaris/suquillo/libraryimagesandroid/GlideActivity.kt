package com.damaris.suquillo.libraryimagesandroid

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions

class GlideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var iconGlide: ImageView
        lateinit var buttonPrincipal: LinearLayout
        lateinit var btnGlide: LinearLayout
        lateinit var btnPicasso: LinearLayout
        lateinit var btnCoil: LinearLayout
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_glide)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Configurar icono de Glide
        iconGlide = findViewById(R.id.iconGlide)
        iconGlide.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
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

        val imageView: ImageView = findViewById(R.id.imageView)
        val imageUrl = "https://picsum.photos/id/103/200/300"
        Glide.with(this)
            .load(imageUrl)
            .placeholder(R.drawable.loadg)
            .error(R.drawable.error)
            .into(imageView)
    }
}