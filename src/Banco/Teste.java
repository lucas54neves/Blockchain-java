package Banco;

import CartorioCivil.*;
import java.util.*;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Lucineia", "F", null, null, new Date());
        Pessoa p2 = new Pessoa(2, "João", "M", null, null, new Date());
        Pessoa p3 = new Pessoa(3, "Davi", "M", p2, p1, new Date());
        
        System.out.println(p3);
        
        Conta conta1 = new Conta(p3, 12, 345);
        
        System.out.println(conta1);
        
        Deposito dep1 = new Deposito(conta1, 100);
        
        System.out.println(dep1);
        
        Saque saq1 = new Saque(conta1, 2.5);
        
        System.out.println(saq1);
        
        Conta conta2 = new Conta(p2, 12, 346);
        
        System.out.println(conta2);
        
        Transferencia transf1 = new Transferencia(conta1, conta2, 10);
        
        System.out.println(transf1);
        
        Transferencia transf2 = new Transferencia(conta1, conta2, 130.4);
        
        System.out.println(transf2);
    }
}
