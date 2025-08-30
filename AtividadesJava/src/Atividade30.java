import java.util.Scanner;

public class Atividade30 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);


        System.out.println("Digite uma das letras A,B,C ou D: ");
        char letra = leia.nextLine().toLowerCase().charAt(0);

        switch (letra) {
            case 'a':
                System.out.println("Letra A digitada");
                break;
            case 'b':
                System.out.println("Letra B digitada");
                break;
            case 'c':
                System.out.println("Letra C digitada");
                break;
            case 'd':
                System.out.println("Letra D digitada");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
