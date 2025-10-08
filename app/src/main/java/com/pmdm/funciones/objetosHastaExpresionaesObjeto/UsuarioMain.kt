package com.pmdm.funciones.objetosHastaExpresionaesObjeto

fun main(){

    var usuario1 = Usuario("Jesús" , 19);
    var usuario2 = Usuario("Jesús" , 19);
    var usuario3 = usuario1.copy(edad = 25)
    println("¿Son iguales el usuario1 y el usuario2? ${usuario1==usuario2}")
    println("¿Son iguales el usuario1 y el usuario3? ${usuario1==usuario3}")

}