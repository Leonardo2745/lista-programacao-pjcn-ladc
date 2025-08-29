import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        int a = 0, b = 0,soma = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        a = leia.nextInt();

        System.out.println("Digite o segundo número: ");
        b = leia.nextInt();

        soma = (a + b);

        System.out.println("A soma de " + a + " e " + b + " é: " + soma);



    }
}
