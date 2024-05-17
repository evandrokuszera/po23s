package aula07;

import aula10.SaldoInsuficienteException;

public class ContaCorrente extends ContaBancaria {
    private double tarifa;

    public ContaCorrente(int numero, String titular, double saldo, double tarifa){
        super(numero, titular, saldo);
        this.tarifa = tarifa;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public void processar() {
        try {
            this.sacar(tarifa);
        } catch (SaldoInsuficienteException e) {
            throw new RuntimeException(e);
        }
    }


    public String getInformacoes(){
        return "CC: " + super.getInformacoes() + " Tarifa: R$ " + this.tarifa;
    }
}
