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

    public String GetNome() {
        return this.mNome;
    }

    public String GetSexo() {
        return this.mSexo;
    }

    public String GetEstadoCivil() {
        return this.mEstadoCivil;
    }

    public Pessoa GetPai() {
        return this.mPai;
    }

    public Pessoa GetMae() {
        return this.mMae;
    }

    public int GetCpf() {
        return this.mCpf;
    }

    public Date GetDataNascimento() {
        return this.mDataNascimento;
    }

    public Date GetDataMorte() {
        return this.mDataMorte;
    }

    public void SetEstadoCivil(String estadoCivil) {
        this.mEstadoCivil = estadoCivil;
    }

    public void SetDataMorte(Date dataMorte) {
        this.mDataMorte = dataMorte;
    }
    
    public void Casar() {
        if ("Casado".equals(this.GetEstadoCivil())) {
            throw new IllegalArgumentException("Um dos conjuges já está casado.");
        } else if(this.GetDataMorte() != null) {
            throw new IllegalArgumentException("Um dos conjuges está morto.");
        } else {
            this.SetEstadoCivil("Casado");
        }
    }
    
    @Override
    public String toString() {
        String retorno = "## Pessoa ##";
        retorno += "\nNome: " + this.GetNome();
        retorno += "\nCPF: " + this.GetCpf();
        retorno += "\nSexo: " + this.GetSexo();
        retorno += "\nEstado civil: " + this.GetEstadoCivil();
        retorno += "\nPai: ";
        if (this.GetPai() != null) {
            retorno += (this.GetPai().GetNome());
        } else {
            retorno += "***";
        }
        retorno += "\nMãe: ";
        if (this.GetMae() != null) {
            retorno += (this.GetMae().GetNome());
        } else {
            retorno += "***";
        }
        retorno += "\nData nascimento: " + this.GetDataNascimento();
        retorno += "\n";
        
        return retorno;
    }
}
