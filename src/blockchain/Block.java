package blockchain;

import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;

public class Block {
    private Object mData; //our data will be a simple message.
    private long mTimeStamp; //as number of milliseconds since 1/1/1970.
    private String mHash;
    private String mPreviousHash;
    private long mIndex;
    
    // Construtor do bloco, utilizando como parâmetro do dado de entrada,
    // a hash do último bloco da blockchain e o índice do novo bloco.
    public Block(Object data, String previousHash, long i) {
    	this.mData = data;
    	this.mPreviousHash = previousHash;
    	this.mTimeStamp = new Date().getTime();
    	this.mHash = CalculateHash();
    	this.mIndex = i;
    }
    
    // Retorna o dado armazenado no bloco
	public Object GetData() {
        return this.mData;
    }
    
    // Retorna a hash do bloco anterior lincado ao bloco atual
	public String GetPreviousHash() {
        return this.mPreviousHash;
    }
    
    // Retorna a hash do bloco atual
	public String GetHash() {
        return this.mHash;
    }
    
    // Retorna o tempo que o bloco foi criado
    public long GetTime() {
        return this.mTimeStamp;
    }
    
    // Retorna o índice do bloco
    public long GetIndex() {
        return this.mIndex;
    }
    
    // Insere a hash do bloco anterior ao bloco atual
    // Método necessário porque o atributo mPreviousHash está como privado
    public void ModPreviousHash(String hash) {
        mPreviousHash = hash;
    }
    
    // Calcula a hash do bloco atual
    public String CalculateHash() {
    	String sha256hex = DigestUtils.sha256Hex(mTimeStamp+(String)mData+mPreviousHash+mIndex);
    	return sha256hex;
    }
}
