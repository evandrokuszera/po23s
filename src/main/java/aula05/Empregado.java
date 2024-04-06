package aula05;

import java.util.Objects;

public class Empregado {
    private static int counter = 1;
    private int id;
    private String nome;
    private double salario;

    public static void printCounter(){
        System.out.println("Instâncias de Empregado: " + (counter - 1));
    }

    public Empregado(String nome, double salario) {
        this.id = counter++;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString(){
        return String.format("Id: %d, Nome: %s, Salário: R$ %.2f",
                this.id, this.nome, this.salario);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empregado empregado)) return false;
        return Objects.equals(nome, empregado.nome);
    }
}
