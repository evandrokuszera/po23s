package aula07;

public abstract class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public abstract void processar();

    public void sacar(double valor){
        if (valor < 0){
            System.out.println("Sacar: impossível sacar valor negativo.");
            return;
        }
        this.saldo = this.saldo - valor;
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    public String getInformacoes(){
        return String.format("Número: %d, Titular: %s, Saldo: R$ %.2f",
                this.numero, this.titular, this.saldo
        );
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
