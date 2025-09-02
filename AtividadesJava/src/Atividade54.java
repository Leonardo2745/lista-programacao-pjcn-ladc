import java.util.Scanner;

public class Atividade54 {
    public static double media(double[] notas, double soma){
        double media = 0;

        return media = soma / notas.length;

    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double notas[] = new double[3], soma = 0;
        System.out.println("Digite 5 notas");

        for (int i = 0; i < notas.length; i++){
            System.out.println("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = leia.nextDouble();
            soma += notas[i];

        }
        System.out.println("A média desse aluno é de " + Math.round(media(notas,soma)) + " pontos");
    }

}
