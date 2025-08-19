public class AtividadeSala02 {
    public static void main(String[] args){
        String nome = "Leonardo";
        String sobrenome = "Augusto";
        int idade = 20;
        int anoNasc = 2005;
        double peso = 76.5;
        double altura = 1.90;
        double imc = 0;
        imc = peso/(altura*altura);

        System.out.println("Olá " + nome + " " + sobrenome);
        System.out.println("Você nasceu em " + anoNasc + " e tem " + idade + " anos!");
        System.out.println("Você pesa " + peso + "kgs e tem " + altura + " de altura!");
        System.out.println("Seu IMC é de: " + imc);
    }
}
