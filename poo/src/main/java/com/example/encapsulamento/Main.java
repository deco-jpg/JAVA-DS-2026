package com.example.encapsulamento;

public class Main {
    public static void main(String[] args) {

    
    //Encapsulamento

    Cliente cliente1 = new Cliente();
    cliente1.setNome("Marta");
    cliente1.setIdade(22);

    Pet pet1 = new Pet();
    pet1.setNome("Jubileu");
    pet1.setIdade(5);

    Livro livro1 = new Livro();
    livro1.setNome("A divina comédia");
    livro1.setPreco(150.00);

    Funcionario funcionario1 = new Funcionario();
    funcionario1.setNome("Matias");
    funcionario1.setCargo("Gerente");
    funcionario1.setSalario(10.000);

    //Cliente:
    System.out.println("Nome " + cliente1.getNome());
    System.out.println("Idade " + cliente1.getIdade());
    //Pet:
    System.out.println("Nome " + pet1.getNome());
    System.out.println("Idade " + pet1.getIdade());
    //Livro:
    System.out.println("Nome " + livro1.getNome());
    System.out.println("Idade " + livro1.getPreco());
    //Funcionario:
    System.out.println("Nome " + funcionario1.getNome());
    System.out.println("Idade " + funcionario1.getCargo());
    System.out.println("Salário: " + funcionario1.getSalario());
    }
}
