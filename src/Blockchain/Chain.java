package Blockchain;

import Banco.*;
import CartorioCivil.*;
import CartorioImoveis.*;
import java.util.*;

public class Chain {
    private final ArrayList<Block> mChain;

    public Chain() {
        this.mChain = new ArrayList<>();
        this.mChain.add(0, new Block("Bloco Gênesis", "0", this.mChain.size()));
    }
    
    public void adicionaBloco(Block novoBloco) {
        if (chainValida()) {
            novoBloco.setHashAnterior(ultimoBloco().getHash());
            mChain.add(novoBloco);
        }
    }
    
    public boolean chainValida() {
        for (int i = 1; i < this.tamanho(); ++i) {
            if ((this.retornaBloco(i-1).getHash() != this.retornaBloco(i).getHashAnterior())
            || (this.retornaBloco(i-1).getTempo() > this.retornaBloco(i).getTempo())
            || (this.retornaBloco(i-1).getIndice() > this.retornaBloco(i).getIndice())) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public String toString() {
        String retorno = "###### Blockchain ######" +
            "\nTamanho: " + this.tamanho() +
            "\n########################\n\n";
        for (int i = 0; i < this.tamanho(); ++i) {
            retorno += this.retornaBloco(i).toString();
        }
        retorno += "########################";
        return retorno;
    }
    
    public Block ultimoBloco() {
        return this.retornaBloco(this.tamanho()-1);
    }
    
    public Block retornaBloco(int indice) {
        return this.mChain.get(indice);
    }
    
    public int tamanho() {
        return this.mChain.size();
    }
    
    public String extratoBancario(Conta contaBuscada, Date dataInicial, Date dataFinal) {
        String retorno = "";
        
        for (int i = this.tamanho()-1; i > 0; i--) {
            Object transacao = this.retornaBloco(i).getDado();
            Date data;
            Conta conta1, conta2;
            
            if (transacao instanceof Deposito) {
                data = ((Deposito) transacao).GetDataOperacao();
                conta1 = ((Deposito) transacao).GetContaDestino();
                conta2 = null;
            } else if (transacao instanceof Saque) {
                data = ((Saque) transacao).GetDataOperacao();
                conta1 = null;
                conta2 = ((Saque) transacao).GetContaOrigem();
            } else if (transacao instanceof Transferencia) {
                data = ((Transferencia) transacao).GetDataOperacao();
                conta1 = ((Transferencia) transacao).GetContaDestino();
                conta2 = ((Transferencia) transacao).GetContaOrigem();
            } else {
                data = null;
                conta1 = null;
                conta2 = null;
            }
            
            
            if ((conta1 != null && (conta1.GetAgencia() == contaBuscada.GetAgencia() && conta1.GetConta()== contaBuscada.GetConta())) ||
                (conta2 != null && (conta2.GetAgencia() == contaBuscada.GetAgencia() && conta2.GetConta()== contaBuscada.GetConta()))) {
                if (data != null && data.after(dataInicial) && data.before(dataFinal)) {
                    retorno += this.retornaBloco(i).getDado().toString() + "\n";
                }
            }
        }
        
        return retorno;
    }
    
    public Pessoa buscaRegistroPessoa(int cpf) {
        try {
            Pessoa retorno;
            for (int i = this.tamanho()-1; i > 0; i--) {
                Object registro = this.retornaBloco(i).getDado();

                if (registro instanceof Nascimento) {
                    retorno = ((Nascimento) registro).GetIndividuo();
                    if (retorno.GetCpf() == cpf) {
                        return retorno;
                    }
                }
            }
            throw new IllegalArgumentException("CPF não encontrado.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Conta retornaConta(int agencia, int numConta) {
        try {
            for (int i = this.tamanho()-1; i > 0; i--) {
                Object registro = this.retornaBloco(i).getDado();
                Conta conta1, conta2;

                if (registro instanceof Deposito) {
                    conta1 = ((Deposito) registro).GetContaDestino();
                    conta2 = null;
                } else if (registro instanceof Saque) {
                    conta1 = null;
                    conta2 = ((Saque) registro).GetContaOrigem();
                } else if (registro instanceof Transferencia) {
                    conta1 = ((Transferencia) registro).GetContaDestino();
                    conta2 = ((Transferencia) registro).GetContaOrigem();
                } else {
                    conta1 = null;
                    conta2 = null;
                }


                if (conta1 != null && (conta1.GetAgencia() == agencia && conta1.GetConta()== numConta)) {
                    return conta1;
                } else {
                    if (conta2 != null && (conta2.GetAgencia() == agencia && conta2.GetConta()== numConta)) {
                        return conta2;
                    }
                }
            }
            
            throw new IllegalArgumentException("Conta não encontrada.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
