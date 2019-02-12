package CartorioCivil;

import java.util.Date;

public class Casamento implements Operacoes{
    Pessoa conjuge1, conjuge2;
    Date dataRegistro, dataCasamento;

    public Casamento(Pessoa conjuge1, Pessoa conjuge2, Date dataCasamento) {
        this.conjuge1 = conjuge1;
        this.conjuge2 = conjuge2;
        this.dataCasamento = dataCasamento;
        this.dataRegistro = new Date();
    }

    public Pessoa getConjuge1() {
        return conjuge1;
    }

    public Pessoa getConjuge2() {
        return conjuge2;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public Date getDataCasamento() {
        return dataCasamento;
    }
    
    @Override
    public Pessoa retornaPessoa(int cpf) {
        if (cpf == this.getConjuge1().getCpf()) {
            return this.getConjuge1();
        } else if (cpf == this.getConjuge2().getCpf()) {
            return this.getConjuge2();
        } else {
            return null;
        }
    }
    
    @Override
    public String toString() {
        return "# Casamento #" +
                "\nNome dos cônjuges: " + this.getConjuge1().getNome() + " e " + this.getConjuge2().getNome() +
                "\nData do registro: " + this.getDataRegistro() +
                "\nData do casamento: " + this.getDataCasamento() +
                "\n";
    }
}
