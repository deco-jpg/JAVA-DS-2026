package org.example.lacorepeticao.doWhile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int avaliacao;

        do {
            System.out.println("Avalie nosso atendimento, de 1 a 5 estrelas: ");
            avaliacao = input.nextInt();
        } while (avaliacao < 1 || avaliacao > 5);

        System.out.println("Obrigado!");
    }
}
