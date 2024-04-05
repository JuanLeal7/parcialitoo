package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    private var nombre: TextView? = null
    private var apellido: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        nombre = findViewById(R.id.nombre)
        apellido = findViewById(R.id.apellido)
        val info = intent
        if (info != null);
    }
}