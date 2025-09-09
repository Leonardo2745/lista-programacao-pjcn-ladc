package exemplo04;

import java.util.Scanner;

public class Usuario extends Pessoa{
    private String userName;
    private String password;


    //Construtor herdeiro

    public Usuario(){
        super();
    }
    public Usuario(String nome, int idade, String userName, String password){
        super(nome,idade);
        this.userName = userName;
        this.password = password;
    }

    //Sobrescrita de metodo


    public void falar(){
        System.out.println("Oi, eu sou " + this.getNome() + ". Eu tenho " + this.getIdade() + " anos de idade"+
                "\nMeu nome de usuário na Steam é: " + this.userName);
    }
}
