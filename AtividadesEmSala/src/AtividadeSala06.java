public class AtividadeSala06 {
    public static void main(String[] args) {
        int a = 5, b = -5, x = 30, y = 9;
        boolean teste, verdadeiro = true, falso = false;

        teste = (a > b) || (a < b);
        System.out.println("(a > b) || (a < b): " + teste);

        
        System.out.println("---------------------------");
        teste = verdadeiro || falso;
        System.out.println(teste);

        teste = !(falso || falso) && verdadeiro;
        System.out.println(teste);

        teste = verdadeiro || falso && verdadeiro;
        System.out.println(teste);

        teste = verdadeiro && !(falso && falso);
        System.out.println(teste);



    }
}
