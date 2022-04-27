abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
     protected val  senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) ,Autenticavel {

    // Antes de transformar em property
    // open fun Bonificacao(): Double {
    //        return salario * 0.1
    //    }

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

    // Opcao de property
    //   open val bonificacao get() = salario * 0.1
}

