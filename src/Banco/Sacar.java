package Banco;

import java.util.*;

public class Sacar {
    private final Conta mConta;
    private final Date mData;
    private final double mSaldoAnterior;
    private final double mValor;

    public Sacar(Conta conta, double valor) {
        this.mConta = conta;
        this.mSaldoAnterior = conta.GetSaldo();
        this.mValor = valor;
        
        Calendar calendario = new GregorianCalendar();
        Date data = new Date();
        calendario.setTime(data);
        this.mData = calendario.getTime();
        
        if (this.mConta.GetSaldo() >= this.mValor) {
            this.mConta.Sacar(this.mValor);
        }
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
               "\nSaque: "+mValor+
               "\nSaldo atual: "+mConta.GetSaldo();
    }
}
