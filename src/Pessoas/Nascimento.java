package Pessoas;
import java.util.*;

public final class Nascimento {
    private Date dataRegistro;
    private Date dataNascimento;
    private Pessoa pai;
    private Pessoa mae;
    private Pessoa individuo;
    
    public Nascimento(String nome, String sexo, int cpf, Date nascimento, Pessoa pai, Pessoa mae) {
        this.setDataRegistro(new Date());
        this.setDataNascimento(nascimento);
        this.setPai(pai);
        this.setMae(mae);
        this.setIndividuo(new Pessoa(nome, sexo, cpf, nascimento, pai, mae));
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public Pessoa getIndividuo() {
        return individuo;
    }

    public void setIndividuo(Pessoa individuo) {
        this.individuo = individuo;
    }
}
