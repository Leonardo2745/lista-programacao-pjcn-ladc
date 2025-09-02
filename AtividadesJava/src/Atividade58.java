import java.util.Scanner;

public class Atividade58 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Preencha a matriz abaixo: ");

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                System.out.print("Digite o elemento da posição [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = leia.nextInt();

            }

        }
            mostraMatriz(matriz);
    }
        public static void mostraMatriz (int[][] matriz){

            System.out.println("\nMatriz digitada");
            for (int l = 0; l < matriz.length; l++){
                for (int c = 0; c < matriz.length; c++){
                System.out.print(matriz[l][c] + "\t ");
                }
                System.out.println();
            }



        }
}
