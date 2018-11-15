package Banco;

import java.util.Date;

public class Sacar {
    private final Conta mConta;
    private final long mData;
    private final double mSaldoAnterior;
    private final double mValor;

    public Sacar(Conta conta, double valor) {
        this.mConta = conta;
        this.mSaldoAnterior = conta.GetSaldo();
        this.mValor = valor;
        
        if (this.mConta.GetSaldo() >= this.mValor) {
            this.mConta.Sacar(this.mValor);
            this.mData = new Date().getTime();
        } else {
            this.mData = 0; // Seria essa a melhor opção?
            System.out.println("Saque inválido.");
            System.out.println("O saldo da conta é insuficiente.");
        }
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
               "\nSaque: "+mValor+
               "\nSaldo atual: "+mConta.GetSaldo();
    }
}
