package Sistema;

import Chain.*;
import Banco.*;
import CartorioCivil.*;
import java.util.Date;
//import CartorioIomeis.*;

public class Sistema {
    public void criaBancoDados(Blockchain chain) {
        criaBancoDadosCivil(chain);
    }
    
    public void criaBancoDadosCivil(Blockchain chain) {
        Block bloco;
        
        Pessoa p1 = new Pessoa(1, "João", "M", null, null, new Date());
        Pessoa p2 = new Pessoa(2, "Maria", "F", null, null, new Date());
        
        Casamento uniao1 = new Casamento(p1, p2, new Date());
        bloco = new Block (uniao1, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Pessoa p3 = new Pessoa(3, "Fernando", "M", null, null, new Date());
        Pessoa p4 = new Pessoa(4, "Marcela", "F", null, null, new Date());
        
        Casamento uniao2 = new Casamento(p3, p4, new Date());
        bloco = new Block (uniao2, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Nascimento crianca1 = new Nascimento(p1, p2, new Date(), "Joana", "F", 5);
        Pessoa f1 = crianca1.getIndividuo();
        bloco = new Block (crianca1, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Nascimento crianca2 = new Nascimento(p1, p2, new Date(), "Joaquina", "F", 6);
        Pessoa f2 = crianca2.getIndividuo();
        bloco = new Block (crianca2, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Nascimento crianca3 = new Nascimento(p3, p4, new Date(), "Joaquim", "M", 7);
        Pessoa f3 = crianca3.getIndividuo();
        bloco = new Block (crianca1, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Nascimento crianca4 = new Nascimento(p3, p4, new Date(), "Joana", "F", 8);
        Pessoa f4 = crianca4.getIndividuo();
        bloco = new Block (crianca1, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Nascimento crianca5 = new Nascimento(p1, p2, new Date(), "Joaquina", "F", 9);
        Pessoa f5 = crianca5.getIndividuo();
        bloco = new Block (crianca2, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Nascimento crianca6 = new Nascimento(p3, p4, new Date(), "Joaquim", "M", 10);
        Pessoa f6 = crianca6.getIndividuo();
        bloco = new Block (crianca1, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Casamento uniao3 = new Casamento(f1, f3, new Date());
        bloco = new Block (uniao3, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Casamento uniao4 = new Casamento(f2, f4, new Date());
        bloco = new Block (uniao4, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Casamento uniao5 = new Casamento(f5, f6, new Date());
        bloco = new Block (uniao5, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);

        Morte morte1 = new Morte(p1, new Date());
        bloco = new Block (morte1, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Morte morte2 = new Morte(f3, new Date());
        bloco = new Block (morte2, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Morte morte3 = new Morte(f4, new Date());
        bloco = new Block (morte3, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Morte morte4 = new Morte(f6, new Date());
        bloco = new Block (morte4, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        criaBancoDadosBancario(chain, p1, p2, p3, p4, f1, f2, f3, f4, f5, f6);
    }
    
    public void criaBancoDadosBancario(Blockchain chain, Pessoa p1, Pessoa p2, Pessoa p3, Pessoa p4, Pessoa p5, Pessoa p6, Pessoa p7, Pessoa p8, Pessoa p9, Pessoa p10) {
        Block bloco;
        
        Conta conta1 = new Conta(p1, 1, 123);
        Conta conta2 = new Conta(p2, 1, 124);
        Conta conta3 = new Conta(p3, 3, 125);
        Conta conta4 = new Conta(p4, 2, 126);
        Conta conta5 = new Conta(p5, 5, 127);
        Conta conta6 = new Conta(p6, 2, 130);
        Conta conta7 = new Conta(p7, 4, 131);
        Conta conta8 = new Conta(p8, 5, 132);
        Conta conta9 = new Conta(p9, 1, 135);
        Conta conta10 = new Conta(p10, 4, 140);
        
        Deposito dep1 = new Deposito(conta1, 1000);
        bloco = new Block (dep1, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Deposito dep2 = new Deposito(conta3, 1580);
        bloco = new Block (dep2, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Deposito dep3 = new Deposito(conta5, 300);
        bloco = new Block (dep3, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Deposito dep4 = new Deposito(conta7, 400);
        bloco = new Block (dep4, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Deposito dep5 = new Deposito(conta9, 680);
        bloco = new Block (dep5, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Saque saq1 = new Saque(conta1, 100);
        bloco = new Block (saq1, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Saque saq2 = new Saque(conta3, 80);
        bloco = new Block (saq2, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Saque saq3 = new Saque(conta5, 800);
        bloco = new Block (saq3, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Saque saq4 = new Saque(conta7, 8000);
        bloco = new Block (saq4, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Saque saq5 = new Saque(conta9, 900);
        bloco = new Block (saq5, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Transferencia tra1 = new Transferencia(conta1, conta2, 150);
        bloco = new Block (tra1, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Transferencia tra2 = new Transferencia(conta2, conta4, 50);
        bloco = new Block (tra2, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Transferencia tra3 = new Transferencia(conta3, conta4, 158);
        bloco = new Block (tra3, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Transferencia tra4 = new Transferencia(conta4, conta2, 800);
        bloco = new Block (tra4, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Transferencia tra5 = new Transferencia(conta5, conta8, 80);
        bloco = new Block (tra5, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Transferencia tra6 = new Transferencia(conta1, conta6, 90);
        bloco = new Block (tra6, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Transferencia tra7 = new Transferencia(conta1, conta8, 9.5);
        bloco = new Block (tra7, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Transferencia tra8 = new Transferencia(conta2, conta10, 50);
        bloco = new Block (tra8, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Transferencia tra9 = new Transferencia(conta8, conta10, 10);
        bloco = new Block (tra9, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
        
        Transferencia tra10 = new Transferencia(conta1, conta10, 100);
        bloco = new Block (tra10, chain.GetLastBlock().GetHash(), chain.size()+1);
        chain.AddBlock(bloco);
    }
    
    public static void main(String[] args) {
        Blockchain chain = new Blockchain();
        Sistema tb = new Sistema();
        tb.criaBancoDados(chain);
        chain.Print();
    }
}
