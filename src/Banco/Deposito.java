package Banco;

import CartorioCivil.*;
import java.util.*;

public class Deposito implements OperacoesFinanceiras {
    Conta contaDestino;
    double valor, saldoAnterior, saldoAtual;
    Date dataOperacao;
    boolean operacaoRealizada;

    public Deposito(Conta contaDestino, double valor) {
        this.contaDestino = contaDestino;
        this.valor = valor;
        this.saldoAnterior = this.contaDestino.getSaldo();
        this.realizarOperacao(valor);
        System.out.println("Depósito realizado com sucesso.");
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

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
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
    
    @Override
    public final void realizarOperacao(double valor) {
        this.getContaDestino().depositar(valor);
        this.saldoAtual = this.contaDestino.getSaldo();
        this.dataOperacao = new Date();
        this.setOperacaoRealizada(true);
    }
    
    @Override
    public String toString() {
        return  "# Depósito #" +
                "\nNome do titular: " + this.getContaDestino().getTitular().getNome() +
                "\nAgência: " + this.getContaDestino().getAgencia() +
                "\nConta: " + this.getContaDestino().getConta() +
                "\nSaldo anterior: " + this.getSaldoAnterior() +
                "\nValor depositado: " + this.getValor() +
                "\nSaldo atual: " + this.getSaldoAtual() +
                "\nOperação realizada: " + this.isOperacaoRealizada() +
                "\n";
    }
    
    @Override
    public Conta retornaConta(Pessoa titular) {
        if (this.getContaDestino().getTitular() == titular) {
            return this.getContaDestino();
        } else {
            return null;
        }
    }
    
    @Override
    public Pessoa retornaTitular(Conta conta) {
        if (this.getContaDestino() == conta) {
            return this.getContaDestino().getTitular();
        } else {
            return null;
        }
    }
    
    @Override
    public Conta retornaConta(int cpf) {
        if (this.getContaDestino().getTitular().getCpf() == cpf) {
            return this.getContaDestino();
        } else {
            return null;
        }
    }
    
    @Override
    public Pessoa retornaTitular(int cpf) {
        if (this.getContaDestino().getTitular().getCpf() == cpf) {
            return this.getContaDestino().getTitular();
        } else {
            return null;
        }
    }
}
