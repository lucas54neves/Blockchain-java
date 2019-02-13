package Blockchain;

import java.util.ArrayList;

public class Chain {
    private final ArrayList<Block> chain;

    public Chain() {
        this.chain = new ArrayList<>();
        this.chain.add(0, new Block("Bloco Gênesis", "0", this.chain.size()));
    }
    
    public void adicionaBloco(Block novoBloco) {
        if (chainValida()) {
            novoBloco.setHashAnterior(ultimoBloco().getHash());
            chain.add(novoBloco);
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
            retorno = retorno + this.retornaBloco(i).toString();
        }
        retorno = retorno + "########################";
        return retorno;
    }
    
    public Block ultimoBloco() {
        return this.retornaBloco(this.tamanho()-1);
    }
    
    public Block retornaBloco(int indice) {
        return this.chain.get(indice);
    }
    
    public int tamanho() {
        return this.chain.size();
    }
}
