fun main() {
    println("Bem vindo ao Bytebank")

    val felipe = Funcionario(
        nome = "Felipe",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("Nome: ${felipe.nome}")
    println("cpf: ${felipe.cpf}")
    println("Salario: ${felipe.salario}")
    println("Bonificacao ${felipe.bonificacao()}")

    val greice = Gerente(
        nome = "Greice",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("Nome: ${greice.nome}")
    println("cpf: ${greice.cpf}")
    println("Salario: ${greice.salario}")
    println("Bonificacao ${greice.bonificacao()}")

    if(greice.autentica(senha = 1234)){
        println("Autenticou com sucesso !!!")
    } else {
        println("Falha na autenticacao")
    }

}


