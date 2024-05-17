package aula07;

import aula10.SaldoInsuficienteException;

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

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor < 0){
            throw new IllegalArgumentException("Erro: impossível sacar valor negativo.");
        }
        double tempSaldo = this.saldo - valor;
        if (tempSaldo < 0){
            throw new SaldoInsuficienteException("Erro: saldo insuficiente para realizar o saque.");
        }
        this.saldo = this.saldo - valor;
    }

    public void depositar(double valor){
        if (valor < 0){
            throw new IllegalArgumentException("Erro: impossível depositar valor negativo.");
        }
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
