import java.util.Scanner;

public class Atividade31 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num;
        int soma = 0;

        do {
            System.out.print("Digite um número (Digite 0 (Zero) para sair): ");
            num = leia.nextInt();

            if (num != 0) {
                soma += num;
            }
        } while (num != 0);

        System.out.println("A soma dos números digitados é: " + soma);

    }
}
