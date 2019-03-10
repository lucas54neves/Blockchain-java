package Banco;

import java.util.Date;

public class Deposito {
    private final Conta mContaDestino;
    private final double mValor;
    private double mSaldoAnterior, mSaldoAtual;
    private Date mDataOperacao;

    public Deposito(Conta contaDestino, double valor) {
        this.mContaDestino = contaDestino;
        this.mValor = valor;
        this.Operacao(valor);
    }

    public Conta GetContaDestino() {
        return mContaDestino;
    }

    public double GetValor() {
        return mValor;
    }

    public double GetSaldoAnterior() {
        return mSaldoAnterior;
    }

    public double GetSaldoAtual() {
        return mSaldoAtual;
    }

    public Date GetDataOperacao() {
        return mDataOperacao;
    }

    public void SetSaldoAnterior(double saldoAnterior) {
        this.mSaldoAnterior = saldoAnterior;
    }

    public void SetSaldoAtual(double saldoAtual) {
        this.mSaldoAtual = saldoAtual;
    }
    
    private void Operacao(double valor) {
        try {
            this.SetSaldoAnterior(this.GetContaDestino().GetSaldo());
            this.GetContaDestino().Depositar(valor);
            System.out.println("Depósito realizado.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Depósito não realizada.");
        } finally {
            this.SetSaldoAtual(this.GetContaDestino().GetSaldo());
            this.mDataOperacao = new Date();
        }
    }
    
    @Override
    public String toString() {
        return  "# Depósito #" +
                "\nNome do titular: " + this.GetContaDestino().GetTitular().getNome() +
                "\nAgência: " + this.GetContaDestino().GetAgencia() +
                "\nConta: " + this.GetContaDestino().GetConta() +
                "\nSaldo anterior: " + this.GetSaldoAnterior() +
                "\nValor depositado: " + this.GetValor() +
                "\nSaldo atual: " + this.GetSaldoAtual();
    }
}
