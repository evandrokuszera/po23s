package aula10;

import aula07.ContaCorrente;

public class Prog1 {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(1, "Rui", 1000, 25);
        System.out.println(cc1.getInformacoes());
        try {
            cc1.sacar(-10);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro... valores negativos não pode!");
        }
        System.out.println(cc1.getInformacoes());
    }
}
