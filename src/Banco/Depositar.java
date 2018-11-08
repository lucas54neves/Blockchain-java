package Banco;

import java.util.Date;

public class Depositar {
    private final Conta mDestino;
    private final Conta mOrigem;
    private final long mData;
    private final double mSaldoAnterior;

    public Depositar(Conta conta, double valor) {
        this.mDestino = conta;
        this.mOrigem = null;
        this.mData = new Date().getTime();
        this.mSaldoAnterior = conta.GetSaldo();
        this.mDestino.Depositar(valor);
    }
    
    @Override
    public String toString() {
        return "Depósito:"+
                "\nConta: "+mDestino.GetConta()+
                "\nAgencia: "+mDestino.GetAgencia()+
                "\nData: "+new Date(mData)+
                "\nSaldo anterior: "+mSaldoAnterior+
                "\nDepósito: "+mSaldoAnterior+
                "\nSaldo atual: "+mDestino.GetSaldo();
    }
}
