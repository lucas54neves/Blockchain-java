package Pessoas;

import java.util.Date;

public class Casamento {
    private Date dataRegistro;
    private Date dataCasamento;
    private Pessoa conjuge1;
    private Pessoa conjuge2;

    public Casamento(Date dataRegistro, Date dataCasamento, Pessoa conjuge1, Pessoa conjuge2) {
        this.dataRegistro = dataRegistro;
        this.dataCasamento = dataCasamento;
        this.conjuge1 = conjuge1;
        this.conjuge2 = conjuge2;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Date getDataCasamento() {
        return dataCasamento;
    }

    public void setDataCasamento(Date dataCasamento) {
        this.dataCasamento = dataCasamento;
    }

    public Pessoa getConjuge1() {
        return conjuge1;
    }

    public void setConjuge1(Pessoa conjuge1) {
        this.conjuge1 = conjuge1;
    }

    public Pessoa getConjuge2() {
        return conjuge2;
    }

    public void setConjuge2(Pessoa conjuge2) {
        this.conjuge2 = conjuge2;
    }
    
    
}
