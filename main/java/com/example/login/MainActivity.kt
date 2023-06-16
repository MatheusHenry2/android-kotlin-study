package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.i
import android.widget.Toast
import com.example.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEntrar.setOnClickListener {
            var username = binding.editUsername.text.toString().trim()
            var password = binding.editPassword.text.toString().trim()

            if (username.equals("user") && password.equals("pass")) {
                Toast.makeText(applicationContext, "Login OK", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Login Inválido", Toast.LENGTH_SHORT).show()
            }
        }
    }
}