package aula08;

import aula07.ContaBancaria;
import aula07.ContaCorrente;

public class Prog3 {
    public static void main(String[] args) {
        ContaBancaria contas[] = new ContaBancaria[4];
        contas[0] = new ContaCorrente(1,"Ana1", 4000.0, 25);
        contas[1] = new ContaCorrente(2,"Ana2", 4000.0, 25);
        contas[2] = new ContaCorrente(3,"Ana3", 4000.0, 25);
        contas[3] = new ContaCorrente(4,"Ana4", 4000.0, 25);

        for (ContaBancaria cb : contas){
            cb.processar();
        }

    }
}
