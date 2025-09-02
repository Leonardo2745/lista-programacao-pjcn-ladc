import java.util.Scanner;

public class Atividade56 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Preencha o vetor com 5 números");

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i+1) + "º número: ");
            numeros[i] = leia.nextInt();
        }

        mostraVetor(numeros);
    }

    public static void mostraVetor(int[] vetor) {
        System.out.print("Elementos do vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
