package exemplo03;
import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Pessoa pessoa = new Pessoa("Pedro", 19);

        pessoa.falar();
        pessoa.setIdade(20);

        System.out.println("Correção, minha idade é " + pessoa.getIdade() + " anos");

        pessoa.setNome("Leonardo");

        System.out.println("Correção, meu nome é " + pessoa.getNome());

        pessoa.falar();


    }
}
