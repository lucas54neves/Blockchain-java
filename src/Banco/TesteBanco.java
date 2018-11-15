package Banco;

import blockchain.*;
import java.util.*;

public class TesteBanco {
    public static void MenuOperacoes() {
        System.out.println("Entre com a operação desejada:");
        System.out.println("[1] Abrir conta");
        System.out.println("[2] Depósito");
        System.out.println("[3] Saque");
        System.out.println("[4] Transferência");
        System.out.println("[5] Saldo");
        System.out.println("[0] Sair");
    }
    
   
    public Conta BuscarConta(Blockchain sistema, int agencia, int conta) {
        for (int i = sistema.size()-1; i > 0; i--) {
            Object dados = sistema.GetBlock(i).GetData();
            Conta conta3 = ((Depositar) dados).GetConta();
            if (conta3.GetAgencia() == agencia && conta3.GetConta() == conta) {
                    return conta3;
                }
        }
        return null;
    }
    
    public static void main(String[] args) {
        System.out.println("Sistema Bancário");
        Blockchain sistema = new Blockchain();
        
        MenuOperacoes();
        
        Scanner ler = new Scanner(System.in);
        int opcao = ler.nextInt();
        Block bloco;
        Conta conta1, conta2;
        TesteBanco tb = new TesteBanco();
        
        while (opcao != 0) {
            switch(opcao) {
                case 1:
                    System.out.println("# Abertura de conta #");
                    
                    int agenciaNova;
                    int contaNova;
                    double primeiroDeposito;
                    
                    System.out.println("Entre com a agência");
                    agenciaNova = ler.nextInt();
                    System.out.println("Entre com a conta");
                    contaNova = ler.nextInt();
                    System.out.println("Entre com o valor do primeiro depósito");
                    primeiroDeposito = ler.nextDouble();
                    
                    conta1 = new Conta(agenciaNova, contaNova);
                    
                    Depositar depositoInicial = new Depositar(conta1, primeiroDeposito);
                    bloco = new Block (depositoInicial, sistema.GetLastBlock().GetHash(), sistema.size()+1);
                    sistema.AddBlock(bloco);
                    break;
                case 2:
                    System.out.println("# Depósito #");
                    
                    int contaDeposito;
                    int agenciaDeposito;
                    double valorDeposito;
                    
                    System.out.println("Entre com a agência");
                    agenciaDeposito = ler.nextInt();
                    System.out.println("Entre com a conta");
                    contaDeposito = ler.nextInt();
                    
                    conta1 = tb.BuscarConta(sistema, agenciaDeposito, contaDeposito);
                    
                    if(conta1 == null)
                    {
                        System.out.println("Conta não encontrada");
                        break;
                    }
                    System.out.println("Entre com o valor a depositar");
                    valorDeposito = ler.nextDouble();

                    Depositar dep = new Depositar(conta1, valorDeposito);
                    bloco = new Block (dep, sistema.GetLastBlock().GetHash(), sistema.size()+1);
                    sistema.AddBlock(bloco);
                    
                    break;
                case 3:
                    System.out.println("# Saque #");
                    
                    int agenciaSaque;
                    int contaSaque;
                    double valorSaque;
                    
                    System.out.println("Entre com a agência");
                    agenciaSaque = ler.nextInt();
                    System.out.println("Entre com a conta");
                    contaSaque = ler.nextInt();
                   
                    conta1 = tb.BuscarConta(sistema, agenciaSaque, contaSaque);
                    
                    System.out.println("Entre com o valor para sacar");
                    valorSaque = ler.nextDouble();
                    
                    Sacar saq = new Sacar(conta1, valorSaque);
                    bloco = new Block (saq, sistema.GetLastBlock().GetHash(), sistema.size()+1);
                    sistema.AddBlock(bloco);
                    break;
                case 4:
                    System.out.println("# Transferência #");
                    
                    break;
                case 5:
                    System.out.println("# Depósito #");
                    
                    int contab;
                    int agenciab;
                    
                    System.out.println("Entre com a agência");
                    agenciab = ler.nextInt();
                    System.out.println("Entre com a conta");
                    contab = ler.nextInt();
                    
                    conta1 = tb.BuscarConta(sistema, agenciab, contab);
                    
                    if(conta1 == null)
                    {
                        System.out.println("Conta não encontrada");
                        break;
                    }
                    
                    System.out.println(conta1.toString());
                    break;
                default:
                    System.out.println("Opção não cadastrada");
                    break;
            }
            
            MenuOperacoes();
            opcao = ler.nextInt();
            //System.out.print("Opcao: " + opcao);
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
