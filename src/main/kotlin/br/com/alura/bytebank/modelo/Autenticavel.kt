package br.com.alura.bytebank.modelo

interface Autenticavel {

     open fun autentica(senha: Int): Boolean

}