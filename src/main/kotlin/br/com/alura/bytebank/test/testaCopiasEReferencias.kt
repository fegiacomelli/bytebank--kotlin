import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCoiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome = "Joao", cpf = "", senha = 1)

    val contaJoao = ContaCorrente(joao, 1002)
    var contaMaria = ContaPoupanca(Cliente(
        nome = "Maria",
        cpf ="",
        senha = 2
    ), 1003)

    println("Titular conta joao: ${contaJoao.titular}")
    println("Titular conta maria: ${contaMaria.titular}")


    println(contaJoao)
    println(contaMaria)
}
