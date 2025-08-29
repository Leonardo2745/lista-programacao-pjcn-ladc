import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        int p = 0, q = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        p = leia.nextInt();

        System.out.println("Digite o segundo número:");
        q = leia.nextInt();

            if(p > q) {
                System.out.println("O número " + p + " é maior que o número " + q);
            }else if (p < q){
                System.out.println("O número " + p + " é menor que o número " + q);
            }else{
                System.out.println("Os números são iguais");
            }
    }
}
