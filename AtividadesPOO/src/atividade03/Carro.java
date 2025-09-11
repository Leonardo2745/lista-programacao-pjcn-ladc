package atividade03;

public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, double velocidade, int portas) {
        super(marca, modelo, velocidade);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }


    public String descricao() {
        return super.descricao() + ", portas: " + this.portas;
    }
}


