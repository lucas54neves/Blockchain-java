package CartorioCivil;

import java.util.Date;

public class Pessoa {
    private final String mNome,mSexo;
    private String mEstadoCivil;
    private final Pessoa mPai, mMae;
    private final int mCpf;
    private final Date mDataNascimento;
    private Date mDataMorte;
    
    public Pessoa(String nome, String sexo, Pessoa pai, Pessoa mae, int cpf, Date dataNascimento, Date dataMorte) {
        this.mNome = nome;
        this.mSexo = sexo;
        this.mEstadoCivil = "Solteiro";
        this.mPai = pai;
        this.mMae = mae;
        this.mCpf = cpf;
        this.mDataNascimento = dataNascimento;
        this.mDataMorte = dataMorte;
    }

    public String getNome() {
        return this.mNome;
    }

    public String getSexo() {
        return this.mSexo;
    }

    public String getEstadoCivil() {
        return this.mEstadoCivil;
    }

    public Pessoa getPai() {
        return this.mPai;
    }

    public Pessoa getMae() {
        return this.mMae;
    }

    public int getCpf() {
        return this.mCpf;
    }

    public Date getDataNascimento() {
        return this.mDataNascimento;
    }

    public Date getDataMorte() {
        return this.mDataMorte;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.mEstadoCivil = estadoCivil;
    }

    public void setDataMorte(Date dataMorte) {
        this.mDataMorte = dataMorte;
    }
    
    public void casar() {
        if ("Casado".equals(this.getEstadoCivil())) {
            throw new IllegalArgumentException("Um dos conjuges já está casado.");
        } else if(this.getDataMorte() != null) {
            throw new IllegalArgumentException("Um dos conjuges está morto.");
        } else {
            this.setEstadoCivil("Casado");
        }
    }
    
    @Override
    public String toString() {
        String retorno = "## Pessoa ##";
        retorno += "\nNome: " + this.getNome();
        retorno += "\nCPF: " + this.getCpf();
        retorno += "\nSexo: " + this.getSexo();
        retorno += "\nEstado civil: " + this.getEstadoCivil();
        retorno += "\nPai: ";
        if (this.getPai() != null) {
            retorno += (this.getPai().getNome());
        } else {
            retorno += "***";
        }
        retorno += "\nMãe: ";
        if (this.getMae() != null) {
            retorno += (this.getMae().getNome());
        } else {
            retorno += "***";
        }
        retorno += "\nData nascimento: " + this.getDataNascimento();
        retorno += "\n";
        
        return retorno;
    }
}
