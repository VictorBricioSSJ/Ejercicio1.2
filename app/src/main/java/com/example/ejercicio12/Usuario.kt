package com.example.ejercicio12

import android.os.Bundle;

class Usuario {
    var nombre: String
        get() {
            return nombre;
        }
        set(value) {
            nombre = value;
        }
    var apellido: String
        get() {
            return apellido;
        }
        set(value) {
            apellido = value;
        }

     var cargo: String

     constructor(nombre: String, apellido: String, cargo: String) {
        this.nombre = nombre
        this.apellido = apellido
         this.cargo = cargo
    }
     constructor(bundle: Bundle){
        this.nombre = bundle.getString("nombre")!!
        this.apellido = bundle.getString("apellido")!!
         this.cargo = bundle.getString("cargo")!!
    }
    fun getBundle(): Bundle?{
        val bundle = Bundle()
        bundle.putString("nombre",this.nombre)
        bundle.putString("apellido", this.apellido)
        bundle.putString("cargo", this.cargo)
        return bundle
    }
}