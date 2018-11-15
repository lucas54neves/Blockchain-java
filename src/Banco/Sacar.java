package Banco;

import java.util.Date;

public class Sacar {
    private final Conta mConta;
    private final long mData;
    private final double mSaldoAnterior;
    private final double mValor;

    public Sacar(Conta conta, double valor) {
        this.mConta = conta;
        this.mData = new Date().getTime();
        this.mSaldoAnterior = conta.GetSaldo();
        this.mValor = valor;
        this.mConta.Sacar(this.mValor);
    }
    
    @Override
    public String toString() {
        return "\nAgencia: "+mConta.GetAgencia()+
               "\nConta: "+mConta.GetConta()+
               "\nData: "+new Date(mData)+
               "\nSaldo anterior: "+mSaldoAnterior+
               "\nSaque: "+mValor+
               "\nSaldo atual: "+mConta.GetSaldo();
    }
}
