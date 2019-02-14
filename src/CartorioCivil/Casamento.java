package CartorioCivil;

import java.util.Date;

public class Casamento implements OperacoesCivis{
    Pessoa conjuge1, conjuge2;
    Date dataRegistro, dataCasamento;
    String estadoRegistro;

    public Casamento(Pessoa conjuge1, Pessoa conjuge2, Date dataCasamento) {
        this.conjuge1 = conjuge1;
        this.conjuge2 = conjuge2;
        if (conjuge1.getDataMorte() != null || conjuge2.getDataMorte() != null) {
            this.setEstadoRegistro("Um dos cônjuges está morto. Não é possível realizar o casamento");
            this.setDataCasamento(null);
        } if (this.getConjuge1().getEstadoCivil() == "Casado" || this.getConjuge2().getEstadoCivil() == "Casado") {
            this.estadoRegistro = "Um dos cônjuges já está casado. Não é possível realizar o casamento";
            this.dataCasamento = null;
        } else {
            this.setEstadoRegistro("Casamento realizado");
            this.setDataCasamento(dataCasamento);
            this.conjuge1.setEstadoCivil("Casado");
            this.conjuge2.setEstadoCivil("Casado");
        }
        this.dataRegistro = new Date();
    }

    private Pessoa getConjuge1() {
        return conjuge1;
    }

    private Pessoa getConjuge2() {
        return conjuge2;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public Date getDataCasamento() {
        return dataCasamento;
    }

    public String getEstadoRegistro() {
        return estadoRegistro;
    }

    private void setDataCasamento(Date dataCasamento) {
        this.dataCasamento = dataCasamento;
    }

    private void setEstadoRegistro(String estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
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
        return
            "# Casamento #\n"+
            "Nome dos cônjuges: " + this.getConjuge1().getNome() + " e " + this.getConjuge2().getNome() + "\n" +
            "Estado do casamento: " + this.getEstadoRegistro() + "\n" +
            "Data do registro: " + this.getDataRegistro() + "\n" +
            "Data do casamento: " + this.getDataCasamento() + "\n";
    }
}
