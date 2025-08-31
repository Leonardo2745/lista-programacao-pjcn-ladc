import java.util.Scanner;

public class Atividade35 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num = 0, maiorNum = 0;

        System.out.println("Digite alguns números (digite -1 para mostrar o maior):");

        while (true) {
            num = leia.nextInt();
            if (num == -1) {
                break;
            }
            if (num > maiorNum) {
                maiorNum = num;
            }
        }
        System.out.println("O maior número digitado foi: " + maiorNum);
        }


    }

