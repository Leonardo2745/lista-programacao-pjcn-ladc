import java.util.Scanner;

public class Atividade50 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int [][] num = new int[3][3];

        System.out.println("Digite 9 números");

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

        System.out.println("\nValores da matriz ao quadrado:");
        for (int linha = 0; linha < num.length; linha++) {
            for (int coluna = 0; coluna < num.length; coluna++) {
                System.out.print((num[linha][coluna] * num[linha][coluna]) + "\t");
            }
            System.out.println();
        }

    }
}
