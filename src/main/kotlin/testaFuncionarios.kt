fun testaFuncionarios() {
    val felipe = Funcionario(
        nome = "Felipe",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("Nome: ${felipe.nome}")
    println("cpf: ${felipe.cpf}")
    println("Salario: ${felipe.salario}")
    println("bonificacao ${felipe.bonificacao}")

    val greice = Gerente(
        nome = "Greice",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("Nome: ${greice.nome}")
    println("cpf: ${greice.cpf}")
    println("Salario: ${greice.salario}")
    println("bonificacao ${greice.bonificacao}")

    if (greice.autentica(senha = 1234)) {
        println("Autenticou com sucesso !!!")
    } else {
        println("Falha na autenticacao")
    }

    val ricardo = Diretor(
        nome = "Ricardo",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("Nome: ${ricardo.nome}")
    println("cpf: ${ricardo.cpf}")
    println("Salario: ${ricardo.salario}")
    println("bonificacao ${ricardo.bonificacao}")
    println("PLR ${ricardo.plr}")

    if (ricardo.autentica(senha = 4000)) {
        println("Autenticou com sucesso !!!")
    } else {
        println("Falha na autenticacao")
    }

    val jo = Analista(
        nome = "Joana",
        cpf = "444.444.444-44",
        salario = 3000.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(felipe)
    calculadora.registra(greice)
    calculadora.registra(ricardo)
    calculadora.registra(jo)

    println("Total de bonificacao: ${calculadora.total}")
}
