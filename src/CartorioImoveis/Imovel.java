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

    public Pessoa GetDono() {
        return this.mDono;
    }

    public int GetCodigo() {
        return this.mCodigo;
    }

    public String GetEndereco() {
        return this.mEndereco;
    }

    public double GetValor() {
        return this.mValor;
    }
    
    public void Vender(Pessoa comprador, double oferta) {
        try {
            if (oferta < this.GetValor()) {
                throw new IllegalArgumentException("Oferta é menor do que o valor do imóvel.");
            } else {
                this.mDono = comprador;
                this.mValor = oferta;
                System.out.println("Venda realizada.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Venda não realizada.");
        }
    }
    
    @Override
    public String toString() {
        return "## Imóvel ##" +
                "\nCódigo: " + this.GetCodigo() +
                "\nDono: " + this.GetDono().GetNome() +
                "\nEndereço: " + this.GetEndereco() +
                "\nValor: " + this.GetValor();
    }
}
