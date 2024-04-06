package aula05;

public class Prog4 {
    public static void main(String[] args) {
        Empregado empregados[] = new Empregado[3];
        empregados[0] = new Empregado("João", 1500);
        empregados[1] = new Empregado("Ana", 4500);
        empregados[2] = new Empregado("Pedro", 7500);

        Empregado e4 = new Empregado("Pedro", 7500);

        if (empregados[2].equals(e4)){
            System.out.println("são iguais");
        } else {
            System.out.println("diferentes");
        }
    }
}
