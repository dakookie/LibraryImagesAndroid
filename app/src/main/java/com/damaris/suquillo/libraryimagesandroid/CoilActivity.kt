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
import coil.load
import coil.transform.CircleCropTransformation
import coil.transform.RoundedCornersTransformation

class CoilActivity : AppCompatActivity() {
    lateinit var iconCoil: ImageView
    lateinit var buttonPrincipal: LinearLayout
    lateinit var btnGlide: LinearLayout
    lateinit var btnPicasso: LinearLayout
    lateinit var btnCoil: LinearLayout
    lateinit var btnLoadImage: Button
    lateinit var btnClearImage: Button
    lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_coil)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        iconCoil = findViewById(R.id.iconCoil)
        buttonPrincipal = findViewById(R.id.buttonPrincipal)
        btnGlide = findViewById(R.id.btnGlide)
        btnPicasso = findViewById(R.id.btnPicasso)
        btnCoil = findViewById(R.id.btnCoil)
        btnLoadImage = findViewById(R.id.btnLoadImage)
        btnClearImage = findViewById(R.id.btnClearImage)
        imageView = findViewById(R.id.imageView)

        iconCoil.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        buttonPrincipal.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnGlide.setOnClickListener {
            val intent = Intent(this, GlideActivity::class.java)
            startActivity(intent)
        }
        btnPicasso.setOnClickListener {
            val intent = Intent(this, PicassoActivity::class.java)
            startActivity(intent)
        }
        btnCoil.setOnClickListener {
            val intent = Intent(this, CoilActivity::class.java)
            startActivity(intent)
        }

        val placeholderDrawable = R.drawable.loadg
        val errorDrawable = R.drawable.error
        val image = R.drawable.nenas

        // Cargar la imagen en el ImageView usando Coil
        imageView.load(image) { // Cargar la imagen desde los recursos
            placeholder(placeholderDrawable) // Drawable de placeholder
            error(errorDrawable) // Drawable de error
            transformations(RoundedCornersTransformation(30f)) // Transformación de esquinas redondeadas
            crossfade(true) // Habilitar crossfade
            crossfade(1000) // Duración del crossfade en milisegundos
        }

        btnLoadImage.setOnClickListener { // Cargar una nueva imagen al hacer clic en el botón
            val newImageUrl =
                "https://fastly.picsum.photos/id/42/3456/2304.jpg?hmac=dhQvd1Qp19zg26MEwYMnfz34eLnGv8meGk_lFNAJR3g" // Otra imagen de ejemplo
            imageView.load(newImageUrl) { // Cargar la nueva imagen desde la URL
                placeholder(placeholderDrawable) // Placeholder mientras se carga
                error(errorDrawable) // Imagen de error si falla la carga
                transformations(CircleCropTransformation()) // Transformación de círculo
                crossfade(true) // Habilitar crossfade
                crossfade(1000) // Duración del crossfade en milisegundos
            }
        }

        btnClearImage.setOnClickListener {
            imageView.load(R.drawable.loadg) { // Carga el placeholder
                placeholder(R.drawable.loadg) // Drawable de placeholder
                error(R.drawable.error) // Drawable de error
                crossfade(true)

            }

        }
    }
}