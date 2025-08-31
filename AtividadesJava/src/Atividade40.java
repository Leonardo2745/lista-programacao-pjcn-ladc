import java.util.Scanner;

public class Atividade40 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double num = 0, soma = 0, media = 0;

        System.out.println("Digite 5 números para saber sua média");

        for (int i = 1; i <= 5; i++){
            System.out.println("Digite o " + i + "º número: ");
            num = leia.nextDouble();
            soma += num;

            media = soma / i;
        }
            System.out.println("A média dos números digitados é: "+ Math.round(media));

    }
}
