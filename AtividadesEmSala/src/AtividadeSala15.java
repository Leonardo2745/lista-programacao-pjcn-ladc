import java.util.Scanner;

public class AtividadeSala15 {

    public static double soma(double x, double y) {
        return x + y;
    }

    public static double subtrair(double x, double y) {
        return x - y;
    }

    public static double multiplicacao(double x, double y) {
        return x * y;
    }

    public static double divisao(double x, double y) {
        if (y != 0)
            return x / y;
        else
            return 0;
    }


    public static String printResultado(char operador, double x, double y, double resultado) {
        String texto = x + " " + operador + y + " = " + resultado + "\n";
        System.out.println(texto);
        return texto;
    }

    public static double potenciacao(double x, int expoente) {
        double resultado = x; // resultado = 2
        for (int n = 0; n < (expoente - 1); n++) {
            resultado = resultado * x;
            //2 = 2 * 2
        }
        return resultado;
    }

    public static void main(String[] args) {

        //Utilizando funções e procedimentos faça:
        /*
        1- Quatros operações básicas da matemática (soma, subtração, divisão, multiplicação)
        2- Metodo para calcular a potência de um número real elevado a um número inteiro, tal como: potenciacao(numero,expoente);
        3- Faça um menu para escolha das 5 operações e a opção de sair;
        4- Crie um procedimento que dado o 'char' da operação, imprima os valores, tal como: printResultado(op,x,y);
        6- Se opção 'sair' escolhido, listar todas as operações realizadas;
         */
        Scanner leia = new Scanner(System.in);
        int opcao = -1;
        String historico = "Histórico: \n";

        do {
            System.out.println("Calculadora: \n Escolha uma das opções abaixo.");
            System.out.println(
                    "1- Soma \n" +
                            "2- Subtração \n" +
                            "3- Multiplicação \n" +
                            "4- Divisão \n" +
                            "5- Potenciação \n" +
                            "0- Sair \n"


            );
            opcao = leia.nextInt();
            double x = 0;
            double y = 0;
            switch (opcao) {
                case 1:
                    System.out.println("Soma: ");
                    System.out.println("Digite valor para X:");
                    x = leia.nextDouble();
                    System.out.println("Digite valor para Y:");
                    y = leia.nextDouble();
                    historico += printResultado('+', x, y,soma(x,y));
                    break;
                case 2:
                    System.out.println("Subtração: ");
                    System.out.println("Digite valor para X:");
                    x = leia.nextDouble();
                    System.out.println("Digite valor para Y:");
                    y = leia.nextDouble();
                    historico += printResultado('-', x, y, subtrair(x, y));
                    break;
                case 3:
                    System.out.println("Multiplicação: ");
                    System.out.println("Digite valor para X:");
                    x = leia.nextDouble();
                    System.out.println("Digite valor para Y:");
                    y = leia.nextDouble();
                    historico += printResultado('*', x, y, multiplicacao(x, y));
                    break;
                case 4:
                    System.out.println("Divisão: ");
                    System.out.println("Digite valor para X:");
                    x = leia.nextDouble();
                    System.out.println("Digite valor para Y:");
                    y = leia.nextDouble();
                    historico += printResultado('/', x, y, divisao(x, y));
                    break;
                case 5:
                    System.out.println("Potênciação: ");
                    System.out.println("Digite o valor da base:");
                    x = leia.nextDouble();
                    System.out.println("Digite do expoente:");
                    int e = leia.nextInt();
                    historico += printResultado('^', x, e, potenciacao(x, e));
                    break;
                case 0:
                    System.out.println("Você escolheu sair. \n " +
                            "Segue abaixo o resumo das operações realizadas.");
                    System.out.println(historico);
                    break;
                default:
                    System.out.println("Opção não encontrada!");
                    break;

            }
        } while (opcao != 0);

    }
}