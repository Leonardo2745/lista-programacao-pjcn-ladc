import java.util.Scanner;

public class Atividade33 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade = 0, somaIdade = 0, cont = 0;
        double media = 0;

        System.out.println("Digite sua idade (use um valor negativo para sair)");

        do {
            System.out.println("Insira a idade: ");
            idade = leia.nextInt();

            if (idade >= 0) {
                somaIdade += idade;
                cont++;
            }

        } while (idade >= 0);

        if (cont > 0) {
            media =  somaIdade / cont;
            System.out.println("Média das idades: " + Math.round(media));
        }
    }
}
