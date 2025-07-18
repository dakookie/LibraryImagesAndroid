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

        // Cargar imagen con Picasso
        btnLoadImage = findViewById(R.id.btnLoadImage) // Botón para cargar la imagen
        btnLoadImage.setOnClickListener { // Al hacer clic en el botón, cargar la imagen
            Picasso.get() // Obtener la instancia de Picasso
                .load(image) // Cargar la imagen desde la URL
                .placeholder(placeholderDrawable) // Mostrar un drawable mientras se carga la imagen
                .error(errorDrawable) // Mostrar un drawable si hay un error al cargar la imagen
                .resize(400, 300) // Redimensionar la imagen a 400x300 píxeles
                .centerCrop() // Recortar la imagen al centro
                .rotate(90f) // Rotar la imagen 90 grados
                .into(imageView) // Cargar la imagen en el ImageView
        }
        btnClearImage = findViewById(R.id.btnClearImage) // Botón para limpiar la imagen
        btnClearImage.setOnClickListener { // Al hacer clic en el botón, limpiar la imagen
            Picasso.get() // Obtener la instancia de Picasso
                .load(R.drawable.loadg) // Cargar un drawable de placeholder para limpiar la imagen
                .into(imageView) // Cargar el drawable en el ImageView
        }

        Picasso.get() // Obtener la instancia de Picasso
            .load(image) // Cargar la imagen desde la URL
            .placeholder(placeholderDrawable) // Mostrar un drawable mientras se carga la imagen
            .error(errorDrawable) // Mostrar un drawable si hay un error al cargar la imagen
            .resize(700, 500) // Redimensionar la imagen a 700x500 píxeles
            .centerCrop() // Recortar la imagen al centro
            .rotate(45f) // Rotar la imagen 45 grados
            .into(imageView) // Cargar la imagen en el ImageView


    }
}