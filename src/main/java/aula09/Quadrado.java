package aula09;

public class Quadrado implements FormaGeometrica, Imprimiveis{
    private double lado;
    private String nome;

    public Quadrado(double lado, String nome) {
        this.lado = lado;
        this.nome = nome;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Area: " + this.calcularArea());
        System.out.println("Perimetro: " + this.calcularPerimetro());
    }
}
