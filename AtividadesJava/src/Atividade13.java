import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, d = 0, r = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        a = leia.nextInt();

        System.out.println("Digite o segundo valor: ");
        b = leia.nextInt();

        System.out.println("Digite o terceiro valor: ");
        c = leia.nextInt();

        System.out.println("Digite o quarto valor: ");
        d = leia.nextInt();

        r = (a + b) * c - d;

        System.out.println("O resultado de (" + a + " + " + b + ") * " + c + " - " + d + " é: " + r);

    }
}
