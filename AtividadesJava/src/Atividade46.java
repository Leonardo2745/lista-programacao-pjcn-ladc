import java.util.Scanner;

public class Atividade46 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[][] num = new int[2][2];
        int soma = 0;


        System.out.println("Digite os valores da matriz:");

        for (int linha = 0; linha < num.length; linha++) {
            for (int coluna = 0; coluna < num.length; coluna++) {
                System.out.print("Digite o valor da posição [" + linha + "][" + coluna + "]: ");
                num[linha][coluna] = leia.nextInt();
                soma += num[linha][coluna];
            }
        }


        System.out.println("\nMatriz digitada:");
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                System.out.print(num[linha][coluna] + "\t");
            }
            System.out.println();
        }


        System.out.println("\nSoma de todos os elementos da matriz: " + soma);


    }
}
