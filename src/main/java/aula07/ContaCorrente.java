package aula07;

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

    public void processar(){
        this.sacar(tarifa);
    }


    public String getInformacoes(){
        return "CC: " + super.getInformacoes() + " Tarifa: R$ " + this.tarifa;
    }
}
