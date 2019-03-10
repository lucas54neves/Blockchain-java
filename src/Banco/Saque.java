package Banco;

import java.util.Date;

public class Saque {
    private final Conta mContaOrigem;
    private final double mValor;
    private double mSaldoAnterior, mSaldoAtual;
    private Date mDataOperacao;

    public Saque(Conta contaOrigem, double valor) {
        this.mContaOrigem = contaOrigem;
        this.mValor = valor;
        this.Operacao(valor);
    }

    public Conta GetContaOrigem() {
        return this.mContaOrigem;
    }

    public double GetValor() {
        return this.mValor;
    }

    public double GetSaldoAnterior() {
        return this.mSaldoAnterior;
    }

    public double GetSaldoAtual() {
        return this.mSaldoAtual;
    }

    public Date GetDataOperacao() {
        return this.mDataOperacao;
    }

    public void SetSaldoAnterior(double saldoAnterior) {
        this.mSaldoAnterior = saldoAnterior;
    }

    public void SetSaldoAtual(double saldoAtual) {
        this.mSaldoAtual = saldoAtual;
    }
    
    private void Operacao(double valor) {
        try {
            this.SetSaldoAnterior(this.GetContaOrigem().GetSaldo());
            this.GetContaOrigem().Sacar(valor);
            System.out.println("Saque realizado.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Saque não realizada.");
        } finally {
            this.SetSaldoAtual(this.GetContaOrigem().GetSaldo());
            this.mDataOperacao = new Date();
        }
    }
    
    @Override
    public String toString() {
        return  "# Saque #" +
                "\nNome do titular: " + this.GetContaOrigem().GetTitular().getNome() +
                "\nAgência: " + this.GetContaOrigem().GetAgencia() +
                "\nConta: " + this.GetContaOrigem().GetConta() +
                "\nSaldo anterior: " + this.GetSaldoAnterior() +
                "\nValor depositado: " + this.GetValor() +
                "\nSaldo atual: " + this.GetSaldoAtual();
    }
}