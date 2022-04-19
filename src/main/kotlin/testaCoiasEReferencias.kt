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
