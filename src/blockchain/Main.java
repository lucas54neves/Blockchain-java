package blockchain;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Blockchain chain = new Blockchain();
        Object dado = new String();
        
        for (int i = 2; i <= 3; ++i) {
            System.out.println("Entre com os dados do bloco " + i);
            dado = ler.next();
            Block testBlock = new Block(dado, chain.GetLastBlock().GetHash(), chain.size()+1);
            chain.AddBlock(testBlock);
            
        }
        ler.close();
        System.out.println("\nTamanho da Blockchain: " + chain.size() + "\n");
        
        Block testBlock = new Block(new Date("01/01/2018"), chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(testBlock);
        
        Block testBlock2 = new Block(new Double(12345), chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(testBlock2);
        
        chain.Print();
        
        if (chain.ValidChain()) {
            System.out.println("Blockchain válida\n");
        } else {
            System.out.println("Blockchain inválida\n");
        }
        Object teste = new Date("01/01/2018");
        System.out.println(teste.getClass());
        
    }
}
