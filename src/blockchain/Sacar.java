package blockchain;

import java.util.Date;

public class Sacar {
    // Atributos da classe Sacar
    private int mAgencia;
    private int mConta;
    private long mData;
    private double mSaldo;
    private double mValor;
    
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
    
    // Retorna um booleano se o saldo é positivo ou não
    public boolean SaldoPositivo() {
        return GetValor() > 0;
    }
    
    // Retorna se o saque é válido
    public boolean SaqueValido() {
        return SaldoPositivo() && GetValor() > GetSaldo();
    }
    
    // Operação de saque
    public void OperacaoSaque(double valor) {
        if (SaqueValido()) {
            SetValor(valor);
            SetSaldo(GetSaldo() - GetValor());
        }
    }
}
