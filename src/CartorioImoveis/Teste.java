package CartorioImoveis;

import CartorioCivil.*;
import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(123, "Lucas", "M", null, null, new Date());
        Pessoa p2 = new Pessoa(123, "Yasmin", "F", null, null, new Date());
        Imovel casa = new Imovel(p1, 25, "Rua Limpa, 123", 1235.8);
        System.out.println(casa);
        casa.vender(p2, 1500);
        System.out.println(casa);
    }
}
