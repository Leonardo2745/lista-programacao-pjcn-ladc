package exemplo02;
import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Leonardo";
        pessoa.idade = 20;
        pessoa.falar();


    }
}
