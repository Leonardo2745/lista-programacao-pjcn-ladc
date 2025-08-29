import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        int idadeAnos = 0, idadeMeses = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira a sua idade: ");
        idadeAnos = leia.nextInt();

        idadeMeses = idadeAnos * 12;

        System.out.println("Sua idade em meses é: " + idadeMeses);


    }
}
