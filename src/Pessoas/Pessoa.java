package Pessoas;

import java.util.*;

public class Pessoa {
    private String nome;
    private String sexo;
    private int cpf;
    private Date dataNascimento;
    private String estadoCivil;
    private Pessoa pai;
    private Pessoa mae;
    private boolean viva;

    public Pessoa(String nome, String sexo, int cpf, Date nascimento, Pessoa pai, Pessoa mae) {
        this.setNome(nome);
        this.setSexo(sexo);
        this.setCpf(cpf);
        this.setDataNascimento(dataNascimento);
        this.setPai(pai);
        this.setMae(mae);
        this.setEstadoCivil("Solteiro");
        this.setViva(true);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
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

    public boolean isViva() {
        return viva;
    }

    public void setViva(boolean viva) {
        this.viva = viva;
    }
}
