import java.util.Scanner;

public class Atividade57 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int x = 0;

        System.out.println("Digite um número: ");
        x = leia.nextInt();

        parOuImpar(x);

    }

    public static void parOuImpar(int x){
        if(x % 2 == 0){
            System.out.println( x + " é par");
        }else{
            System.out.println( x + " é ímpar");
        }

    }
}
