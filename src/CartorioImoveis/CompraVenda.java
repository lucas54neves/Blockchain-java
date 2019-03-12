package CartorioImoveis;

import CartorioCivil.*;
import java.util.*;

public class CompraVenda {
    private final Imovel mImovel;
    private final Pessoa mComprador, mVendedor;
    private final double mValor;
    private final Date mDataRegistro;

    public CompraVenda(Imovel imovel, Pessoa comprador, Pessoa vendedor, double oferta) {
        this.mImovel = imovel;
        this.mComprador = comprador;
        this.mVendedor = vendedor;
        this.mValor = oferta;
        this.mImovel.vender(comprador, oferta);
        this.mDataRegistro = new Date();
    }

    public Imovel getImovel() {
        return mImovel;
    }

    public Pessoa getComprador() {
        return mComprador;
    }

    public Pessoa getVendedor() {
        return mVendedor;
    }

    public double getValor() {
        return mValor;
    }

    public Date getDataRegistro() {
        return mDataRegistro;
    }
    
    @Override
    public String toString() {
        return 
            "##Registro de venda ###\n" +
            "ID do imóvel: " + this.getImovel().getCodigo() + "\n" +
            "Nome do comprador: " + this.getComprador().getNome() + "\n" +
            "Nome do vendedor: " + this.getVendedor().getNome() + "\n" +
            "Valor da venda: " + this.getValor() + "\n" +
            "Data do registro: " + this.getDataRegistro();
    }
}
