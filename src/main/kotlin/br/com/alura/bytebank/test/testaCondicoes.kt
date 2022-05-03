fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("modelo.Conta e positiva")
    } else if (saldo == 0.0) {
        println("modelo.Conta e neutra")
    } else {
        println("modelo.Conta e negativa")
    }

    when {
        saldo > 0.0 -> println("modelo.Conta e positiva")
        saldo == 0.0 -> println("modelo.Conta e neutra")
        else -> println("modelo.Conta e negativa")
    }
}