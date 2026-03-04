package com.example.atividade2;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Jubileu", 4, "Pitbull");
        Cliente cliente1 = new Cliente("Alvaro", 27,pet1);

        Cliente cliente2  = new Cliente("Morgan", 30,
                new Pet("Bob", 3, "Caramelo"));

        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("-----------------");
        System.out.println("Nome do pet: " + cliente1.getPet().getNome());
        System.out.println("Raça: " + cliente1.getPet().getRaca());
        System.out.println("Idade do pet: " + cliente1.getPet().getIdade());
    }
}
