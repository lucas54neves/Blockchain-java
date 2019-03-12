package CartorioCivil;

import java.util.Date;

public class Nascimento {
    private final Pessoa mIndividuo;
    private final Date mDataRegistro;
    
    public Nascimento(String nome, String sexo, Pessoa pai, Pessoa mae, int cpf, Date dataNascimento) {
        this.mIndividuo = new Pessoa(nome, sexo, pai, mae, cpf, dataNascimento, null);
        this.mDataRegistro = new Date();
    }
    
    public Nascimento(Pessoa bebe) {
        this.mIndividuo = bebe;
        this.mDataRegistro = new Date();
    }
    
    public Pessoa getIndividuo() {
        return this.mIndividuo;
    }
    
    public Date getDataRegistro() {
        return this.mDataRegistro;
    }
    
    @Override
    public String toString() {
        String retorno = 
            "# Nascimento #" +
            "\nNome da criança: " + this.getIndividuo().getNome() +
            "\nNome do pai: ";
        
        if (this.getIndividuo().getPai() == null) {
            retorno += "***";
        } else {
            retorno += this.getIndividuo().getPai().getNome();
        }
        
        retorno += "\nNome da mãe: ";
        if (this.getIndividuo().getMae() == null) {
            retorno += "***";
        } else {
            retorno += this.getIndividuo().getMae().getNome();
        }
        
        retorno += "\nData do registro: " + this.getDataRegistro() +
            "\nData do nascimento: " + this.getIndividuo().getDataNascimento() +
            "\nSexo da criança: " + this.getIndividuo().getSexo() +
            "\nCPF: " + this.getIndividuo().getCpf();
                 
        return retorno;
    }
}
