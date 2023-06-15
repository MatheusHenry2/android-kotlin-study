package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener{

            val nome = binding.editNome.text.toString().trim()
            val sobrenome = binding.editSobrenome.text.toString().trim()

            if(nome.isEmpty() || sobrenome.isEmpty()){
                binding.textResultado.text = "nome ou sobrenome vazio!"
                Toast.makeText(applicationContext, "nome ou sobrenome vazio!",Toast.LENGTH_SHORT).show( )
            }
            else{
                binding.textResultado.text = "Olá $nome $sobrenome"
                Toast.makeText(applicationContext, "Olá $nome $sobrenome",Toast.LENGTH_LONG).show( )
            }

        }
    }
}