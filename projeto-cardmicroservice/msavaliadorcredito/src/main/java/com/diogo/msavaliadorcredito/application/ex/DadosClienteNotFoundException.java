package com.diogo.msavaliadorcredito.application.ex;

public class DadosClienteNotFoundException extends Exception{
    public DadosClienteNotFoundException() {
        super("Dados do cliente nao encontrado para o CPF informado.");
    }
}
