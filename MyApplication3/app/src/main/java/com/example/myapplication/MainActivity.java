package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nombre;
    private EditText apellido;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = findViewById(R.id.nom);
        apellido = findViewById(R.id.ape);


    }


    public void onClick(View v) {

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        Intent pasar = new Intent(MainActivity.this, MainActivity2.class);
        String nom= nombre.toString();
        String ape= apellido.toString();
        pasar.putExtra("compartir",nom);
        pasar.putExtra("compartir",ape);
        startActivity(intent);
    }



}