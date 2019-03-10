package CartorioCivil;

import java.util.Date;

public class Morte {
    private final Pessoa mFacecido;
    private final Date mDataRegistro;
    
    public Morte(Pessoa falecido, Date dataMorte) {
        this.mFacecido = falecido;
        this.mFacecido.SetDataMorte(dataMorte);
        this.mDataRegistro = new Date();
    }
    
    public Pessoa GetFalecido() {
        return this.mFacecido;
    }
    
    public Date GetDataRegistro() {
        return this.mDataRegistro;
    }
    
    @Override
    public String toString() {
        return "# Morte #" +
                "\nNome do falecido: " + this.GetFalecido().GetNome() +
                "\nData do registro: " + this.GetDataRegistro() +
                "\nData da morte: " + this.GetFalecido().GetDataMorte();
    }
}
