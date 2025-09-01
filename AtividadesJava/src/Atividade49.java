import java.util.Scanner;

public class Atividade49 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double[][] notas = new double[3][2];
        double media = 0;

        for (int linha = 0; linha < notas.length; linha++) {
            System.out.println("Digite as notas do aluno " + (linha + 1) + ":");
            for (int coluna = 0; coluna < 2; coluna++) {
                System.out.print("Nota da prova " + (coluna + 1) + ": ");
                notas[linha][coluna] = leia.nextDouble();
            }
        }

        System.out.println("\nMédia de cada aluno:");
        for (int linha = 0; linha < notas.length; linha++) {
            media = (notas[linha][0] + notas[linha][1]) / 2;
            System.out.println("Aluno " + (linha + 1) + ": " + media);
        }
    }
}
