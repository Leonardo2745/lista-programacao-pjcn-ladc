package atividade03;

public class Veiculo {

    private String marca, modelo;
    private double velocidade;

    public Veiculo(String marca, String modelo, double velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    //gets
    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getVelocidade() {
        return this.velocidade;
    }

    //sets
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    //metods

    public void acelerar(double valor) {
        this.velocidade += valor;
    }

    public void frear(double valor) {
        this.velocidade = this.velocidade - valor;
    }

    public String descricao() {
        return "Veículo: " + this.marca + " " + this.modelo + ", velocidade: " + this.velocidade + " km/h";
    }


    public static void main(String[] args) {

        Veiculo carro = new Carro("Fiat", "Uno", 80, 4);

        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setVelocidade(120);
        carro.acelerar(10);


        System.out.println(carro.descricao());


        Veiculo moto = new Moto("Honda", "CB500", 100, 250);

        moto.setMarca("Yamaha");
        moto.setModelo("Fazer fz25");
        moto.setVelocidade(100);
        moto.acelerar(10);
        moto.frear(20);
        System.out.println(moto.descricao());
    }
}










