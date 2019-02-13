package CartorioCivil;

import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        Pessoa pai = new Pessoa(1, "José", "M", null, null, new Date());
        Pessoa mae = new Pessoa(2, "Maria", "F", null, null, new Date());
        
        System.out.println(pai);
//        System.out.println(mae);
//        
//        Nascimento parto = new Nascimento(pai, mae, new Date(), "Jesus", "M", 3);
//        
//        System.out.println(parto);
//        
//        System.out.println(parto.retornaPessoa(3).getNome());
//        
//        Casamento uniao = new Casamento(pai, mae, new Date());
//        
//        System.out.println(uniao);
//        
//        Morte morte = new Morte(parto.getIndividuo(), new Date());
//        
//        System.out.println(morte);
    }
}
