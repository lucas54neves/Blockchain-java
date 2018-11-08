package Banco;

public class Conta {
    private final int mAgencia;
    private final int mConta;
    private double mSaldo;

    public Conta(int mAgencia, int mConta, double mSaldo) {
        this.mAgencia = mAgencia;
        this.mConta = mConta;
        this.mSaldo = mSaldo;
    }
    
    public void Depositar(double valor) {
        this.mSaldo = this.mSaldo + valor;
    }
    
    public void Sacar(double valor) {
        if (valor > this.mSaldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.mSaldo = this.mSaldo - valor;
        }
    }

    public int GetAgencia() {
        return mAgencia;
    }

    public int GetConta() {
        return mConta;
    }

    public double GetSaldo() {
        return mSaldo;
    }
}
