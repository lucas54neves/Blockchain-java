package Banco;

import java.util.*;

public class Transferir {
    // Atributos
    private final Conta mContaOrigem;
    private final Conta mContaDestino;
    private final Date mData;
    private final Double mValor;
    private final Double mSaldoAnteriorOrigem;
    private final Double mSaldoAnteriorDestino;
    
    // Construtor
    public Transferir(Conta mContaOrigem, Conta mContaDestino, Double mValor) {
        this.mContaOrigem = mContaOrigem;
        this.mContaDestino = mContaDestino;
        this.mValor = mValor;
        this.mSaldoAnteriorOrigem = mContaOrigem.GetSaldo();
        this.mSaldoAnteriorDestino = mContaDestino.GetSaldo();
        this.mData = new Date();
        
        if (this.mContaOrigem.GetSaldo() >= this.mValor) {
            this.mContaOrigem.Sacar(mValor);
            this.mContaDestino.Depositar(mValor);
        } else {
            // this.mData = 0; ?????
            System.out.println("Transferência inválida.");
            System.out.println("O saldo da conta de origem é insuficiente.");
        }
    }
    
    public Conta GetContaOrigem() {
        return this.mContaOrigem;
    }
    
    public Conta GetContaDestino() {
        return this.mContaDestino;
    }
    
    public Date GetData() {
        return mData;
    }
    
    @Override
    public String toString() {
        return "# Conta de origem #"+
             "\nAgencia: "+mContaOrigem.GetAgencia()+
             "\nConta: "+mContaOrigem.GetConta()+
             "\nSaldo anterior: "+(this.mSaldoAnteriorOrigem)+
             "\nSaldo atual: "+mContaOrigem.GetSaldo()+   
             "\n# Conta de destino #"+
             "\nAgencia: "+mContaDestino.GetAgencia()+
             "\nConta: "+mContaDestino.GetConta()+
             "\nSaldo anterior: "+(this.mSaldoAnteriorDestino)+
             "\nSaldo atual: "+mContaDestino.GetSaldo()+
             "\n# Informações gerais #"+
             "\nValor transferido: "+(this.mValor)+
             "\nData: "+mData;
    }
}