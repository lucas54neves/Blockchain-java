package Blockchain;

import java.util.Date;
import org.apache.commons.codec.digest.DigestUtils;

public class Block {
    final Object dado;
    final long tempo;
    final String hash;
    private String hashAnterior;
    final long indice;

    public Block(Object dado, String hashAnterior, long indice) {
        this.dado = dado;
        this.hashAnterior = hashAnterior;
        this.tempo = new Date().getTime();
        this.indice = indice;
        this.hash = this.calculaHash();
    }

    public Object getDado() {
        return dado;
    }

    public long getTempo() {
        return tempo;
    }

    public String getHash() {
        return hash;
    }

    public String getHashAnterior() {
        return hashAnterior;
    }

    public long getIndice() {
        return indice;
    }

    public void setHashAnterior(String hashAnterior) {
        this.hashAnterior = hashAnterior;
    }
    
    public final String calculaHash() {
        String sha256hex = DigestUtils.sha256Hex(""+this.getTempo()+this.getDado()+this.getHashAnterior()+this.getIndice());
    	return sha256hex;
    }
    
    @Override
    public String toString() {
        return "==== Bloco " + this.getIndice() + " ===="
        + "\nHash anterior: " + this.getHashAnterior()
        + "\nData de criação do bloco: " + new Date(this.getTempo())
        + "\nHash atual: " + this.getHash()
        + "\nDados do Bloco:"
        + "\n" + this.getDado().toString()
        + "========================\n\n";
    }
}
