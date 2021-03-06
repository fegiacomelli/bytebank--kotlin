import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val felipe = Cliente(nome = "Felipe", cpf = "", senha = 1)

    val contaFelipe = ContaCorrente(titular = felipe, numero = 1000)
    contaFelipe.deposita(200.0)

    println(contaFelipe.titular)
    println(contaFelipe.numero)
    println(contaFelipe.saldo)

    val greice = Cliente(nome = "Greice", cpf = "", senha = 2)

    val contaGreice = ContaPoupanca(numero = 1001, titular = greice)
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
    if (contaGreice.transfere(valor = 100.0, destino = contaFelipe)) {
        println("Transferencia sucedida")
    } else {
        println("Falha na Transferencia")
    }

    println("modelo.Conta Felipe: ${contaFelipe.saldo}")
    println("modelo.Conta Greice: ${contaGreice.saldo}")
}
