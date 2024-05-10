package aula09;

public class Retangulo implements FormaGeometrica, Imprimiveis {
    private double base;
    private double altura;
    private String name;

    public Retangulo(double base, double altura, String name) {
        this.base = base;
        this.altura = altura;
        this.name = name;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void imprimir() {
        System.out.println("Nome: " + this.name);
        System.out.println("Area: " + this.calcularArea());
        System.out.println("Perimetro: " + this.calcularPerimetro());
    }
}
