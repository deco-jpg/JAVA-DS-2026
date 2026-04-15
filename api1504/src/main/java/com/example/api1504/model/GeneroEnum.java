package com.example.api1504.model;

public enum GeneroEnum {
    MASCULINO ('H',"Masculino"),
    FEMININO('F',"FEMININO");
    private char caractere;
    private String texto;

    GeneroEnum(char caractere, String texto) {
        this.caractere = caractere;
        this.texto = texto;
    }
    public char getCaractere() {
        return caractere;
    }
    public String getTexto(){
        return texto;
    }
}
