package Banco;

import CartorioCivil.*;

public class Conta {
    private final Pessoa mTitular;
    private double mSaldo;
    private final int mAgencia, mConta;
    
    public Conta(Pessoa titular, int agencia, int conta) {
        this.mTitular = titular;
        this.mAgencia = agencia;
        this.mConta = conta;
        this.mSaldo = 0;
    }
    
    public double getSaldo() {
        return this.mSaldo;
    }
    
    public Pessoa getTitular() {
        return mTitular;
    }

    public int getAgencia() {
        return mAgencia;
    }

    public int getConta() {
        return mConta;
    }
    
    public void depositar(double valor) {
        this.mSaldo+=valor;
    }
    
    public void sacar(double valor) {
        if (this.getSaldo() < valor) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        } else {
            this.mSaldo-=valor;
        }
    }

    @Override
    public String toString() {
        return "## Conta ##" +
                "\nTitular: " + this.getTitular().getNome() +
                "\nAgência: " + this.getAgencia() +
                "\nConta: " + this.getConta() +
                "\nSaldo: " + this.getSaldo();
    }
}