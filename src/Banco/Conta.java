package Banco;

import CartorioCivil.*;

public class Conta{
    Pessoa titular;
    double saldo;
    int agencia, conta;

    public Conta(Pessoa titular, int agencia, int conta) {
        this.titular = titular;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = 0;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void sacar(double valor) {
        this.setSaldo(this.getSaldo() - valor);
    }
    
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }
    
    @Override
    public String toString() {
        return "## Conta ##" +
                "\nTitular: " + this.getTitular().getNome() +
                "\nAgência: " + this.getAgencia() +
                "\nConta: " + this.getConta() +
                "\nSaldo: " + this.getSaldo() +
                "\n";
    }
}
