package com.example.revisao;

public class Main {
    public static void main(String[] args) {
        //INSTANCIAR A CLASSE PROFESSOR.

        Professor objeto = new Professor("Marta","marta@gmail.com", "Matematica");
        Professor objeto2 = new Professor("Alvaro","alvaro@gmail.com", "Historia");

        System.out.println("Nome: " + objeto.getNome());
        System.out.println("Disciplina: " + objeto.getDisciplina());
        System.out.println("Email: " + objeto.getEmail());

        System.out.println("-----------------------------");

        System.out.println("Nome: " + objeto2.getNome());
        System.out.println("Disciplina: " + objeto2.getDisciplina());
        System.out.println("Email: " + objeto2.getEmail());

    }



}
