package aula06;

public class Professor extends Pessoa {
    private int id;
    private double salario;

    public Professor(String nome, int idade, int id, double salario) {
        super(nome, idade);
        this.id = id;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
