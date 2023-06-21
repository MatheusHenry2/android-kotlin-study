package com.example.utilizador

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.utilizador.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent

        val nome = i.extras?.getString("nome")

        if (nome.equals("") || nome == null) {
            Toast.makeText(applicationContext, "Nome não inserido", Toast.LENGTH_SHORT).show()
        } else {
            binding.textNome.setText("Olá ${nome}")
        }
    }
}