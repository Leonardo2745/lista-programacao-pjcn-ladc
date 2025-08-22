import java.util.Scanner;

public class AtividadeSala07 {

    public static void main(String[] args) {
        //Exemplo com o SE(IF)
        int a = 5, b = -5, x = 30, y = 9;
        if (a < 0 && b < 0 && x < 0 && y < 0) {
            System.out.println("Todos os valores são negativos.");
        } else if (a < 0 || b < 0 || x < 0 || y < 0) {
            System.out.println("Pelo menos um valor é negativo.");
        } else {
            System.out.println("Todos os valores são positivos");
        }
        //Exemplo com o Escolha (Switch/Case)
        char opcao = 'S';
        switch (opcao) {
            case 'S':
                System.out.println("A opção 'S' foi escolhida");
                break;
            case 'N':
                System.out.println("A opção 'S' foi escolhida");
                break;
            default:
                System.out.println("A opção escolhida é inválida");
                break;
        }
//---------------------------------------------------------------------------------------------

        // LEITURA DE DADOS
        /*
        Bliblioteca Java.util.Scanner será utilizada para realizar a leitura de dados
        1- Faça um script que receba a idade de um usuário e que retorne se ele é maior de idade ou não.
        2- Faça um script que receba a inicial do sexo do usuário e que retorne o sexo completo utilizando a estrutra "switch".
         */

        Scanner leia = new Scanner(System.in);
        int idade = 0;

        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();

        if (idade >= 18) {
            System.out.println("Você já é maior de idade.");
        } else {
            System.out.println("Você é menor de idade");
        }

//------------------------------------------------------------



        System.out.println("Insira a inicial do seu sexo abaixo (m ou f):");
        char opcaoSexo = leia.next().toLowerCase().charAt(0);

        switch (opcaoSexo) {
            case 'm':
                System.out.println("Seu sexo é o masculino");
                break;
            case 'f':
                System.out.println("Seu sexo é o feminino");
                break;
            default:
                System.out.println("A opção escolhida é inválida");
                break;


        }
    }
}