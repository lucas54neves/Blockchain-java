package Blockchain;

import CartorioCivil.*;
import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        Nascimento registro = new Nascimento("lucas", "M", null, null, 123, new Date());
        
        Chain corrente = new Chain();
        
        Block bloco = new Block (registro, corrente.ultimoBloco().getHash(), corrente.tamanho());
        corrente.adicionaBloco(bloco);
        
        System.out.println(corrente);
    }
}
