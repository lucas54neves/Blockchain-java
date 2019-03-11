package Blockchain;

import java.util.Date;
import org.apache.commons.codec.digest.DigestUtils;

public class Block {
    private final Object mDado;
    private final long mTempo;
    private final String mHash;
    private String mHashAnterior;
    private final long mIndice;

    public Block(Object dado, String hashAnterior, long indice) {
        this.mDado = dado;
        this.mHashAnterior = hashAnterior;
        this.mTempo = new Date().getTime();
        this.mIndice = indice;
        this.mHash = this.calculaHash();
    }

    public Object getDado() {
        return this.mDado;
    }

    public long getTempo() {
        return this.mTempo;
    }

    public String getHash() {
        return this.mHash;
    }

    public String getHashAnterior() {
        return this.mHashAnterior;
    }

    public long getIndice() {
        return this.mIndice;
    }

    public void setHashAnterior(String hashAnterior) {
        this.mHashAnterior = hashAnterior;
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
        + "\n========================\n\n";
    }
}
