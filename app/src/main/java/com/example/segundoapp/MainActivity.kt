package com.example.segundoapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val meuBotao: Button = findViewById(R.id.buttonClique)
        meuBotao.setOnClickListener{
            Toast.makeText(this, "Bem-vindo!", Toast.LENGTH_LONG).show()
        }
    }
}