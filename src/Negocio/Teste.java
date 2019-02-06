package Negocio;

import Chain.*;
import Pessoas.*;
import java.util.*;

public class Teste {
    public static void main(String[] args) {
        Pessoa pai = new Pessoa("José", "M", 123, new Date(), null, null);
        Pessoa mae = new Pessoa("Maria", "F", 123, new Date(), null, null);
        Casamento casamento = new Casamento(new Date(), new Date(), pai, mae);
        
        System.out.println("Casamento:" + casamento.Buscar());
        
        Nascimento crianca = new Nascimento("Jesus", "M", 33, new Date(), pai, mae);
        
        System.out.println("Nascimento:" + crianca.Buscar());
        
        Morte falecido = new Morte(new Date(), new Date(), crianca.getIndividuo());
        
        System.out.println("Morte:" + falecido.Buscar());
    } 
}
