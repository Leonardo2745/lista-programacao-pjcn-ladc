import java.util.Scanner;

public class Atividade42 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);
        int numeros[] = new int[10];

        System.out.println("Digite 10 números: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i+1) + "º número:");
            numeros[i] = leia.nextInt();
        }

        System.out.println("Números pares digitados:");

        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] % 2 == 0){
                System.out.print(numeros[i] + " ");
            }
        }

    }

}
