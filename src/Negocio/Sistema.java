package Negocio;

import Chain.*;
import java.util.Scanner;

public class Sistema {
    public static void MenuPrint() {
        System.out.println();
        System.out.println("##############################");
        System.out.println("[0] - Sair");
        System.out.println("[1] - Registro de imóveis");
        System.out.println("[2] - Registro cívil");
        System.out.println("[3] - Transações financeiras");
        System.out.println("##############################");
    }
    
    public static void MenuOperacoes(int opcao) {
        
    }
    
    public static void main(String[] args) {
        Blockchain sistema = new Blockchain();
        int opcao = -1;
        Scanner ler = new Scanner(System.in);
        
        while (opcao != 0) {
            MenuPrint();
            opcao = ler.nextInt();
            
            switch (opcao) {
            case 0:
                System.out.println();
                System.out.println("##############################");
                System.out.println("Sistema fechado.");
                System.out.println("##############################");
                break;
            case 1:
                System.out.println();
                System.out.println("##############################");
                System.out.println("#### Registro de imóveis #####");
                System.out.println("##############################");
                System.out.println("Entre com o CPF do vendedor");
                
                int cpfComprador;
                cpfComprador = ler.nextInt();
                /*
                BuscarImovel
                Se imóvel encontrado, realizar a venda
                Senão, erro.
                */
                // Charmar função para o registro de imóveis
                break;
            case 2:
                System.out.println();
                System.out.println("##############################");
                System.out.println("####### Registro cívil #######");
                System.out.println("##############################");
                // Charmar função para o registro cívil
                break;
            case 3:
                System.out.println();
                System.out.println("##############################");
                System.out.println("### Transações financeiras ###");
                System.out.println("##############################");
                // Charmar função para transações financeiras
                break;
            default:
                break;
            }
        }
    }
}
