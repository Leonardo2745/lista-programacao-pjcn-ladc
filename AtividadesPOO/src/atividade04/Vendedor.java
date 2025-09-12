package atividade04;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }

    public double getComissao() {
        return this.comissao;
    }

    public void setComissao(double valor) {
        this.comissao = valor;
    }

    public double calcularPagamento() {
        return getSalarioBase() + this.comissao;
    }
}
