package aula07;

public class Prog2 {
    public static void main(String[] args) {
        ContaCorrente conta3 = new ContaCorrente(3, "Rui", 1000, 25);
        ContaPoupanca conta4 = new ContaPoupanca(4, "Ivo", 1000, 10);

        conta4.sacar(50);
        System.out.println(conta4.getInformacoes());
        conta4.depositar(50);
        System.out.println(conta4.getInformacoes());
        conta4.sacar(-50);
        System.out.println(conta4.getInformacoes());
    }
}
