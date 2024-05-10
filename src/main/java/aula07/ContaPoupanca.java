package aula07;

public class ContaPoupanca extends ContaBancaria {
    private double rendimento;

    public ContaPoupanca(int numero, String titular, double saldo, double rendimento){
        super(numero, titular, saldo);
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    @Override
    public void processar(){
        // 0.10
        // 10%
        double valorDoRendimento = this.getSaldo() * rendimento / 100;
        this.depositar(valorDoRendimento);
    }

    public String getInformacoes(){
        return "CP: " + super.getInformacoes() + " Rendimento: " + this.rendimento + "%";
    }
}
