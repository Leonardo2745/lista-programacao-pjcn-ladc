import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        int x = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        x = leia.nextInt();


        System.out.println("O valor de " + x + " ao quadrado é: " + (x*=x));
    }

}
