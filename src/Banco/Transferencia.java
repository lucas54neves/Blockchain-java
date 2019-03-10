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
        this.Operacao(valor);
    }

    public Conta GetContaOrigem() {
        return this.mContaOrigem;
    }

    public Conta GetContaDestino() {
        return this.mContaDestino;
    }

    public double GetValor() {
        return this.mValor;
    }

    public double GetSaldoAnteriorOrigem() {
        return this.mSaldoAnteriorOrigem;
    }

    public double GetSaldoAtualOrigem() {
        return this.mSaldoAtualOrigem;
    }

    public double GetSaldoAnteriorDestino() {
        return this.mSaldoAnteriorDestino;
    }

    public double GetSaldoAtualDestino() {
        return this.mSaldoAtualDestino;
    }

    public Date GetDataOperacao() {
        return this.mDataOperacao;
    }

    public void SetSaldoAnteriorOrigem(double valor) {
        this.mSaldoAnteriorOrigem = valor;
    }

    public void SetSaldoAtualOrigem(double valor) {
        this.mSaldoAtualOrigem = valor;
    }
    
    public void SetSaldoAnteriorDestino(double valor) {
        this.mSaldoAnteriorDestino = valor;
    }

    public void SetSaldoAtualDestino(double valor) {
        this.mSaldoAtualDestino = valor;
    }
    
    private void Operacao(double valor) {
        try {
            this.SetSaldoAnteriorOrigem(this.GetContaOrigem().GetSaldo());
            this.SetSaldoAnteriorDestino(this.GetContaDestino().GetSaldo());
            this.GetContaOrigem().Sacar(valor);
            System.out.println("Transferência realizada.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Transferência não realizada.");
        } finally {
            this.SetSaldoAtualOrigem(this.GetSaldoAnteriorOrigem());
            this.SetSaldoAtualDestino(this.GetSaldoAnteriorDestino());
            this.mDataOperacao = new Date();
        }
    }
    
    @Override
    public String toString() {
        return "## Transferência ##" +
                "\nAgência de origem: " + this.GetContaOrigem().GetAgencia() +
                "\nConta de origem: " + this.GetContaOrigem().GetConta() +
                "\nSaldo anterior: " + this.GetSaldoAnteriorOrigem() +
                "\nSaldo atual: " + this.GetSaldoAtualOrigem() +
                "\nAgência de destino: " + this.GetContaDestino().GetAgencia() +
                "\nConta de destino: " + this.GetContaDestino().GetConta() +
                "\nSaldo anterior: " + this.GetSaldoAnteriorDestino() +
                "\nSaldo atual: " + this.GetSaldoAtualDestino() +
                "\nValor transferido: " + this.GetValor() +
                "\nData da transferência: " + this.GetDataOperacao();
    }
}
