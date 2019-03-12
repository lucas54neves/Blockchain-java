package CartorioImoveis;

import CartorioCivil.*;
import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Lucas", "M", null, null, 123, new Date(), null);
        Pessoa p2 = new Pessoa("Yasmin", "F", null, null, 234, new Date(), null);
        Imovel casa = new Imovel(p1, 25, "Rua Limpa, 123", 1235.8);
        //System.out.println(casa);
        casa.vender(p2, 1500);
        casa.vender(p2, 500);
        casa.vender(p2, 2500);
        //System.out.println(casa);
    }
}
