package com.example.utilizador

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.utilizador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent
        val nome = i.extras?.getString("nome")

        if (nome.equals("") || nome == null) {
            binding.textNomeMudar.setText("Olá Utilizador")
        }else{
            binding.textNomeMudar.setText("Olá ${nome}")
        }

        binding.buttonEditar.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }

    }
}