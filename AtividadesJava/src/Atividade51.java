import java.util.Scanner;

public class Atividade51 {
    public static int soma(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int x = 0, y = 0;

        System.out.println("Digite o primeiro número:");
        x = leia.nextInt();
        System.out.println("Digite o segundo número:");
        y = leia.nextInt();

        System.out.println("A soma de " + x + " e " + y + " é: " + soma(x,y));
    }
}
