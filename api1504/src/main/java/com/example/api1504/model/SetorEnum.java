package com.example.api1504.model;

public enum SetorEnum {
    FINANCEIRO ("Financeiro"),
    RECURSOS_HUMANOS ("Recursos humanos"),
    VENDAS ("Vendas"),
    MARKETING ("Marketing");

    private String nome;

    SetorEnum(String nome) {
        this.nome = nome;
    }
}
