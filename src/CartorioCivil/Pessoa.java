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

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        String retorno = "";
        
        retorno = "## Pessoa ##";
        retorno = retorno + "\nNome: " + this.getNome();
        retorno = retorno + "\nCPF: " + this.getCpf();
        retorno = retorno + "\nSexo: " + this.getSexo();
        retorno = retorno + "\nEstado civil: " + this.getEstadoCivil();
        retorno = retorno + "\nPai: ";
        if (this.getPai() != null) {
            retorno = retorno + (this.getPai().getNome());
        } else {
            retorno = retorno + "***";
        }
        retorno = retorno + "\nMãe: ";
        if (this.getMae() != null) {
            retorno = retorno + (this.getMae().getNome());
        } else {
            retorno = retorno + "***";
        }
        retorno = retorno + "\nData nascimento: " + this.getDataNascimento();
        retorno = retorno + "\n";
        
        return retorno;
    }
}
