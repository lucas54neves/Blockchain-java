package Banco;

import CartorioCivil.*;

public interface OperacoesFinanceiras {
    void realizarOperacao(double valor);
    Conta retornaConta(Pessoa titular);
}
