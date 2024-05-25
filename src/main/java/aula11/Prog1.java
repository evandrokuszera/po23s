package aula11;

import aula06.Pessoa;
import aula07.ContaCorrente;
import aula07.ContaPoupanca;

public class Prog1 {
    public static void main(String[] args) {
        Banco bb = new Banco("Banco do Brasil", new Pessoa("Marcos", 65));

        ContaCorrente c1 = new ContaCorrente(1, "Raul", 300, 25);
        bb.addConta(c1);
        bb.addConta( new ContaCorrente(2, "Maria", 500, 25) );
        bb.addConta( new ContaPoupanca(3, "Pedro", 500, 1) );

        bb.listContas();

        System.out.println();

        System.out.println("Conta(2): ");
        System.out.println( bb.getConta(2).getInformacoes() );

        System.out.println();

        bb.listarContasCorrente();
    }
}
