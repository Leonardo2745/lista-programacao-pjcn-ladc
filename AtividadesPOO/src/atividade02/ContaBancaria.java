package atividade02;

import java.util.Scanner;

public class ContaBancaria {

    private String titular, numero;
    private double saldo;


    public ContaBancaria() {
        this.titular = "Leonardo";
        this.numero = "20";
        this.saldo = 0;
    }


    public ContaBancaria(String titular, String numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;

    }

    //Metodos

    public void depositar(double valor) {
        if (valor <= 0) {
            this.saldo = 0;
            System.out.println("Digite um valor de depósito válido!");
        } else {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " feito.");
        }
    }


    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Total do saque: " + valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " para " + destino.titular);
        } else {
            System.out.println("Falha: saldo insuficiente ou valor inválido.");

        }
    }

    //Gets

    public String getTitular() {
        return this.titular;
    }

    public String getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    // Sets

    public void setTitular(String valor) {
        this.titular = valor;
    }

    public void setNumero(String valor) {
        this.numero = valor;
    }



    public void dadosFinais() {
        System.out.println("Titular: " + getTitular() + "  - Número: " + getNumero() + " - Saldo: R$" + getSaldo());
    }


    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria("Titular2", "00", 1200.0);

        conta2.setTitular("Pimpeu");
        conta2.setNumero("4321");

        System.out.println("Dados iniciais dos titulares:");
        conta1.dadosFinais();
        conta2.dadosFinais();


        System.out.println("\nDigite o valor do depósito na conta do primeiro titular ");
        conta1.depositar(350);


        System.out.println("\nDigite o valor do saque da conta do segundo titular");
        conta2.sacar(70.0);


        System.out.println("\nValor de transferência do primeiro para o segundo titular");
        conta1.transferir(conta2, 300.0);


        System.out.println("\nDados finais dos titulares:");
        conta1.dadosFinais();
        conta2.dadosFinais();
    }
}


