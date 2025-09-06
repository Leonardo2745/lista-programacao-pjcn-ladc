import java.util.Scanner;

public class Atividade53 {

    public static boolean ePrimo(int x) {

        if(x == 2 || x == 1)
            return true;

        if((x < 1) || (x % 2 == 0))
            return false;

        else
            return (x % 1 == 0 && x % x == 0);
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num = 0;

        System.out.println("Digite um número para saber se ele é primo: ");
        num = leia.nextInt();

    String resultado = ePrimo(num)? "é primo" : "não é primo";
        System.out.println("O número digitado " + resultado);

    }
}
