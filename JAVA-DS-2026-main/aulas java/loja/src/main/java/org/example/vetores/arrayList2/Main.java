import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        String resposta;
        double soma = 0;

        do {
            double nota;

            // Validação da nota
            while (true) {
                System.out.println("Digite uma nota (0 a 10):");
                nota = ler.nextDouble();

                if (nota >= 0 && nota <= 10) {
                    break;
                } else {
                    System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                }
            }

            notas.add(nota);
            soma += nota;

            System.out.println("Deseja inserir mais uma nota?");
            System.out.println("Pressione N para sair ou qualquer outra tecla para continuar:");
            resposta = ler.next();

        } while (!resposta.equalsIgnoreCase("n"));

        System.out.println("\nExibindo as notas:");
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }

        double media = soma / notas.size();
        System.out.println("\nMédia aritmética: " + media);

        ler.close();
    }
}
