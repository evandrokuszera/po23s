package aula08;

import aula07.ContaBancaria;
import aula07.ContaCorrente;
import aula07.ContaPoupanca;

public class Prog1 {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1,"Ana", 4000.0);
        System.out.println( conta1.getInformacoes() );

        ContaCorrente conta2 = new ContaCorrente(2,"Rui", 1000.0, 25.0);
        System.out.println( conta2.getInformacoes() );

        ContaPoupanca conta3 = new ContaPoupanca(3,"João", 1000.0, 10.0);
        System.out.println( conta3.getInformacoes() );
    }
}
