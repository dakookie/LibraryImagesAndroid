package com.damaris.suquillo.libraryimagesandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.squareup.picasso.Picasso

class PicassoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var iconPicasso: ImageView
        lateinit var buttonPrincipal: LinearLayout
        lateinit var btnGlide: LinearLayout
        lateinit var btnPicasso: LinearLayout
        lateinit var btnCoil: LinearLayout
        lateinit var btnLoadImage: Button
        lateinit var btnClearImage: Button
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_picasso)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Configurar icono de Glide
        iconPicasso = findViewById(R.id.iconPicasso)
        iconPicasso.setOnClickListener {
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
        // Obtener la referencia al ImageView
        val imageView: ImageView = findViewById(R.id.imageView)

        // Define el drawable para el placeholder y el error (asegúrate de que existan)
        val placeholderDrawable = R.drawable.loadg
        val errorDrawable = R.drawable.error
        val image = "https://picsum.photos/id/259/200/300"

        btnLoadImage = findViewById(R.id.btnLoadImage)
        btnLoadImage.setOnClickListener {
            Picasso.get()
                .load(image)
                .placeholder(placeholderDrawable)
                .error(errorDrawable)
                .resize(400, 300)
                .centerCrop()
                .rotate(90f)
                .into(imageView)
        }
        btnClearImage = findViewById(R.id.btnClearImage)
        btnClearImage.setOnClickListener {
            Picasso.get()
                .load(R.drawable.loadg)
                .into(imageView)
        }

        Picasso.get()
            .load(image)
            .placeholder(placeholderDrawable)
            .error(errorDrawable)
            .resize(700, 500)
            .centerCrop()
            .rotate(45f)
            .into(imageView)


    }
}