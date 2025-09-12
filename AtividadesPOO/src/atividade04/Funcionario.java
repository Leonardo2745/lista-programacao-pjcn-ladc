package atividade04;

public class    Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    //gets
    public String getNome() {
        return this.nome;
    }
    public double getSalarioBase() {
        return this.salarioBase;
    }

    //sets
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    //metodos
    public double calcularPagamento() {
        return this.salarioBase;
    }


    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("padrao", 0);
        Vendedor v1 = new Vendedor("padrao", 0, 500.0);
        Gerente g1 = new Gerente("padrao", 0, 1000.0);

        Folha folha = new Folha();

        f1.setNome("Leonardo");
        v1.setNome("Natan");
        g1.setNome("Cauã");

        f1.setSalarioBase(1658);
        v1.setSalarioBase(2000);
        g1.setSalarioBase(3568);


        folha.pagar(f1);
        folha.pagar(v1);
        folha.pagar(g1);
    }
}
