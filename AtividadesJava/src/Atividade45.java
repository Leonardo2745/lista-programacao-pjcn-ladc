import java.util.Scanner;

public class Atividade45 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int vetor1[] = new int[5], vetor2[] = new int[5], vetorSoma[] = new int[5];


        //-------------------------------------------------------------------
        System.out.println("SOMA DE DOIS VETORES " +
                "\nInsira os números do primeiro vetor:");

        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Insira o " + (i + 1) + "º número:");
            vetor1[i] = leia.nextInt();
        }

        //-------------------------------------------------------------------

        System.out.println("Insira os números do segundo vetor");

        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Insira o " + (i + 1) + "º número:");
            vetor2[i] = leia.nextInt();
        }

        //----------------------------------------------

        System.out.print("Números do primeiro vetor: ");

        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i] + " ");
        }
//-----------------------------------------------------------

        System.out.print("\nNúmeros do segundo vetor: ");

        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i] + " ");
        }


//-----------------------------------------------------
        System.out.print("\nSoma dos elementos correspondentes: ");
        for (int i = 0; i < vetorSoma.length; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
            System.out.print(vetorSoma[i] + " ");
        }


    }
}
