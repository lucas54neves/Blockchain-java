package Banco;

import java.util.Date;

public class Depositar {
    final int mConta;
    final int mAgencia;
    final long mData;
    final double mSaldoAnterior;
    final double mSaldoAtual;
    final double mDeposito;

    public Depositar(int mConta, int mAgencia, double mSaldoAnterior,double mDeposito) {
        this.mConta = mConta;
        this.mAgencia = mAgencia;
        this.mData = new Date().getTime();
        this.mSaldoAnterior = mSaldoAnterior;
        this.mDeposito = mDeposito;
        this.mSaldoAtual = this.mSaldoAnterior + this.mDeposito;
    }
    
    @Override
    public String toString() {
        return "Depósito:"+"\nConta: "+mConta+"\nAgencia: "+mAgencia+"\nData: "+new Date(mData)+"\nSaldo anterior: "+mSaldoAnterior+"\nDepósito: "+mDeposito+"\nSaldo atual: "+mSaldoAtual;
    }
}
