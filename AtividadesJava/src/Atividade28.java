import java.util.Scanner;

public class Atividade28 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num = 0;

        System.out.println("Digite um número de 1 a 7:");
        num = leia.nextInt();

        switch (num) {
            case 1:
                System.out.println("Dia da semana: Domingo");
            break;
            case 2:
                System.out.println("Dia da semana: Segunda-feira");
            break;
            case 3:
                System.out.println("Dia da semana: Terça-feita");
            break;
            case 4:
                System.out.println("Dia da semana: Quarta-feira");
            break;
            case 5:
                System.out.println("Dia da semana: Quinta-feira");
            break;
            case 6:
                System.out.println("Dia da semana: Sexta-feira");
            break;
            case 7:
                System.out.println("Dia da semana: Sábado");
            break;
            default:
                System.out.println("Número inválido");
                break;
        }
    }
}
