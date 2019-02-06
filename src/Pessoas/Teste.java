package Pessoas;

import Chain.*;
import static Negocio.Sistema.BuscarPessoa;
import java.util.*;

public class Teste {
    public static void main(String[] args) {
        Pessoa pai = new Pessoa("Fernando", "Masculino", 123, new Date(), null, null);
        Pessoa mae = new Pessoa("Maria", "Feminino", 123, new Date(), null, null);
        Casamento crianca = new Casamento(new Date(), new Date(), pai, mae);
        
        System.out.print(crianca);
    } 
}
