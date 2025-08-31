import java.util.Scanner;

public class Atividade32 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int senha = 0;

        System.out.println("Login (senha 1234)");


        do {
            System.out.println("Insira a senha: ");
            senha = leia.nextInt();

            if (senha == 1234){
                System.out.println("Acesso permitido");
            } else {
                System.out.println("Acesso negado, digite a senha correta!");
            }
        } while(senha != 1234);
    }
}
