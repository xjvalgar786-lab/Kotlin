package com.pmdm.funciones.objetosHastaExpresionaesObjeto

fun muestraResultado(resultado: Resultado){

    when (resultado){

        is Resultado.Error -> println("Error")
        is Resultado.Exito -> println("Éxito")
        is Resultado.Cargando -> println("Cargando")
    }
}