package Banco;

import java.util.Date;

public class Depositar {
    private final Conta mConta;
    private final long mData;
    private final double mSaldoAnterior;

    public Depositar(Conta conta, double valor) {
        this.mConta = conta;
        this.mData = new Date().getTime();
        this.mSaldoAnterior = conta.GetSaldo();
        this.mConta.Depositar(valor);
    }
    
    @Override
    public String toString() {
        return "# Depósito #"+
                "\nAgencia: "+mConta.GetAgencia()+
                "\nConta: "+mConta.GetConta()+
                "\nData: "+new Date(mData)+
                "\nSaldo anterior: "+mSaldoAnterior+
                "\nDepósito: "+mSaldoAnterior+
                "\nSaldo atual: "+mConta.GetSaldo();
    }
}
