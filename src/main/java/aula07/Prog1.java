package aula07;

public class Prog1 {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1, "Ana", 600);
        ContaBancaria conta2 = new ContaBancaria(2, "Pedro", 1600);

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
