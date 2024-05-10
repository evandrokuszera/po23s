package aula09;

public class Prog1 {
    public static void main(String[] args) {

        FormaGeometrica formas[] = new FormaGeometrica[3];
        formas[0] = new Retangulo(10,20, "Retangulo");
        formas[1] = new Quadrado(40, "Quadrado");
        formas[2] = new Quadrado(50, "Quadrado");

        for (FormaGeometrica forma : formas){
            Imprimiveis impr = (Imprimiveis) forma;
            impr.imprimir();
        }

    }
}
