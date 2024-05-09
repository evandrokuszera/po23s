package aula08;

import aula07.ContaBancaria;
import aula07.ContaCorrente;

public class ProcessaContas {

    public void bonificar(ContaBancaria conta){
        if (conta instanceof ContaCorrente){
            // se a tarifa > 10 bonifica em 10%, senão em 5%
            ContaCorrente tempCorrente = (ContaCorrente) conta;
            if (tempCorrente.getTarifa() > 10){
                tempCorrente.depositar(tempCorrente.getSaldo() * 0.10);
            } else {
                tempCorrente.depositar(tempCorrente.getSaldo() * 0.05);
            }
        } else {
            // conta poupança
            conta.depositar(conta.getSaldo() * 0.10);
        }
    }
}
