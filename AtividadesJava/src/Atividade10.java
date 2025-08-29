import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        double celsius = 0, fahrenheit = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius (ºC): ");
        celsius = leia.nextDouble();

        fahrenheit = (9 * celsius) / 5 + 32;

        System.out.println("Temperatura inserida: " + celsius + "ªC" +
                "\nTemperatura em Fahrenheit: " + fahrenheit + "ºF");
    }
}
