package Banco;

import CartorioCivil.Pessoa;
import java.util.*;

public class Saque implements OperacoesFinanceiras {
    Conta contaOrigem;
    double valor, saldoAnterior, saldoAtual;
    Date dataOperacao;
    boolean operacaoRealizada;

    public Saque(Conta contaOrigem, double valor) {
        this.contaOrigem = contaOrigem;
        this.valor = valor;
        this.saldoAnterior = this.contaOrigem.getSaldo();
        this.realizarOperacao(this.valor);
    }

    public Conta getContaOrigem() {
        return contaOrigem;
    }

    public double getValor() {
        return valor;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public Date getDataOperacao() {
        return dataOperacao;
    }

    public boolean isOperacaoRealizada() {
        return operacaoRealizada;
    }

    public void setOperacaoRealizada(boolean operacaoRealizada) {
        this.operacaoRealizada = operacaoRealizada;
    }
    
    public final boolean saqueValido() {
        return this.getValor() <= this.getSaldoAnterior();
    }
    
    @Override
    public final void realizarOperacao(double valor) {
        if (this.saqueValido()) {
            this.getContaOrigem().sacar(valor);
            this.setOperacaoRealizada(true);
            System.out.println("Saque realizado com sucesso.");
        } else {
            this.setOperacaoRealizada(false);
            System.out.println("Saque inválido. Saldo insuficiente.");
        }
        this.saldoAtual = this.getContaOrigem().getSaldo();
        this.dataOperacao = new Date();
    }
    
    @Override
    public String toString() {
        return  "# Saque #" +
                "\nNome do titular: " + this.getContaOrigem().getTitular().getNome() +
                "\nAgência: " + this.getContaOrigem().getAgencia() +
                "\nConta: " + this.getContaOrigem().getConta() +
                "\nSaldo anterior: " + this.getSaldoAnterior() +
                "\nValor sacado: " + this.getValor() +
                "\nSaldo atual: " + this.getSaldoAtual() +
                "\nOperação realizada: " + this.isOperacaoRealizada() +
                "\n";
    }
    
    @Override
    public Conta retornaConta(Pessoa titular) {
        if (this.getContaOrigem().getTitular() == titular) {
            return this.getContaOrigem();
        } else {
            return null;
        }
    }
    
    @Override
    public Pessoa retornaTitular(Conta conta) {
        if (this.getContaOrigem() == conta) {
            return this.getContaOrigem().getTitular();
        } else {
            return null;
        }
    }
    
    @Override
    public Conta retornaConta(int cpf) {
        if (this.getContaOrigem().getTitular().getCpf() == cpf) {
            return this.getContaOrigem();
        } else {
            return null;
        }
    }
    
    @Override
    public Pessoa retornaTitular(int cpf) {
        if (this.getContaOrigem().getTitular().getCpf() == cpf) {
            return this.getContaOrigem().getTitular();
        } else {
            return null;
        }
    }
}
