import java.util.Scanner;

public class Atividade44 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double notas[] = new double[5], media = 0, soma = 0;

        System.out.println("Digite 5 notas");

        for (int i = 0; i < notas.length; i++){
            System.out.println("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = leia.nextDouble();
            soma += notas[i];
        }
            media = soma / notas.length;

        System.out.println("A média da turma é de " + Math.round(media) + " pontos");



    }
}
