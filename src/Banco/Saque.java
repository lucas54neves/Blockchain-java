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
        this.operacao(valor);
    }

    public Conta getContaOrigem() {
        return this.mContaOrigem;
    }

    public double getValor() {
        return this.mValor;
    }

    public double getSaldoAnterior() {
        return this.mSaldoAnterior;
    }

    public double getSaldoAtual() {
        return this.mSaldoAtual;
    }

    public Date getDataOperacao() {
        return this.mDataOperacao;
    }

    public void setSaldoAnterior(double saldoAnterior) {
        this.mSaldoAnterior = saldoAnterior;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.mSaldoAtual = saldoAtual;
    }
    
    private void operacao(double valor) {
        try {
            this.setSaldoAnterior(this.getContaOrigem().getSaldo());
            this.getContaOrigem().sacar(valor);
            System.out.println("Saque realizado.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Saque não realizada.");
        } finally {
            this.setSaldoAtual(this.getContaOrigem().getSaldo());
            this.mDataOperacao = new Date();
        }
    }
    
    @Override
    public String toString() {
        return  "# Saque #" +
                "\nNome do titular: " + this.getContaOrigem().getTitular().getNome() +
                "\nAgência: " + this.getContaOrigem().getAgencia() +
                "\nConta: " + this.getContaOrigem().getConta() +
                "\nSaldo anterior: " + this.getSaldoAnterior() +
                "\nValor depositado: " + this.getValor() +
                "\nSaldo atual: " + this.getSaldoAtual();
    }
}