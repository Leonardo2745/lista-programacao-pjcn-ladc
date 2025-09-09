package exemplo01;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Leonardo";
        pessoa.idade = 20;

        System.out.println("Nome: " + pessoa.nome+
                "\nIdade: " + pessoa.idade);

    }

}
