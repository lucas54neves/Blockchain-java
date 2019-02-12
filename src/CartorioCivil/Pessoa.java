package CartorioCivil;

import java.util.Date;

public class Pessoa {
    int cpf;
    String nome, sexo, estadoCivil;
    Pessoa pai, mae;
    Date dataNascimento, dataMorte;

    public Pessoa(int cpf, String nome, String sexo, Pessoa pai, Pessoa mae, Date dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.pai = pai;
        this.mae = mae;
        this.dataNascimento = dataNascimento;
        this.dataMorte = null;
        this.estadoCivil = "Solteiro";
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
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

    public Date getDataMorte() {
        return dataMorte;
    }

    @Override
    public String toString() {
        return "## Pessoa ##" +
                "\nNome: " + this.getNome() +
                "\nCPF: " + this.getCpf() +
                "\nSexo: " + this.getSexo()+
                "\nEstado civil: " + this.getEstadoCivil() +
                "\nPai: " + this.getPai().getNome() +
                "\nMãe: " + this.getMae().getNome() +
                "\nData nascimento: " + this.getDataNascimento() +
                "\n";
    }
}
