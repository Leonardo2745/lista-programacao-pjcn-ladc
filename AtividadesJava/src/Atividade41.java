import java.util.Scanner;

public class Atividade41 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numeros[] = new int[5];

        System.out.println("Digite 5 números: ");

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i) + "º número:");
            numeros[i] = leia.nextInt();
        }

        System.out.println("Números digitados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
