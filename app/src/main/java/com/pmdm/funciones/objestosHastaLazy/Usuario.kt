package com.pmdm.funciones.objestosHastaLazy

class Usuario() {

     lateinit var nombre:String;
     lateinit var email:String;


    fun registrarUsuario(nombre:String , email:String){

        this.nombre = nombre;
        this.email = email;


    }
    fun imprimirUsuario(){
        if(!this::nombre.isInitialized && !this::email.isInitialized){

            print("No se han dado valores");
        }else{

            print("Nombre --> $nombre \n Email --> $email");

        }
    }


}

