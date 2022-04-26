fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Felipe",
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = "Greice",
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
