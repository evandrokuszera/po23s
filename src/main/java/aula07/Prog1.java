package aula07;

import com.sun.source.tree.ConstantCaseLabelTree;

public class Prog1 {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaCorrente(1, "Ana", 600, 25);
        ContaBancaria conta2 = new ContaPoupanca(2, "Pedro", 1600, 10);

        System.out.println( conta1.getInformacoes() );
        System.out.println( conta2.getInformacoes() );

        ContaCorrente conta3 = new ContaCorrente(3, "Rui", 1000, 25);
        System.out.println(conta3.getInformacoes());
        conta3.processar();
        System.out.println(conta3.getInformacoes());

        ContaPoupanca conta4 = new ContaPoupanca(4, "Ivo", 1000, 10);
        System.out.println(conta4.getInformacoes());
        conta4.processar();
        System.out.println(conta4.getInformacoes());
    }
}
