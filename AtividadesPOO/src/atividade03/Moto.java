package atividade03;


public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, double velocidade, int cilindradas) {
        super(marca, modelo, velocidade);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String descricao() {
        return super.descricao() + ", cilindradas: " + this.cilindradas;
    }
}


