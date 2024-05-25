package aula11;

import aula06.Pessoa;
import aula07.ContaBancaria;
import aula07.ContaCorrente;
import aula07.ContaPoupanca;

import java.util.ArrayList;

public class Banco {
    private final String nome;
    private Pessoa gerente;
    private ArrayList<ContaBancaria> contas;

    public Banco(String nome, Pessoa gerente) {
        this.nome = nome;
        this.gerente = gerente;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getGerente() {
        return gerente.getNome();
    }

    public void addConta(ContaBancaria novaConta){
        for (ContaBancaria conta : this.contas){
            if (conta.getNumero() == novaConta.getNumero()){
                System.out.println("Erro: conta já existente!");
                return;
            }
        }
        this.contas.add(novaConta);
    }

    public void listContas(){
        for (ContaBancaria conta : this.contas){
            System.out.println(conta.getInformacoes());
        }
    }

    public ContaBancaria getConta(int numero){
        for (ContaBancaria conta : this.contas){
            if (conta.getNumero() == numero){
                return conta;
            }
        }
        return null;
    }

    public void removeConta(int numero){
        for (ContaBancaria conta : this.contas){
            if (conta.getNumero() == numero){
                this.contas.remove(conta);
                return;
            }
        }
    }

    public void listarContasCorrente(){
        System.out.println(this.getNome());
        System.out.println("---------------------------");
        for (ContaBancaria conta : this.contas){
            if (conta instanceof ContaCorrente){
                System.out.println(conta.getInformacoes());
            }
        }
    }

//    public void listarContasPoupanca(){}
//    public double getSaldoTotal(){}
//    public ContaBancaria getContaComMaiorSaldo(){}

}
