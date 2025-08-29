import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double salario = 0;

        System.out.println("Digite o seu salário: ");
        salario = leia.nextDouble();

        if (salario > 3000){
            System.out.println("Você paga imposto");
        }else{
            System.out.println("Isento");
        }



    }

}
