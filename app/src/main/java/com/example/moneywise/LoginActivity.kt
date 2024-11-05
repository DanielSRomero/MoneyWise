package com.example.moneywise

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Toast
import com.example.moneywise.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private val MYUSER = "admin"
    private val MYPASS = "1234"

    private lateinit var confBinding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        confBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(confBinding.root)
        initEvent()
    }
    private fun initEvent() {
        confBinding.btnLogin.setOnClickListener {
            val username = confBinding.etUser.text.toString()
            val password = confBinding.etPass.text.toString()

            if (username == MYUSER && password == MYPASS) {
                val intentMain = Intent(this, MainActivity::class.java).apply {
                    putExtra("username", username)
                    putExtra("password", password)
                }
                startActivity(intentMain)
            } else {
                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
