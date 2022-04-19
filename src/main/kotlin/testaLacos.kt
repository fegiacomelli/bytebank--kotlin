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
