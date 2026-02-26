package com.example.encapsulamento;

public class Main {
    public static void main(String[] args) {

    
    //Encapsulamento
    Cliente cliente1 = new Cliente("Marta", 22);

    Livro livro1 = new Livro("A divina comedia", "Dante", 320, 150.00);

    Funcionario funcionario1 = new Funcionario();
    funcionario1.setNome("Matias");
    funcionario1.setCargo("Gerente");
    funcionario1.setSalario(10.000);

    Aluno aluno1 = new Aluno("Pedro", "pedro@gmail.com");
    
    Pet pet1 = new Pet("Bob", 10, "Poodle", "Médio", "Ração pedigree");
    Pet pet2 = new Pet("Fred", 3, "Ciamês", "Pequeno", "Whiskas");

    //Aluno:
    System.out.println("Aluno");
    System.out.println("Nome: " + aluno1.getNome());
    System.out.println("Email: " + aluno1.getEmail());
    
    //Cliente:
    System.out.println("-----------------------------");
    System.out.println("Cliente");
    System.out.println("Nome: " + cliente1.getNome());
    System.out.println("Idade: " + cliente1.getIdade());

    //Livro
     System.out.println("-----------------------------");
     System.out.println("Livro");
     System.out.println("Titulo: " + livro1.getTitulo());
     System.out.println("Autor: " + livro1.getAutor());
     System.out.println("Número de páginas: " + livro1.getNumero_paginas());
     System.out.println("Preço: " + livro1.getPreco());
    
    //Funcionario:
    System.out.println("-----------------------------");
    System.out.println("Funcionário");
    System.out.println("Nome: " + funcionario1.getNome());
    System.out.println("Idade: " + funcionario1.getCargo());
    System.out.println("Salário: " + funcionario1.getSalario());

    // Pets1
    System.out.println("-----------------------------");
    System.out.println("Pets 1");
    System.out.println("Nome: " + pet1.getNome());
    System.out.println("Idade: " + pet1.getIdade());
    System.out.println("Raça: " + pet1.getRaca());
    System.out.println("Porte: " + pet1.getPorte());
    System.out.println("Alimentação: " + pet1.getAlimentacao());
    // Pets2
    System.out.println("-----------------------------");
    System.out.println("Pets 2");
    System.out.println("Nome: " + pet2.getNome());
    System.out.println("Idade: " + pet2.getIdade());
    System.out.println("Raça: " + pet2.getRaca());
    System.out.println("Porte: " + pet2.getPorte());
    System.out.println("Alimentação: " + pet2.getAlimentacao());
    }
}
