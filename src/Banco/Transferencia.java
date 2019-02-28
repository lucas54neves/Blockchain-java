package Banco;

import CartorioCivil.*;
import java.util.*;

public class Transferencia implements OperacoesFinanceiras {
    Conta contaOrigem, contaDestino;
    double valor, saldoAnteriorOrigem, saldoAtualOrigem, saldoAnteriorDestino, saldoAtualDestino;
    Date dataOperacao;
    boolean operacaoRealizada;

    public Transferencia(Conta contaOrigem, Conta contaDestino, double valor) {
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.valor = valor;
        this.realizarOperacao(this.valor);
    }

    public Conta getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(Conta contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public Conta getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(Conta contaDestino) {
        this.contaDestino = contaDestino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldoAnteriorOrigem() {
        return saldoAnteriorOrigem;
    }

    public void setSaldoAnteriorOrigem(double saldoAnteriorOrigem) {
        this.saldoAnteriorOrigem = saldoAnteriorOrigem;
    }

    public double getSaldoAtualOrigem() {
        return saldoAtualOrigem;
    }

    public void setSaldoAtualOrigem(double saldoAtualOrigem) {
        this.saldoAtualOrigem = saldoAtualOrigem;
    }

    public double getSaldoAnteriorDestino() {
        return saldoAnteriorDestino;
    }

    public void setSaldoAnteriorDestino(double saldoAnteriorDestino) {
        this.saldoAnteriorDestino = saldoAnteriorDestino;
    }

    public double getSaldoAtualDestino() {
        return saldoAtualDestino;
    }

    public void setSaldoAtualDestino(double saldoAtualDestino) {
        this.saldoAtualDestino = saldoAtualDestino;
    }

    public Date getDataOperacao() {
        return dataOperacao;
    }

    public void setDataOperacao(Date dataOperacao) {
        this.dataOperacao = dataOperacao;
    }

    public boolean isOperacaoRealizada() {
        return operacaoRealizada;
    }

    public void setOperacaoRealizada(boolean operacaoRealizada) {
        this.operacaoRealizada = operacaoRealizada;
    }
    
    public final boolean transferenciaValida() {
        return this.getContaOrigem().getSaldo() >= this.getValor();
    }
        
    @Override
    public final void realizarOperacao(double valor) {
        this.saldoAnteriorOrigem = this.getContaOrigem().getSaldo();
        this.saldoAnteriorDestino = this.getContaDestino().getSaldo();
        if (this.transferenciaValida()) {
            this.getContaOrigem().sacar(this.getValor());
            this.getContaDestino().depositar(this.getValor());
            this.setOperacaoRealizada(true);
            System.out.println("Transferência realizada com sucesso.");
        } else {
            this.setOperacaoRealizada(false);
            System.out.println("Transferência inválida. Saldo insuficiente da conta de origem.");
        }
        this.saldoAtualDestino = this.getContaDestino().getSaldo();
        this.saldoAtualOrigem = this.getContaOrigem().getSaldo();
        this.dataOperacao = new Date();
    }
    
    @Override
    public String toString() {
        return "## Transferência ##" +
                "\nAgência de origem: " + this.getContaOrigem().getAgencia() +
                "\nConta de origem: " + this.getContaOrigem().getConta() +
                "\nSaldo anterior: " + this.getSaldoAnteriorOrigem() +
                "\nSaldo atual: " + this.getSaldoAtualOrigem() +
                "\nAgência de destino: " + this.getContaDestino().getAgencia() +
                "\nConta de destino: " + this.getContaDestino().getConta() +
                "\nSaldo anterior: " + this.getSaldoAnteriorDestino() +
                "\nSaldo atual: " + this.getSaldoAtualDestino() +
                "\nValor transferido: " + this.getValor() +
                "\nData da transferência: " + this.getDataOperacao() +
                "\nOperação realizada: " + this.isOperacaoRealizada() +
                "\n";
    }
    
    @Override
    public Conta retornaConta(Pessoa titular) {
        if (this.getContaDestino().getTitular() == titular) {
            return this.getContaDestino();
        } else if (this.getContaOrigem().getTitular() == titular) {
            return this.getContaOrigem();
        } else {
            return null;
        }
    }
    
    @Override
    public Pessoa retornaTitular(Conta conta) {
        if (this.getContaDestino() == conta) {
            return this.getContaDestino().getTitular();
        } else if (this.getContaOrigem() == conta) {
            return this.getContaOrigem().getTitular();
        } else {
            return null;
        }
    }
    
    @Override
    public Conta retornaConta(int cpf) {
        if (this.getContaDestino().getTitular().getCpf() == cpf) {
            return this.getContaDestino();
        } else if (this.getContaOrigem().getTitular().getCpf() == cpf) {
            return this.getContaOrigem();
        } else {
            return null;
        }
    }
    
    @Override
    public Pessoa retornaTitular(int cpf) {
        if (this.getContaDestino().getTitular().getCpf() == cpf) {
            return this.getContaDestino().getTitular();
        } else  if (this.getContaOrigem().getTitular().getCpf() == cpf) {
            return this.getContaOrigem().getTitular();
        } else {
            return null;
        }
    }
}
