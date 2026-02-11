package org.example.vetores.vetorScanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double[] notas = new double[2];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {

            double nota;

            while (true) {
                System.out.println("Digite a " + (i + 1) + "ª nota (0 a 10):");
                nota = ler.nextDouble();

                if (nota >= 0 && nota <= 10) {
                    break; // nota válida, sai do loop
                } else {
                    System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                }
            }

            notas[i] = nota;
            soma += nota;
        }

        double media = soma / notas.length;

        System.out.println("\nExibindo notas:");
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }

        System.out.println("\nMédia aritmética: " + media);

        ler.close();
    }
}
