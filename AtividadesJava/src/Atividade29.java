import java.util.Scanner;

public class Atividade29 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int a = 0, b = 0, opcao = 0, soma = 0, subtracao = 0, multiplicacao = 0, divisao = 0;

        System.out.println("Digite o primeiro número: ");
        a = leia.nextInt();

        System.out.println("Digite o segundo número: ");
        b = leia.nextInt();

        soma = a + b;
        subtracao = a - b;
        multiplicacao = a * b;
        divisao = a / b;

        System.out.println("1 - Somar \n2 - Subtrair \n3 - Multiplicar \n4 - Dividir" +
                "\nSelecione uma opção acima:");
        opcao = leia.nextInt();

        switch (opcao){
                case 1:
                System.out.println("SOMA: \n" + a + " + " + b + " = " + soma);
                break;
                case 2:
                System.out.println("SUBTRAÇÃO: \n" + a + " - " + b + " = " + subtracao);
                break;
                case 3:
                System.out.println("MULTIPLICAÇÃO: \n" + a + " * " + b + " = " + multiplicacao);
                break;
                case 4:
                System.out.println("DIVISÃO: \n" + a + " / " + b + " = " + divisao);
                break;
            default:
                System.out.println("Número inválido");
        }






    }
}
