package com.pmdm.funciones.objetosHastaExpresionaesObjeto

sealed class Resultado {

    class Exito(val mensaje : String): Resultado()
    class Error(val mensaje : String) : Resultado()
    class Cargando(val mensaje: String) : Resultado()

    fun  mostrarResultado(resultado: Resultado) {

        when (resultado) {
            is Exito -> println("Éxito : La operación ha sido exitosa")
            is Error -> println("Error : La operación no se ha podida realizar")
            is Cargando -> println("Cargando")
        }
    }


}



