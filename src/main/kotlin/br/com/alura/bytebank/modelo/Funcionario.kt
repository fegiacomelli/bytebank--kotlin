package br.com.alura.bytebank.modelo

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    // Antes de transformar em property
    // open fun Bonificacao(): Double {
    //        return salario * 0.1
    //    }

    abstract val bonificacao: Double

    // Opcao de property
    //   open val bonificacao get() = salario * 0.1
}

