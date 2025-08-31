import java.util.Scanner;

public class Atividade38 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);
        int x = 0;

        System.out.println("Digite um número para ver a tabuada:");
        x = leia.nextInt();

        System.out.println("Tabuada do número " + x + ":");
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println( x + " * " + i + " = " + (x * i));

        }
    }
}
