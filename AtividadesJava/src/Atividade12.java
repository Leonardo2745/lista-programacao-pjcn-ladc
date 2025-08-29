import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
    int x = 0, y = 0, quociente = 0, resto = 0;
    Scanner leia = new Scanner(System.in);

    System.out.println("Digite o primeiro número: ");
    x = leia.nextInt();

    System.out.println("Digite o segundo número: ");
    y = leia.nextInt();

    quociente = x / y;
    resto = x % y;

        System.out.println("Resultado de " + x + " dividido por " + y + ": " +
                "\nQuociente da divisão: " + quociente + "\nResto da divisão: " + resto);

    }


}
