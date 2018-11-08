package Banco;

import blockchain.*;
import java.util.*;

public class TesteBanco {
    public static void MenuOperacoes() {
        System.out.println("Entre com a operação desejada:");
        System.out.println("[1] Depósito");
        System.out.println("[2] Saque");
        System.out.println("[3] Transferência");
        System.out.println("[0] Sair");
    }
    
    public static void main(String[] args) {
        System.out.println("Sistema Bancário");
        Blockchain sistema = new Blockchain();
        
        MenuOperacoes();
        
        Scanner ler = new Scanner(System.in);
        int opcao = ler.nextInt();
        Depositar dep;
        Block bloco;
        while (opcao != 0) {
            switch(opcao) {
                case 1:
                    int conta;
                    int agencia;
                    double saldoAnterior;
                    double deposito;
                    double saldoAtual;
                    
                    System.out.println("Entre com a agência");
                    agencia = ler.nextInt();
                    System.out.println("Entre com a conta");
                    conta = ler.nextInt();
                    System.out.println("Entre com o saldo anterior");
                    saldoAnterior = ler.nextDouble();
                    System.out.println("Entre com o valor a depositar");
                    deposito = ler.nextDouble();
                    
                    dep = new Depositar(conta, agencia, saldoAnterior, deposito);
                    bloco = new Block(dep, sistema.GetLastBlock().GetHash(), sistema.size()+1);
                    sistema.AddBlock(bloco);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                default:
                    System.out.println("Opção não cadastrada");
                    break;
            }
            
            MenuOperacoes();
            opcao = ler.nextInt();
        }
        
        sistema.Print();
        
        
        
        
        /*Scanner ler = new Scanner(System.in);
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
        
        
        if (chain.ValidChain()) {
            System.out.println("Blockchain válida\n");
        } else {
            System.out.println("Blockchain inválida\n");
        }
        Object teste = new Date("01/01/2018");
        System.out.println(teste.getClass());
        
        
        Depositar dep = new Depositar(123, 456, new Date().getTime(), 30.0, 25.0);
        Block bloco = new Block(dep, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        dep  = new Depositar(123, 456, new Date().getTime(), 55.0, 30.0);
        bloco = new Block(dep, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Sacar saq = new Sacar(123, 456, new Date().getTime(), 30.0, 25.0);
        bloco = new Block(saq, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        saq  = new Sacar(123, 456, new Date().getTime(), 55.0, 30.0);
        bloco = new Block(saq, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        
        Transferir tra =  new Transferir(123, 124, 12345, 12346, new Date().getTime(), 345.0, 235.0, 100.0);
        bloco = new Block(tra, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        chain.Print();*/
    }
}
