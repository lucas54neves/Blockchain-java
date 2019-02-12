package CartorioCivil;

import java.util.Date;

public class Nascimento implements Operacoes{
    Pessoa individuo, pai, mae;
    Date dataNascimento, dataRegistro;
    String nome, sexo;
    int cpf;

    public Nascimento(Pessoa pai, Pessoa mae, Date dataNascimento, String nome, String sexo, int cpf) {
        this.pai = pai;
        this.mae = mae;
        this.dataNascimento = dataNascimento;
        this.dataRegistro = new Date();
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.individuo = new Pessoa(cpf, nome, sexo, pai, mae, dataNascimento);
    }

    public Pessoa getIndividuo() {
        return individuo;
    }

    public Pessoa getPai() {
        return pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public int getCpf() {
        return cpf;
    }
    
    @Override
    public Pessoa retornaPessoa(int cpf) {
        if (cpf == this.getIndividuo().getCpf()) {
            return this.getIndividuo();
        }
        return null;
    }
    
    public String toString() {
        return "# Nascimento #" +
                "\nNome da criança: " + this.getNome() +
                "\nNome do pai: " + this.getPai().getNome() +
                "\nNome da mãe: " + this.getMae().getNome() +
                "\nData do registro: " + this.getDataRegistro() +
                "\nData do nascimento: " + this.getDataNascimento() +
                "\nSexo da criança: " + this.getSexo() +
                "\n";
    }
}
