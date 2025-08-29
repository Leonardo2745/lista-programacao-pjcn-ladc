import java.util.Scanner;

public class Atividade26 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int notaFinal = 0;

        System.out.println("Digite a nota final (0 a 10):");
        notaFinal = leia.nextInt();

       if(notaFinal >= 6){
           System.out.println("Aprovado");
       } else if(notaFinal >= 4 && notaFinal < 6){
           System.out.println("Recuperação");
       }else{
           System.out.println("Reprovado");
       }

    }
};