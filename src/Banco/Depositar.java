package Banco;

import java.util.*;

public class Depositar {
    private final Conta mConta;
    private final long mData;
    private final Double mValor;
    private final Double mSaldoAnterior;

    public Depositar(Conta conta, double valor) {
        this.mConta = conta;
        this.mValor = valor;
        this.mSaldoAnterior = conta.GetSaldo();
        this.mConta.Depositar(valor);
        this.mData = new Date().getTime();
    }
    
    public Conta GetConta() {
        return mConta;
    }
    
    @Override
    public String toString() {
        return "Agencia: "+mConta.GetAgencia()+
               "\nConta: "+mConta.GetConta()+
               "\nData: "+new Date(mData)+
               "\nSaldo anterior: "+mSaldoAnterior+
               "\nDepósito: "+(this.mValor)+
               "\nSaldo atual: "+mConta.GetSaldo();
    }
}
