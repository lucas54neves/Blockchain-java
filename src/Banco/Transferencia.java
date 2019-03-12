package Banco;

import java.util.Date;

public class Transferencia {
    private final Conta mContaOrigem, mContaDestino;
    private final double mValor;
    private double mSaldoAnteriorOrigem, mSaldoAtualOrigem, mSaldoAnteriorDestino, mSaldoAtualDestino;
    private Date mDataOperacao;

    public Transferencia(Conta contaOrigem, Conta contaDestino, double valor) {
        this.mContaOrigem = contaOrigem;
        this.mContaDestino = contaDestino;
        this.mValor = valor;
        this.operacao(valor);
    }

    public Conta getContaOrigem() {
        return this.mContaOrigem;
    }

    public Conta getContaDestino() {
        return this.mContaDestino;
    }

    public double getValor() {
        return this.mValor;
    }

    public double getSaldoAnteriorOrigem() {
        return this.mSaldoAnteriorOrigem;
    }

    public double getSaldoAtualOrigem() {
        return this.mSaldoAtualOrigem;
    }

    public double getSaldoAnteriorDestino() {
        return this.mSaldoAnteriorDestino;
    }

    public double getSaldoAtualDestino() {
        return this.mSaldoAtualDestino;
    }

    public Date getDataOperacao() {
        return this.mDataOperacao;
    }

    public void setSaldoAnteriorOrigem(double valor) {
        this.mSaldoAnteriorOrigem = valor;
    }

    public void setSaldoAtualOrigem(double valor) {
        this.mSaldoAtualOrigem = valor;
    }
    
    public void setSaldoAnteriorDestino(double valor) {
        this.mSaldoAnteriorDestino = valor;
    }

    public void setSaldoAtualDestino(double valor) {
        this.mSaldoAtualDestino = valor;
    }
    
    private void operacao(double valor) {
        try {
            this.setSaldoAnteriorOrigem(this.getContaOrigem().getSaldo());
            this.setSaldoAnteriorDestino(this.getContaDestino().getSaldo());
            this.getContaOrigem().sacar(valor);
            System.out.println("Transferência realizada.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Transferência não realizada.");
        } finally {
            this.setSaldoAtualOrigem(this.getSaldoAnteriorOrigem());
            this.setSaldoAtualDestino(this.getSaldoAnteriorDestino());
            this.mDataOperacao = new Date();
        }
    }
    
    @Override
    public String toString() {
        return "## Transferência ##" +
                "\nAgência de origem: " + this.getContaOrigem().getAgencia() +
                "\nConta de origem: " + this.getContaOrigem().getConta() +
                "\nNome do titular: " + this.getContaOrigem().getTitular().getNome() +
                "\nSaldo anterior: " + this.getSaldoAnteriorOrigem() +
                "\nSaldo atual: " + this.getSaldoAtualOrigem() +
                "\nAgência de destino: " + this.getContaDestino().getAgencia() +
                "\nConta de destino: " + this.getContaDestino().getConta() +
                "\nNome do titular: " + this.getContaDestino().getTitular().getNome() +
                "\nSaldo anterior: " + this.getSaldoAnteriorDestino() +
                "\nSaldo atual: " + this.getSaldoAtualDestino() +
                "\nValor transferido: " + this.getValor() +
                "\nData da transferência: " + this.getDataOperacao();
    }
}
