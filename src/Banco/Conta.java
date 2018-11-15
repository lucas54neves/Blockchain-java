package Banco;

import java.util.Date;

public class Conta {
    private final int mAgencia;
    private final int mConta;
    private double mSaldo;

    public Conta(int mAgencia, int mConta) {
        this.mAgencia = mAgencia;
        this.mConta = mConta;
        this.mSaldo = 0.0;
    }
    
    public void Depositar(double valor) {
        this.mSaldo = this.mSaldo + valor;
    }
    
    public void Sacar(double valor) {
        if (valor > this.mSaldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.mSaldo = this.mSaldo - valor;
        }
    }

    public int GetAgencia() {
        return mAgencia;
    }

    public int GetConta() {
        return mConta;
    }

    public double GetSaldo() {
        return mSaldo;
    }
    
    @Override
    public String toString() {
        return "\nAgencia: "+this.GetAgencia()+
               "\nConta: "+this.GetConta()+
               "\nSaldo: "+this.GetSaldo();
    }
}
