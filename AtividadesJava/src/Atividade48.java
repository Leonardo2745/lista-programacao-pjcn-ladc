import java.util.Scanner;

public class Atividade48 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int [][] num = new int[4][4];
        int maiorNum = 0, colunaMaior = 0, linhaMaior = 0;

        System.out.println("Digite valores para preencher a matriz");

        for (int linha = 0; linha < num.length; linha++){
            for (int coluna = 0; coluna < num.length; coluna++){
                System.out.print("Digite o valor da posição [" + linha + "]" + "[" + coluna + "]: ");
                num[linha][coluna] = leia.nextInt();

            if (num[linha][coluna] > maiorNum) {
                maiorNum = num[linha][coluna];
                linhaMaior = linha;
                colunaMaior = coluna;

            }
            }

        }

        System.out.println("Maior número encontrado: "+maiorNum +
                "\nPosição do maior número: [" + linhaMaior +"] [" + colunaMaior + "]");

    }
}
