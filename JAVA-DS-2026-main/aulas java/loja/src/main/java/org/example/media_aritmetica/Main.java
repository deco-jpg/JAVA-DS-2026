package org.example.media_aritmetica;

public class Main {
    public static <string> void main(String[] args) {
        double n1 = 6.5;
        double n2 = 7.6;
        double media = (n1 + n2) / 2;
        String aluno = "Jose";


        if (media >= 7) {
            System.out.println("Nome:" + aluno);
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Nome:" + aluno);
            System.out.println("Aluno reprovado!");
        }

    }
}
