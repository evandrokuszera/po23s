package aula04;

public class Pessoa {
    private String nome;
    int cpf;
    private int idade;

    public Pessoa(){
        nome = "Fulano";
        idade = 10;
    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(int cpf, String nome){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void fazerAniversario(){
        idade++;
    }

    public int getIdade(){
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
