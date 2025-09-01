import java.util.Scanner;

public class Atividade52 {
    public static double fahrenheit(double celsius){
        double fahrenheit = 0;
        return fahrenheit = (9 * celsius) / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double celsius = 0;

        System.out.println("Digite a temperatura em Celsius: ");
        celsius = leia.nextDouble();

        System.out.println("Temperatura de " + celsius + "ºC em Fahrenheit: " + fahrenheit(celsius) + "ºF");


    }
}
