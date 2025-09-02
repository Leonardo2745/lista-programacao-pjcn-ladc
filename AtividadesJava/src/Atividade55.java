import java.util.Scanner;

public class Atividade55 {
    public static int fatorial(int valor){
        if (valor == 0)
            return 1;
        else
            return valor * fatorial(valor - 1);
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valor = 0;

        System.out.println("Fatorial \n" + "Digite um número:");
        valor = leia.nextInt();

        System.out.println("O fatorial do número " + valor + " é: " + fatorial(valor));

    }
}

