package Model;

import java.util.Date;

public class Depositar {
    // Atributos da classe Depositar
    private int mAgencia;
    private int mConta;
    private long mData;
    private double mSaldo;
    private double mValor;

    public Depositar(int mAgencia, int mConta, long mData, double mSaldo, double mValor) {
        this.mAgencia = mAgencia;
        this.mConta = mConta;
        this.mData = mData;
        this.mSaldo = mSaldo;
        this.mValor = mValor;
    }    
    
    // Retorna a agência da conta do saque
    public int GetAgencia() {
        return mAgencia;
    }
    
    // Modifica a agência da conta do saque
    public void SetAgencia(int agencia) {
        this.mAgencia = agencia;
    }
    
    // Retorna a conta do saque
    public int GetConta() {
        return mConta;
    }
    
    // Modifica a conta do saque
    public void SetConta(int conta) {
        this.mConta = conta;
    }
    
    // Retorna a data do saque
    public long GetData() {
        return mData;
    }
    
    // Modifica a data do saque
    public void SetData() {
        this.mData = new Date().getTime();
    }
    
    // Retorna o saldo da conta
    public double GetSaldo() {
        return mSaldo;
    }
    
    // Modifica o saldo da conta
    public void SetSaldo(double saldo) {
        this.mSaldo = saldo;
    }
    
    // Retorna o valor do saque
    public double GetValor() {
        return mValor;
    }
    
    //Modifica o valor do saque
    public void SetValor(double valor) {
        this.mValor = valor;
    }
        
    @Override
    public String toString() {
        return "Transação: Depositar"+"\nAgencia: "+mAgencia+"\nConta: "+mConta+
                "\nData: "+new Date(mData)+"\nSaldo: "+mSaldo+"\nValor: "+mValor;
    }
}
