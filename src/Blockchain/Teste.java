package Blockchain;

import CartorioCivil.*;
import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("lucas", "M", null, null, 123, new Date(), new Date());
        Block block = new Block(p1, "abs", 1);
        Chain corrente = new Chain();
        corrente.adicionaBloco(block);
        System.out.println(corrente);
    }
}
