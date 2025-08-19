public class AtividadeSala03 {
    public static void main(String[] args){
        int a = 15;
        int b = 20;
        int resultado = 0;

        System.out.println("Os números são: " + a + " e " + b + "\n---------------------- \nRESULTADOS");
        resultado = a+b;
        System.out.println("Soma: " + resultado);
        resultado = a-b;
        System.out.println("Subtração: " + resultado);
        resultado = a*b;
        System.out.println("Multiplicação: " + resultado);
        resultado = a/b;
        System.out.println("Divisão: " + resultado);
        System.out.println("-------------------------------------------- \nCOMPARAÇÃO:");
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
    }
}
