package com.example.lista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.lista.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaNumeros = ArrayList<Int>()
        listaNumeros.add(1)
        listaNumeros.add(10)
        listaNumeros.add(5)
        listaNumeros.add(4)
        listaNumeros.add(8)

        val adapter = ArrayAdapter(this, android.R. layout.simple_list_item_1, listaNumeros)
        binding.listView.adapter = adapter
        
        binding.listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Clicado em ${listaNumeros.get(position)}", Toast.LENGTH_SHORT).show()
        }
    }
}