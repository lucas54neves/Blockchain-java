package Banco;

import java.util.*;

public class Depositar {
    private final Conta mConta;
    private final long mData;
    private final Double mvalor;
    private final Double mSaldoAnterior;

    public Depositar(Conta conta, double valor) {
        this.mConta = conta;
        this.mData = new Date().getTime();
        this.mvalor = valor;
        this.mSaldoAnterior = conta.GetSaldo();
        this.mConta.Depositar(valor);
    }
    
    public Conta GetConta() {
        return mConta;
    }
    
    @Override
    public String toString() {
        return "\nAgencia: "+mConta.GetAgencia()+
               "\nConta: "+mConta.GetConta()+
               "\nData: "+new Date(mData)+
               "\nSaldo anterior: "+mSaldoAnterior+
               "\nDepósito: "+(this.mvalor)+
               "\nSaldo atual: "+mConta.GetSaldo();
    }
}
