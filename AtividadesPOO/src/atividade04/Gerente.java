package atividade04;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double valor) {
        this.bonus = valor;
    }


    public double calcularPagamento() {
        return getSalarioBase() + this.bonus;
    }
}

