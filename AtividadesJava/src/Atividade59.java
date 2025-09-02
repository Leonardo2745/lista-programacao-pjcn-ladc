import java.util.Scanner;

public class Atividade59 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double[] vetor = new double[10];
        double soma = 0;

        System.out.println("Digite 10 números");

        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite o " + (i+1) + "º número: ");
            vetor[i] = leia.nextDouble();
            soma += vetor[i];

        }
        mostreMedia(vetor,soma);

    }
    public static void mostreMedia(double[] vetor, double soma){
        double media = 0;

        media = soma / vetor.length;

        System.out.println("\nA média dos números digitados no vetor é: " + Math.round(media));

    }

}
