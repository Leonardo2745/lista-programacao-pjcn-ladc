import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n1 = 0, n2 = 0;

        System.out.println("Digite a primeira nota (0 a 10): ");
        n1 = leia.nextInt();

        System.out.println("Digite a segunda nota (0 a 10): ");
        n2 = leia.nextInt();

        if (n1 >=6 && n2 >= 6) {
            System.out.println("Aprovado");
        } else if (n1 >= 4 || n2 >= 4){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

    }
}
