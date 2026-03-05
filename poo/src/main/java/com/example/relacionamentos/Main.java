package com.example.relacionamentos;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(1, "Dan", 23, "71999999", "dan@gmail.com", Sexo.MASCULINO, 
        new Endereco("Rua A", "5", "Fundo", "404400", "Salvador", 
        UnidadeFederativa.BAHIA));

        System.out.println(pessoa1.toString());

    }

}
