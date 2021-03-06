package br.com.alura.bytebank.modelo

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set

//    constructor(titular: String, numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
//-------- criando gretter e setter

//    fun getSaldo(): Double {
//        return saldo
//    }
//    fun setSaldo(valor: Double){
//        if(valor > 0){
//            saldo = valor
//        }
//    }


}