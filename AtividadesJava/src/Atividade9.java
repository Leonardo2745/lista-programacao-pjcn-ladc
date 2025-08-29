import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        double base = 0, altura= 0, perimetro = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a base: ");
        base = leia.nextDouble();

        System.out.println("Digite a altura: ");
        altura = leia.nextDouble();

        perimetro = 2 * (base + altura);

        System.out.println("O perímetro é: " + perimetro);

    }

}
