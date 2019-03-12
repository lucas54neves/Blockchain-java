
package CartorioCivil;

import java.util.Date;

public class Casamento {
    private Pessoa mConjuge1, mConjuge2;
    private final Date mDataRegistro;
    private Date mDataCasamento;
    private String mEstadoRegistro;
    
    public Casamento (Pessoa pessoa1, Pessoa pessoa2, Date dataCasamento) {
        this.mConjuge1 = pessoa1;
        this.mConjuge2 = pessoa2;
        try {
            this.mConjuge1.casar();
            this.mConjuge2.casar();
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
    
    private Pessoa getConjuge1() {
        return this.mConjuge1;
    }

    private Pessoa getConjuge2() {
        return this.mConjuge2;
    }

    public Date getDataRegistro() {
        return this.mDataRegistro;
    }

    public Date getDataCasamento() {
        return this.mDataCasamento;
    }
    
    public String getEstadoRegistro() {
        return this.mEstadoRegistro;
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