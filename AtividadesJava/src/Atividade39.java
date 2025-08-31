import java.util.Scanner;

public class Atividade39 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = 0, primeiro = 0, segundo = 1, proximo = 0;

        System.out.println("Digite quantos números da sequência de Fibonacci serão mostrados: ");
        n = leia.nextInt();

        System.out.println("Os " + n + " primeiros números da sequência de Fibonacci são:");

        for (int i = 1; i <= n; i++) {
            System.out.print(primeiro + " ");

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
    }
}

