import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int z = 0;

        System.out.println("Digite um número inteiro para saber se é positivo ou negativo: ");
        z = leia.nextInt();

        if(z > 0) {
            System.out.println("O número " + z + " é positivo");
        }else if (z < 0) {
            System.out.println("O número " + z + " é negativo");
        } else{
            System.out.println("O número digitado foi 0(Zero)");
        }
    }

}
