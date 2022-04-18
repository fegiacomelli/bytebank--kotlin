fun main() {
    println("Bem vindo ao Bytebank")

    val contaFelipe = Conta(titular = "Felipe", numero = 1000)
    contaFelipe.deposita(200.0)

    println(contaFelipe.titular)
    println(contaFelipe.numero)
    println(contaFelipe.saldo)

    val contaGreice = Conta(numero = 1001, titular = "Greice")
    contaGreice.deposita(300.0)

    println(contaGreice.titular)
    println(contaGreice.numero)
    println(contaGreice.saldo)
//
//    println("Depositado na conta do Felipe")
//    contaFelipe.deposita(50.0)
//    println(contaFelipe.saldo)
//    println("Depositado na conta do Greice")
//    contaGreice.deposita(70.0)
//    println(contaGreice.saldo)
//
//    println("Sacando na conta do Felipe")
//    contaFelipe.saca(250.0)
//    println(contaFelipe.saldo)
//
//    println("Sacando na conta da Greice")
//    contaGreice.saca(100.0)
//    println(contaGreice.saldo)
//
//    println("saque em excesso na conta do Felipe")
//    contaFelipe.saca(100.0)
//    println(contaFelipe.saldo)
//
//    println("saque em excesso na conta da Greice")
//    contaGreice.saca(500.0)
//    println(contaGreice.saldo)
//
//    println("Transferencia da conta da Greice para o Felipe")
//
    if(contaGreice.transfere(valor = 100.0, destino = contaFelipe)){
        println("Transferencia sucedida")
    } else {
        println("Falha na Transferencia")
    }

    println("Conta Felipe: ${contaFelipe.saldo}")
    println("Conta Greice: ${contaGreice.saldo}")


}

class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

//    constructor(titular: String, numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        }
    }

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

fun testaCoiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")


    val contaJoao = Conta("Joao", 1002)
    var contaMaria = Conta("Maria", 1003)

    println("Titular conta joao: ${contaJoao.titular}")
    println("Titular conta maria: ${contaMaria.titular}")


    println(contaJoao)
    println(contaMaria)
}


fun testaLacos() {
    var i = 0

    while (i < 5) {
        val titular = "Felipe $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular : $titular")
        println("Numero da Conta : $numeroConta")
        println("Saldo da conta : $saldo")
        println()

        i++

    }


    for (i in 5 downTo 1) {
        // in para contagem normal   // step para pular
        if (i == 4) {
            continue
            // break para parar e continue para pular determinar valor
        }


        val titular = "Felipe $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular : $titular")
        println("Numero da Conta : $numeroConta")
        println("Saldo da conta : $saldo")
        println()


    }
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta e positiva")
    } else if (saldo == 0.0) {
        println("Conta e neutra")
    } else {
        println("Conta e negativa")
    }

    when {
        saldo > 0.0 -> println("Conta e positiva")
        saldo == 0.0 -> println("Conta e neutra")
        else -> println("Conta e negativa")
    }
}