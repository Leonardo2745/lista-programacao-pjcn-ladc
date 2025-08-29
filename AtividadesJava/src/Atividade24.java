import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n1 = 0;

        System.out.println("Digite um número: ");
        n1 = leia.nextInt();

        if (n1 * n1 > 100) {
            System.out.println("Quadrado calculado");
        } else {
            System.out.println("Quadrado pequeno ou igual a 100");
        }

    }
}
