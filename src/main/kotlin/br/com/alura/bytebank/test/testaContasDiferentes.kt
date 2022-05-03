import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Felipe",
            cpf = "111.111.111-11",
            senha = 1,
            endereco =  Endereco(
                logradouro = "Rua celso de azevedo marques"
            )
        ),
        numero = 1000
    )
    println("Titular")
    println("Nome do Titular ${contaCorrente.titular.nome}")
    println("Cpf do Titular ${contaCorrente.titular.cpf}")
    println("Endereco titular ${contaCorrente.titular.endereco}")


    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome = "Greice", cpf = "", senha = 2),
        numero = 1001
    )

    contaCorrente.deposita(valor = 1000.0)
    contaPoupanca.deposita(valor = 1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo Poupanca: ${contaPoupanca.saldo}")

    contaCorrente.saca(valor = 100.0)
    contaPoupanca.saca(valor = 100.0)

    println("saldo apos saque corrente: ${contaCorrente.saldo}")
    println("saldo apos saque Poupanca: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(valor = 100.0, contaCorrente)

    println("saldo poupanca apos transferir: ${contaPoupanca.saldo}")
    println("saldo corrente apos receber transfencia: ${contaCorrente.saldo}")
}
