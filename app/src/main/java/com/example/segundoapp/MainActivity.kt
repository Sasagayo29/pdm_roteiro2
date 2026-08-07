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

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)

        button1.setOnClickListener {
            Toast.makeText(this,
                "Bem-vindo ao meu App! você clicou no botão 1",
                Toast.LENGTH_LONG).show()
        }

        button2.setOnClickListener {
            Toast.makeText(this,
                "Bem-vindo ao meu App! você clicou no botão 2",
                Toast.LENGTH_LONG).show()
        }

        button3.setOnClickListener {
            Toast.makeText(this,
                "Bem-vindo ao meu App! você clicou no botão 3",
                Toast.LENGTH_LONG).show()
        }

        button4.setOnClickListener {
            Toast.makeText(this,
                "Bem-vindo ao meu App! você clicou no botão 4",
                Toast.LENGTH_LONG).show()
        }

        button5.setOnClickListener {
            Toast.makeText(this,
                "Bem-vindo ao meu App! você clicou no botão 5",
                Toast.LENGTH_LONG).show()
        }
    }
}