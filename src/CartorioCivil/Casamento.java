
package CartorioCivil;

import java.util.Date;

public class Casamento {
    private Pessoa mConjuge1, mConjuge2;
    private Date mDataRegistro, mDataCasamento;
    private String mEstadoRegistro;
    
    public Casamento (Pessoa pessoa1, Pessoa pessoa2, Date dataCasamento) {
        this.mConjuge1 = pessoa1;
        this.mConjuge2 = pessoa2;
        try {
            this.mConjuge1.Casar();
            this.mConjuge2.Casar();
            System.out.println("Casamento realizado.");
            this.mDataCasamento = dataCasamento;
            this.mEstadoRegistro = "Casamento registrado.";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Casamento não realizado");
            this.mDataCasamento = null;
            this.mEstadoRegistro = "Casamento não registrado.";
        } finally {
            this.mDataRegistro = new Date();
        }
    }
    
    private Pessoa GetConjuge1() {
        return this.mConjuge1;
    }

    private Pessoa GetConjuge2() {
        return this.mConjuge2;
    }

    public Date GetDataRegistro() {
        return this.mDataRegistro;
    }

    public Date GetDataCasamento() {
        return this.mDataCasamento;
    }
    
    public String GetEstadoRegistro() {
        return this.mEstadoRegistro;
    }
    
    @Override
    public String toString() {
        return
            "# Casamento #\n"+
            "Nome dos cônjuges: " + this.GetConjuge1().GetNome() + " e " + this.GetConjuge2().GetNome() + "\n" +
            "Estado do casamento: " + this.GetEstadoRegistro() + "\n" +
            "Data do registro: " + this.GetDataRegistro() + "\n" +
            "Data do casamento: " + this.GetDataCasamento() + "\n";
    }
}