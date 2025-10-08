package com.pmdm.funciones.objetosHastaExpresionaesObjeto

open class CuentaBancaria(private var saldo : Double) {


    fun depositar(dinero: Double){



    }

    protected open fun retirar(dinero: Double){

    }

    internal fun mostratinfo(){

        print(saldo)
    }

}