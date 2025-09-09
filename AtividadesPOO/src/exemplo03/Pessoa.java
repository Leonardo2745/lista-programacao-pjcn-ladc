package exemplo03;

public class Pessoa {


    //ENCAPSULAMENTO
    private String nome;
    private int idade;


    //CONSTRUTORES
    public Pessoa(){
        this.nome = "";
        this.idade = 0;
    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }

    //MÉTODOS GETS E SETS para ler ou alterar um atributo
    //Get = retorna // Set = muda

    //Gets
    public int getIdade(){
        return this.idade;
    }

    public String getNome(){
        return this.nome;
    }

    //Sets

    public void setIdade(int valor){
        this.idade = valor;
    }
    public void setNome(String valor){
        this.nome = valor;
    }


    public void falar(){
        System.out.println("Oi, eu sou " + this.nome + ". Eu tenho " + this.idade + " anos de idade");
    }
}
