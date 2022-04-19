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