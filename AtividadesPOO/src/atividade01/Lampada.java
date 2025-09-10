package atividade01;

public class Lampada {

    private boolean ligada;
    private int brilho;
    private String cor;

    // Construtor padrão
    public Lampada() {
        this.ligada = false;
        this.brilho = 0;
        this.cor = "branca";
    }

    // Construtor completo
    public Lampada(boolean ligada, int brilho, String cor) {
        this.ligada = ligada;
        setBrilho(brilho);
        this.cor = cor;
    }

    // Métodos
    public void ligar() {
        this.ligada = true;
        System.out.println("Lâmpada ligada.");
    }

    public void desligar() {
        this.ligada = false;
        System.out.println("Lâmpada desligada.");
    }


    public void aumentarBrilho(int valor) {
        setBrilho(this.brilho + valor);
        System.out.println("Brilho aumentado para: " + this.brilho);
    }

    public void reduzirBrilho(int valor) {
        setBrilho(this.brilho - valor);
        System.out.println("Brilho reduzido para: " + this.brilho);
    }

    public void mudarCor(String novaCor) {
        this.cor = novaCor;
        System.out.println("Cor alterada para: " + this.cor);
    }

    // Setter de brilho

    private void setBrilho(int brilho) {
        if (brilho < 0) {
            this.brilho = 0;
        } else if (brilho > 100) {
            this.brilho = 100;
        } else {
            this.brilho = brilho;
        }
    }


    public void mostrarLampada() {
        System.out.println("Ligada: " + ligada + " | Brilho: " + brilho + " | Cor: " + cor);
    }


    public static void main(String[] args) {


        Lampada lampada1 = new Lampada();
        lampada1.mostrarLampada();
        lampada1.ligar();
        lampada1.aumentarBrilho(35);
        lampada1.mudarCor("azul");
        lampada1.mostrarLampada();

        System.out.println();

        Lampada lampada2 = new Lampada(true, 70, "vermelha");
        lampada2.mostrarLampada();
        lampada2.reduzirBrilho(30);
        lampada2.desligar();
        lampada2.mostrarLampada();
    }
}
