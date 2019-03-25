package CartorioImoveis;

import CartorioCivil.*;

public class Imovel {
    private Pessoa mDono;
    private final int mCodigo;
    private final String mEndereco;
    private double mValor;

    public Imovel(Pessoa dono, int codigo, String endereco, double valor) {
        this.mDono = dono;
        this.mCodigo = codigo;
        this.mEndereco = endereco;
        this.mValor = valor;
    }

    public Pessoa getDono() {
        return this.mDono;
    }

    public int getCodigo() {
        return this.mCodigo;
    }

    public String getEndereco() {
        return this.mEndereco;
    }

    public double getValor() {
        return this.mValor;
    }

    public void setDono(Pessoa mDono) {
        this.mDono = mDono;
    }

    public void setValor(double mValor) {
        this.mValor = mValor;
    }
    
    public CompraVenda vender(Pessoa comprador, double oferta) {
        this.setDono(comprador);
        this.setValor(oferta);
        return new CompraVenda(this, comprador, oferta);
    }
    
    @Override
    public String toString() {
        return "## Imóvel ##" +
                "\nCódigo: " + this.getCodigo() +
                "\nDono: " + this.getDono().getNome() +
                "\nEndereço: " + this.getEndereco() +
                "\nValor: " + this.getValor();
    }
}
