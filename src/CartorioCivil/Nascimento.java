package CartorioCivil;

import java.util.Date;

public class Nascimento {
    private final Pessoa mIndividuo;
    private final Date mDataRegistro;
    
    public Nascimento(String nome, String sexo, Pessoa pai, Pessoa mae, int cpf, Date dataNascimento) {
        this.mIndividuo = new Pessoa(nome, sexo, pai, mae, cpf, dataNascimento, null);
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
        return "# Nascimento #" +
                "\nNome da criança: " + this.GetIndividuo().GetNome() +
                "\nNome do pai: " + this.GetIndividuo().GetPai().GetNome() +
                "\nNome da mãe: " + this.GetIndividuo().GetMae().GetNome() +
                "\nData do registro: " + this.GetDataRegistro() +
                "\nData do nascimento: " + this.GetIndividuo().GetDataNascimento() +
                "\nSexo da criança: " + this.GetIndividuo().GetSexo();
    }
}
