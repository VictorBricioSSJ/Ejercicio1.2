package com.example.ejercicio12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.ejercicio12.Usuario

class Resultado : AppCompatActivity() {
    lateinit var tvCargo: TextView
    lateinit var tvNombre: TextView
    lateinit var tvApellido: TextView
    lateinit var btVolver: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resultadoactivity)

        tvCargo = findViewById(R.id.editTextCargo)
        tvNombre = findViewById(R.id.editTextNombree)
        tvApellido = findViewById(R.id.editTextApellidoo)
        btVolver = findViewById(R.id.btVolver)

        val bundleUsuario = intent.getBundleExtra("claseUsuario")
        val usuario = Usuario(bundleUsuario!!)

        tvNombre.text = "Nombre: " + usuario.nombre
        tvApellido.text = "Apellido: " + usuario.apellido

        if (usuario.cargo == "Alumno") {
            tvCargo.text = "Cargo: Alumno"
        } else {
            tvCargo.text = "Cargo: Profesor"
        }

        btVolver.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}