import java.util.Scanner;

public class Atividade53 {

    public static boolean ePrimo(int x) {

        if (x <= 1) {
            return false;
        }
        if (x == 2) {
            return true;
        }
        if (x % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num = 0;

        System.out.println("Digite um número para saber se ele é primo: ");
        num = leia.nextInt();

        System.out.println("True = É primo / False = Não é primo \n" +
                "O número " + num + " é primo? = "+ePrimo(num));

    }
}
