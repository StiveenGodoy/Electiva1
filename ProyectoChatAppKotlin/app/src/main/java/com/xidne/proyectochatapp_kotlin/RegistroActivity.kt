package com.xidne.proyectochatapp_kotlin

import android.icu.text.CaseMap.Title
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.auth.FirebaseAuth

class RegistroActivity : AppCompatActivity() {

    private lateinit var r_et_nombre_usuario: EditText
    private lateinit var r_et_email: EditText
    private lateinit var r_et_password: EditText
    private lateinit var r_et_r_password: EditText
    private lateinit var btn_registrar : Button

    private lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        supportActionBar!!.title="Registros"
        InicializarVariables()
    }

    private fun InicializarVariables(){
        r_et_nombre_usuario = findViewById(R.id.r_et_nombre_usuario)
        r_et_email = findViewById(R.id.r_et_email)
        r_et_password = findViewById(R.id.r_et_password)
        r_et_r_password = findViewById(R.id.r_et_r_password)
        btn_registrar = findViewById(R.id.btn_registrar)

        auth=FirebaseAuth.getInstance()
    }
}