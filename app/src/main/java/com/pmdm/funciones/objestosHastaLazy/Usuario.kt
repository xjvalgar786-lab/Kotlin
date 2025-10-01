package com.pmdm.funciones.objestosHastaLazy

class Usuario(var nombre : String , var email : String) {



    fun registrarUsuario(nombre: String , email: String){

        this.nombre = nombre
        this.email = email

    }
}