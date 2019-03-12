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
        this.operacao(valor);
    }

    public Conta getContaDestino() {
        return mContaDestino;
    }

    public double getValor() {
        return mValor;
    }

    public double getSaldoAnterior() {
        return mSaldoAnterior;
    }

    public double getSaldoAtual() {
        return mSaldoAtual;
    }

    public Date getDataOperacao() {
        return mDataOperacao;
    }

    public void setSaldoAnterior(double saldoAnterior) {
        this.mSaldoAnterior = saldoAnterior;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.mSaldoAtual = saldoAtual;
    }
    
    private void operacao(double valor) {
        try {
            this.setSaldoAnterior(this.getContaDestino().getSaldo());
            this.getContaDestino().depositar(valor);
            System.out.println("Depósito realizado.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Depósito não realizada.");
        } finally {
            this.setSaldoAtual(this.getContaDestino().getSaldo());
            this.mDataOperacao = new Date();
        }
    }
    
    @Override
    public String toString() {
        return  "# Depósito #" +
                "\nNome do titular: " + this.getContaDestino().getTitular().getNome() +
                "\nAgência: " + this.getContaDestino().getAgencia() +
                "\nConta: " + this.getContaDestino().getConta() +
                "\nSaldo anterior: " + this.getSaldoAnterior() +
                "\nValor depositado: " + this.getValor() +
                "\nSaldo atual: " + this.getSaldoAtual();
    }
}
