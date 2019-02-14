package Banco;

import CartorioCivil.*;

public interface OperacoesFinanceiras {
    void realizarOperacao(double valor);
    Conta retornaConta(Pessoa titular);
    Pessoa retornaTitular(Conta conta);
    Conta retornaConta(int cpf);
    Pessoa retornaTitular(int cpf);
}
