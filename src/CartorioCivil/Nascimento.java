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
    
    public Pessoa GetIndividuo() {
        return this.mIndividuo;
    }
    
    public Date GetDataRegistro() {
        return this.mDataRegistro;
    }
    
    @Override
    public String toString() {
        String retorno = 
            "# Nascimento #" +
            "\nNome da criança: " + this.GetIndividuo().GetNome() +
            "\nNome do pai: ";
        
        if (this.GetIndividuo().GetPai() == null) {
            retorno += "***";
        } else {
            retorno += this.GetIndividuo().GetPai().GetNome();
        }
        
        retorno += "\nNome da mãe: ";
        if (this.GetIndividuo().GetMae() == null) {
            retorno += "***";
        } else {
            retorno += this.GetIndividuo().GetMae().GetNome();
        }
        
        retorno += "\nData do registro: " + this.GetDataRegistro() +
            "\nData do nascimento: " + this.GetIndividuo().GetDataNascimento() +
            "\nSexo da criança: " + this.GetIndividuo().GetSexo() +
            "\nCPF: " + this.GetIndividuo().GetCpf();
                 
        return retorno;
    }
}
