package aula06;

public class Aluno extends Pessoa {
    private long ra;
    private float nota1, nota2;

    public Aluno(String nome, int idade, long ra, float nota1, float nota2){
        super(nome, idade);
        this.ra = ra;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public long getRa() {
        return ra;
    }

    public void setRa(long ra) {
        this.ra = ra;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
}
