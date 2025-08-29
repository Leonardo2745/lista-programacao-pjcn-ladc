import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        int a = 0, b = 0, soma = 0, subtracao = 0, produto = 0, quociente = 0 , resto = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        a = leia.nextInt();

        System.out.println("Digite o segundo número: ");
        b = leia.nextInt();

        soma = a + b;
        subtracao = a - b;
        produto = a * b;
        quociente = a / b;
        resto = a % b;

        System.out.println("Resultado das operações dos números " + a + " e " + b +
                "\nSoma: " + soma +
                "\nSubtração: " + subtracao +
                "\nMultiplicação: " + produto +
                "\nDivisão: " + quociente +
                "\nMódulo: " + resto);


    }
}
