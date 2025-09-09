package exemplo04;
import java.util.Scanner;
public class Exemplo04 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Usuario user = new Usuario("Leonardo",20,"Ladekzada","1234567890");
        user.falar();
    }
}
