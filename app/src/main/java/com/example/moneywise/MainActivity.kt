package com.example.moneywise

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.moneywise.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var confBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        confBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(confBinding.root)

        initEvent()
    }
    private fun initEvent() {
        val user = intent.getStringExtra("username")
        val pass = intent.getStringExtra("password")

        confBinding.tvWelcome.text = "Bienvenido $user, tu contraseña es: $pass"
    }
}
