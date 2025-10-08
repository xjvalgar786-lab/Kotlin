package com.pmdm.funciones.objetosHastaExpresionaesObjeto

class CuentaAhorro(saldo:Double):CuentaBancaria(saldo) {



    override fun retirar(saldo: Double){

        print("Retirando saldo $saldo")
    }






}