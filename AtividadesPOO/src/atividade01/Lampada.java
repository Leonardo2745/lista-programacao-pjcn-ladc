package atividade01;
import java.util.Scanner;

public class Lampada {

    private boolean ligada;
    private int brilho;
    private String cor;


    public Lampada(){
        this.ligada = false;
        this.brilho = 0;
        this.cor = "Branca";
    };

    public Lampada(boolean ligada, int brilho, String cor){
        this.ligada = ligada;
        this.brilho = brilho;
        this.cor = cor;
    }


    //Métodos

    public void ligar(){
        System.out.println("A lâmpada foi acesa!");
        this.ligada = true;
    }
    public void desligar(){
        System.out.println("A lâmpada foi apagada!");
        this.ligada = true;
    }
    public void aumentarBrilho(){
        System.out.println("Aumentar quantos níveis de brilho: ");

    }
    public void reduzirBrilho(){
        System.out.println("Diminuir quantos níveis de brilho: " + this.brilho);

    }
    public void mudarCor(){
        System.out.println("Cor da lâmpada: " + this.cor);
    }


    //Gets e sets

    //gets

    public boolean getLigada(){
        return this.ligada;
    }

    public int getBrilho(){
        return this.brilho;
    }

    public String getCor(){
        return this.cor;
    }

    //sets

    public void setLigada(boolean valor){
        this.ligada = valor;

    }
    public void setBrilho(int valor){

        if (valor >= 0 && valor <= 100){
        this.brilho = valor;
        } else {
            System.out.println("Valor inválido, digite um valor de 0 a 100");
        }

    }
    public void setCor(String valor){
        this.cor = valor;

    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Lampada lampada = new Lampada(true,0,"Azul");

        lampada.ligar();
        lampada.desligar();
        lampada.aumentarBrilho();
        lampada.setBrilho(33);
        System.out.println("Brilho definido para: " + lampada.getBrilho());









    }

}
