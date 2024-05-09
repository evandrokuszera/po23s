package aula08;

import aula07.ContaBancaria;
import aula07.ContaCorrente;
import aula07.ContaPoupanca;

public class Prog2 {
    public static void main(String[] args) {
        ContaBancaria[] contas = new ContaBancaria[4];
        contas[0] = new ContaPoupanca(1, "Ana", 4000, 10);
        contas[1] = new ContaCorrente(2, "Pedro", 1000, 25);
        contas[2] = new ContaPoupanca(3, "Rui", 1000, 10);
        contas[3] = new ContaCorrente(4, "Mel", 1000, 10);

        ProcessaContas proc = new ProcessaContas();
        for (ContaBancaria conta : contas){
            proc.bonificar(conta);
        }

        for (ContaBancaria conta : contas){
            System.out.println(conta.getInformacoes());
        }
    }
}
