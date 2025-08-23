import java.util.Scanner;

public class AtividadeSala10 {
    public static void main(String[] args) {
        int x = 5, contador = 0;

        while(contador < 10 ){
            System.out.println(x + "*" + contador + " = " + (x * contador));
            contador++;
        }
        // Componha um script que receba um valor inteiro do usuário e que retorne a
        // a tabuáda de multiplicação, de 0 a 10, equivalente.
        // Imprima a tabuáda mantendo o padrão abaixo de formatação:
        /*
            Tabuáda do número X:

            X * 0 = ?
         */
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira um número para saber a sua tabuada:");
        int numero = leia.nextInt();
        int cont = 0;
        while(cont < 10 ){
            System.out.println(numero + "*" + cont + " = " + (numero * cont));
            cont++;
        }
    }
}

