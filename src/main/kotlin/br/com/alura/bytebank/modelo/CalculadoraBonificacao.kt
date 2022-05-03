package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Funcionario

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }

//    Nao e necessario devido ao polimorfismo,podem ser acessadas pelo modelo.Funcionario

//    fun registra(gerente: modelo.Gerente) {
//        this.total += gerente.bonificacao
//    }
//
//    fun registra(diretor: modelo.Diretor) {
//        this.total += diretor.bonificacao
//    }




}