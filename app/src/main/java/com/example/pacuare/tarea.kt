package com.example.pacuare

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class tarea : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tarea)

        // Conectamos la variable con el botón del XML mediante su ID
        val boton: Button = findViewById(R.id.miBoton)

        // Ahora puedes manipularlo desde Kotlin
        boton.setOnClickListener {
            Toast.makeText(this, "¡XML conectado a Kotlin!", Toast.LENGTH_SHORT).show()

       //
        /*
        *
        *
        * */

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}