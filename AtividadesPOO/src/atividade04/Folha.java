package atividade04;

public class Folha {
    public void pagar(Funcionario f) {
        System.out.println("Pagando para: " + f.getNome() +
                "\nValor: R$ " + f.calcularPagamento());
        System.out.println();

    }
}

