package com.pmdm.funciones.objestosHastaLazy

class Libro(var titulo : String , var autor : String) {

    constructor(titulo: String) : this(titulo, "Desconocido")

    override fun toString(): String {
        return "Libro(titulo='$titulo', autor='$autor')"
    }


}