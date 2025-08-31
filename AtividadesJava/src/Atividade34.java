import java.util.Scanner;

public class Atividade34 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int cont = 0, num = 0;

        System.out.println("Digite um número: ");
        num = leia.nextInt();

        System.out.println("Números pares de 0 ate " + num  + ":" );


        while (cont < num) {
            if (cont % 2 == 0) {
                System.out.print(cont + " ");
            }
            cont++;
        }
    }
}
