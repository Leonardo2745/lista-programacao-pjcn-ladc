import java.util.Scanner;

public class Atividade36 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num = 0, fatorial = 0, cont = 0;

        System.out.println("Digite um número para saber o seu fatorial: ");
        num = leia.nextInt();

        if (true) {
            fatorial = 1;
            cont = num;

            while (cont > 1) {
                fatorial *= cont ;
                cont--;
            }

            System.out.println("O fatorial de " + num + " é: " + fatorial);
        }

    }
}
