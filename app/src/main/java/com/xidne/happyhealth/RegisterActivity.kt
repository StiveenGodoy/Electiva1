package com.xidne.happyhealth

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Referencia al botón de registro
        val btnRegister: Button = findViewById(R.id.btnRegister)
        btnRegister.setOnClickListener {
            Log.d("RegisterActivity", "Register button clicked")
            // Iniciar HomeActivity y cerrar RegisterActivity
            val intent = Intent(this@RegisterActivity, HomeActivity::class.java)
            startActivity(intent)
            finish() // Terminar RegisterActivity para que no se pueda volver con el botón de retroceso
        }

        // Referencia al botón de inicio de sesión
        val btnLogin: Button = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            Log.d("RegisterActivity", "Login button clicked")
            // Iniciar MainActivity
            val intent = Intent(this@RegisterActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}

