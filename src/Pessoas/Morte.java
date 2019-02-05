package Pessoas;

import java.util.Date;

public final class Morte {
    private Date dataRegistro;
    private Date dataMorte;
    private Pessoa falecido;

    public Morte(Date dataRegistro, Date dataMorte, Pessoa falecido) {
        this.setDataRegistro(dataRegistro);
        this.setDataMorte(dataMorte);
        this.setFalecido(falecido);
        this.getFalecido().setViva(false);
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Date getDataMorte() {
        return dataMorte;
    }

    public void setDataMorte(Date dataMorte) {
        this.dataMorte = dataMorte;
    }

    public Pessoa getFalecido() {
        return falecido;
    }

    public void setFalecido(Pessoa falecido) {
        this.falecido = falecido;
    }
}
