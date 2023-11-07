package com.example.ejercicio12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Button
import android.widget.TextView
import com.example.ejercicio12.Usuario

class MainActivity : AppCompatActivity() {
    lateinit var editTextNombre: TextView
    lateinit var editTextApellido: TextView
    lateinit var radioGroupCargo: RadioGroup
    lateinit var radioButtonAlumno: RadioButton
    lateinit var radioButtonProfesor: RadioButton
    lateinit var btnRegistrarse: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextNombre = findViewById(R.id.editTextNombre)
        editTextApellido = findViewById(R.id.editTextApellido)
        radioGroupCargo = findViewById(R.id.rgCargo)
        radioButtonAlumno = findViewById(R.id.rbAlumno)
        radioButtonProfesor = findViewById(R.id.rbProfesor)
        btnRegistrarse = findViewById(R.id.btnRegistrarse)
    }

    fun onAltaUsuario(view: View) {
        val nombre = editTextNombre.text.toString()
        val apellido = editTextApellido.text.toString()
        val cargo = if (radioButtonAlumno.isChecked) "Alumno" else "Profesor"
        val usuario = Usuario(nombre, apellido, cargo)

        val intent = Intent(this, Resultado::class.java)
        intent.putExtra("claseUsuario", usuario.getBundle())
        startActivity(intent)
    }
}