package CartorioCivil;

import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        // (String nome, String sexo, Pessoa pai, Pessoa mae, int cpf, Date dataNascimento, Date dataMorte)
        
        Pessoa p1 = new Pessoa("José", "M", null, null, 1, new Date(), new Date());
        Pessoa p2 = new Pessoa("Maria", "F", null, null, 2, new Date(), null);
        Pessoa p3 = new Pessoa("Marcos", "M", null, null, 3, new Date(), null);
        
        //System.out.println(p1);
        //System.out.println(p2);
        
        Casamento uniao1 = new Casamento(p1, p2, new Date());
        Casamento uniao2 = new Casamento(p2, p3, new Date());
        
        //System.out.println(uniao1);
        //System.out.println(uniao2);
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
