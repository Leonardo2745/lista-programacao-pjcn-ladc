import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        int n = 0, quadrado = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        n = leia.nextInt();

        quadrado = n * n;

        System.out.println("Resultado final: " + quadrado);
    }
}
