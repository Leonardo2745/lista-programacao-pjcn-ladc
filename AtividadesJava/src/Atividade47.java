import java.util.Scanner;

public class Atividade47 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[][] num = new int[3][3];

        System.out.println("Digite os valores da matriz:");

        for (int linha = 0; linha < num.length; linha++) {
            for (int coluna = 0; coluna < num.length; coluna++) {
                System.out.print("Digite o valor da posição [" + linha + "][" + coluna + "]: ");
                num[linha][coluna] = leia.nextInt();

            }
        }

        System.out.println("\nMatriz digitada:");
        for (int linha = 0; linha < num.length; linha++) {
            for (int coluna = 0; coluna < num.length; coluna++) {
                System.out.print(num[linha][coluna] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nElementos da diagonal principal:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i][i] + " ");
        }
    }
}