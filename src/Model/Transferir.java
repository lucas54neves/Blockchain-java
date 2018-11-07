package Model;

import java.util.Date;

public class Transferir {
    // Atributos da classe Transferir
    private int mAgenciaOrigem;
    private int mAgenciaDestino;
    private int mContaOrigem;
    private int mContaDestino;
    private long mData;
    private double mSaldoContaDestino;
    private double mSaldoContaOrigem;
    private double mValor;

    public Transferir(int mAgenciaOrigem, int mAgenciaDestino, int mContaOrigem, int mContaDestino, long mData, double mSaldoContaDestino, double mSaldoContaOrigem, double mValor) {
        this.mAgenciaOrigem = mAgenciaOrigem;
        this.mAgenciaDestino = mAgenciaDestino;
        this.mContaOrigem = mContaOrigem;
        this.mContaDestino = mContaDestino;
        this.mData = mData;
        this.mSaldoContaDestino = mSaldoContaDestino;
        this.mSaldoContaOrigem = mSaldoContaOrigem;
        this.mValor = mValor;
    }
    
    // Retorna a agência de destino da transferência
    public int GetAgenciaDestino() {
        return this.mAgenciaDestino;
    }
    
    // Modifica a agência de destino da transferência
    public void SetAgenciaDestino(int agenciaDestino) {
        this.mAgenciaDestino = agenciaDestino;
    }

    // Retorna a agência de origem da transferência
    public int GetAgenciaOrigem() {
        return this.mAgenciaOrigem;
    }
    
    // Modifica a agência de origem da transferência
    public void SetAgenciaOrigem(int agenciaOrigem) {
        this.mAgenciaOrigem = agenciaOrigem;
    }
    
    // Retorna a conta de destino da transferência
    public int GetContaDestino() {
        return this.mContaDestino;
    }
    
    // Modifica a conta de destino da transferência
    public void SetContaDestino(int contaDestino) {
        this.mContaDestino = contaDestino;
    }
    
    // Retorna a conta de origem da transferência
    public int GetContaOrigem() {
        return this.mContaOrigem;
    }
    
    // Modifica a conta de origem da transferência
    public void SetContaOrigem(int contaOrigem) {
        this.mContaDestino = contaOrigem;
    }
    
    // Retorna a data da transferência
    public long GetData() {
        return this.mData;
    }
    
    // Modifica a data da transferência
    public void SetData(long data) {
        this.mData = new Date().getTime();
    }
    
    // Retorna o saldo da conta de destino
    public double GetSaldoDestino() {
        return this.mSaldoContaDestino;
    }
    
    // Modifica o saldo da conta de destino
    public void SetSaldoDestino(double saldoDestino) {
        this.mSaldoContaDestino = saldoDestino;
    }
    
    // Retorna o saldo da conta de origem
    public double GetSaldoOrigem() {
        return this.mSaldoContaOrigem;
    }
    
    // Modifica o saldo da conta de origem
    public void SetSaldoOrigem(double saldoOrigem) {
        this.mSaldoContaOrigem = saldoOrigem;
    }
    
    // Retorna o valor da transferência
    public double GetValor() {
        return this.mValor;
    }
    
    // Modifica o valor da transferência
    public void SetValor(double valor) {
        this.mValor = valor;
    }
    
    // Verifica se a operação é válida
    public boolean OperacaoValida() {
        return GetValor() >= 0 && GetValor() >= GetSaldoOrigem();
    }
    
    // Operação de transferência
    public void OperacaoTransferencia(double valor) {
        if (OperacaoValida()) {
            SetValor(valor);
            SetSaldoDestino(GetSaldoDestino() + GetValor());
            SetSaldoOrigem(GetSaldoOrigem() - GetValor());
        }
    }
}
