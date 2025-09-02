import java.util.Scanner;

public class Atividade60 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int a = 0, b = 0, c = 0;

        System.out.println("Digite o primeiro valor: ");
        a = leia.nextInt();

        System.out.println("Digite o segundo valor: ");
        b = leia.nextInt();

        System.out.println("Digite o terceiro valor: ");
        c = leia.nextInt();

        podeTriangulo(a, b, c);

    }


    public static void podeTriangulo(int a, int b, int c) {

        if (a < (b + c)) {
            if (b < (c + a)) {
                if (c < (a + b)) {
                    System.out.println("O triângulo pode ser formado");
                }
            }
        } else {
            System.out.println("O triângulo não pode ser formado ");
        }

    }
}
