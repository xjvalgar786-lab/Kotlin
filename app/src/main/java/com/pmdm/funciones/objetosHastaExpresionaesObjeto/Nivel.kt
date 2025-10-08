package com.pmdm.funciones.objetosHastaExpresionaesObjeto

enum class Nivel(val puntos : Int) {

    BAJO(10),
    MEDIO(50),
    ALTO(100);


    fun mostrarPuntos(){

        print("Tienes $puntos punto/s \n")
    }
}