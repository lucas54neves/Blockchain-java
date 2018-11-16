package Banco;

import java.util.*;

public class Depositar {
    private final Conta mConta;
    private final Date mData;
    private final Double mValor;
    private final Double mSaldoAnterior;

    public Depositar(Conta conta, double valor) {
        this.mConta = conta;
        this.mValor = valor;
        this.mSaldoAnterior = conta.GetSaldo();
        this.mConta.Depositar(valor);
        
        Calendar calendario = new GregorianCalendar();
        Date data = new Date();
        calendario.setTime(data);
        this.mData = calendario.getTime();
    }
    
    public Conta GetConta() {
        return mConta;
    }
    
    public Date GetData() {
        return mData;
    }
    
    @Override
    public String toString() {
        return "Agencia: "+mConta.GetAgencia()+
               "\nConta: "+mConta.GetConta()+
               "\nData: "+mData+
               "\nSaldo anterior: "+mSaldoAnterior+
               "\nDepósito: "+(this.mValor)+
               "\nSaldo atual: "+mConta.GetSaldo();
    }
}
