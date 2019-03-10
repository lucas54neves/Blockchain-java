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
    
    public double GetSaldo() {
        return this.mSaldo;
    }
    
    public Pessoa GetTitular() {
        return mTitular;
    }

    public int GetAgencia() {
        return mAgencia;
    }

    public int GetConta() {
        return mConta;
    }
    
    public void Depositar(double valor) {
        this.mSaldo+=valor;
    }
    
    public void Sacar(double valor) {
        if (this.GetSaldo() < valor) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        } else {
            this.mSaldo-=valor;
        }
    }

    @Override
    public String toString() {
        return "## Conta ##" +
                "\nTitular: " + this.GetTitular().GetNome() +
                "\nAgência: " + this.GetAgencia() +
                "\nConta: " + this.GetConta() +
                "\nSaldo: " + this.GetSaldo();
    }
}