import java.util.Scanner;

public class Atividade20 {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);

            System.out.print("Digite a idade: ");
            int idade = leia.nextInt();

            System.out.print("Possui CNH? (Sim = true / Não = false): ");
            boolean temCNH = leia.nextBoolean();

            if (idade >= 18 && temCNH) {
                System.out.println("Autorizado a dirigir");
            } else {
                System.out.println("Não autorizado a dirigir");
            }

        }
    }



