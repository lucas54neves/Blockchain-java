package CartorioCivil;

import java.util.Date;

public class Morte {
    private final Pessoa mFacecido;
    private final Date mDataRegistro;
    
    public Morte(Pessoa falecido, Date dataMorte) {
        this.mFacecido = falecido;
        this.mFacecido.setDataMorte(dataMorte);
        this.mDataRegistro = new Date();
    }
    
    public Pessoa getFalecido() {
        return this.mFacecido;
    }
    
    public Date getDataRegistro() {
        return this.mDataRegistro;
    }
    
    @Override
    public String toString() {
        return "# Morte #" +
                "\nNome do falecido: " + this.getFalecido().getNome() +
                "\nData do registro: " + this.getDataRegistro() +
                "\nData da morte: " + this.getFalecido().getDataMorte();
    }
}
