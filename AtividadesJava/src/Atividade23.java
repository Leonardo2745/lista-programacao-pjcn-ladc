import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int k = 0;

        System.out.println("Digite um número para saber se é par ou ímpar: ");
        k = leia.nextInt();

        if (k % 2 == 0 ) {
            System.out.println("O número " + k + " é par");
        } else {
            System.out.println("O número " + k + " é ímpar");
        }


    }
}
