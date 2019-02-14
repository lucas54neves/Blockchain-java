package CartorioCivil;

import java.util.Date;

public class Morte implements OperacoesCivis{
    Pessoa facelido;
    Date dataRegistro, dataMorte;

    public Morte(Pessoa facelido, Date dataMorte) {
        this.facelido = facelido;
        this.dataMorte = dataMorte;
        this.dataRegistro = new Date();
    }

    public Pessoa getFacelido() {
        return facelido;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public Date getDataMorte() {
        return dataMorte;
    }
    
    @Override
    public Pessoa retornaPessoa(int cpf) {
        if (cpf == this.getFacelido().getCpf()) {
            return this.getFacelido();
        } else {
            return null;
        }
    }
    
    @Override
    public String toString() {
        return "# Morte #" +
                "\nNome do falecido: " + this.getFacelido().getNome() +
                "\nData do registro: " + this.getDataRegistro() +
                "\nData da morte: " + this.getDataMorte() +
                "\n";
    }
}
