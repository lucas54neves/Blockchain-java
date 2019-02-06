package Negocio;

import Chain.*;
import java.util.Scanner;
import Pessoas.*;
import java.util.Date;

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
    
    public static Pessoa BuscarPessoa(Blockchain sistema, int cpf) {
        for (int i = sistema.size()-1; i > 0; i--) {
            Object dados = sistema.GetBlock(i).GetData();
            Pessoa individuo;
            if (dados instanceof Morte ) {
                individuo = ((Morte) dados).getFalecido();
                if (individuo.getCpf() == cpf) {
                    return null;
                }
            } else if (dados instanceof Nascimento) {
                individuo = ((Nascimento) dados).getIndividuo();
                if (individuo.getCpf() == cpf) {
                    return individuo;
                }
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        Blockchain sistema = new Blockchain();
        Block bloco;
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
                // Charmar função para o registro de imóveis
                break;
            case 2:
                System.out.println();
                System.out.println("##############################");
                System.out.println("####### Registro cívil #######");
                System.out.println("##############################");
                System.out.println("[0] - Sair do registro cívil");
                System.out.println("[1] - Registrar um nascimento");
                System.out.println("[2] - Registrar uma morte");
                System.err.println("[3] - Registrar um casamento");
                System.out.println("##############################");
                
                int opcao2 = -1;
                
                while (opcao != 0) {
                    opcao2 = ler.nextInt();
                    
                    switch (opcao2) {
                    case 0:
                        System.out.println();
                        System.out.println("##############################");
                        System.out.println("Registro Cívil fechado.");
                        System.out.println("##############################");
                        break;
                    case 1:
                        Date dataNascimento;
                        Pessoa pai, mae;
                        int cpfPai, cpfMae;
                        String nome, sexo;
                        int cpf;

                        System.out.println();
                        System.out.println("##############################");
                        
                        System.out.println("Entre com o CPF do pai");
                        cpfPai = ler.nextInt();
                        pai = BuscarPessoa(sistema, cpfPai);
                        
                        System.out.println("Entre com o CPF da mae");
                        cpfMae = ler.nextInt();
                        mae = BuscarPessoa(sistema, cpfMae);
                        
                        System.out.println("Entre com o nome da criança");
                        nome = ler.next();
                        
                        System.out.println("Entre com a data de nascimento");
                        int dia, mes, ano;
                        System.out.println("Dia: ");
                        dia = ler.nextInt();
                        System.out.println("Mês: ");
                        mes = ler.nextInt();
                        System.out.println("Ano: ");
                        ano = ler.nextInt();
                        dataNascimento = new Date(ano-1900, mes-1, dia);
                        
                        System.out.println("Entre com o sexo da criança");
                        sexo = ler.next();
                        
                        System.out.println("Entre com o cpf da criança");
                        cpf = ler.nextInt();
                        
                        Nascimento crianca = new Nascimento(nome, sexo, cpf, dataNascimento, pai, mae);
                        
                        bloco = new Block(crianca, sistema.GetLastBlock().GetHash(), sistema.size()+1);
                        sistema.AddBlock(bloco);
                        System.out.println("##############################");
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println();
                        System.out.println("##############################");
                        System.out.println("#### Opção não cadastrada ####");
                        System.out.println("##############################");
                        break;
                }
                }
                break;
            case 3:
                System.out.println();
                System.out.println("##############################");
                System.out.println("### Transações financeiras ###");
                System.out.println("##############################");
                // Charmar função para transações financeiras
                break;
            default:
                System.out.println();
                System.out.println("##############################");
                System.out.println("#### Opção não cadastrada ####");
                System.out.println("##############################");
                break;
            }
        }
    }
}
