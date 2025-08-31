import java.util.Scanner;

public class Atividade43 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numeros[] = new int[8];


        System.out.println("Digite 8 números");


        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i+1) + "º número:");
            numeros[i] = leia.nextInt();
        }

//---------------------------------------------------------------
        int maiorNum = numeros[0], menorNum = numeros[0];

        System.out.println("Maior número digitado: ");

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > maiorNum) {
                maiorNum = numeros[i];

            }
        }
        System.out.println(maiorNum);

//---------------------------------------------------------------

        System.out.println("Menor número digitado: ");

        for (int i = 0; i < numeros.length; i++){
            if(numeros[i] < menorNum){
                menorNum = numeros[i];
            }

        }
        System.out.println(menorNum);

    }
}
