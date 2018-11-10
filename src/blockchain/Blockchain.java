package blockchain;

import java.util.ArrayList;

public class Blockchain {
    private ArrayList<Block> mChain = new ArrayList<Block>();
    
    // Construtor da blockchain usando o Bloco Gênesis
    public Blockchain() {
        mChain.add(0, new Block("Bloco gênesis", "0", mChain.size()+1));
    }
    
    // Adiciona um novo bloco à blockchain
    public void AddBlock(Block newBlock) {
        newBlock.ModPreviousHash(GetLastBlock().GetHash());
        mChain.add(newBlock);
    }
    
    // Valida a blockchain usando as Hash, o tempo de criação e o índice dos blocos
    public boolean ValidChain() {
        for (int i = 1; i < mChain.size(); ++i) {
            if ((mChain.get(i-1).GetHash() != mChain.get(i).GetPreviousHash())
            || (mChain.get(i-1).GetTime() > mChain.get(i).GetTime())
            || (mChain.get(i-1).GetIndex() > mChain.get(i).GetIndex())) {
                return false;
            }
        }
        return true;
    }
    
    // Imprime a blockchain a fim de depuração
    public void Print() {
        for (int i = 0; i < mChain.size(); ++i) {
            /*System.out.printf(
                "Block " + mChain.get(i).GetIndex() +
                "\nData: " + mChain.get(i).GetData() +
                "\nPrevious Hash: " + mChain.get(i).GetPreviousHash() +
                "\nHash: " + mChain.get(i).GetHash() +
                "\nTime: " + mChain.get(i).GetTime() +
                "\n");*/
            mChain.get(i).Imprimir();
        }
    }

    // Retorna o último bloco da blockchain
    public final Block GetLastBlock() {
        return mChain.get(mChain.size()-1);
    }
    
    public int size() {
    	return mChain.size();
    }
    
    public final Block GetBlock(int i) {
        return mChain.get(i);
    }
}
