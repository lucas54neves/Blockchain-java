package CartorioImoveis;

import CartorioCivil.*;

public class Imovel {
    private Pessoa dono;
    private final int codigo;
    private final String endereco;
    private double valor;

    public Imovel(Pessoa dono, int codigo, String endereco, double valor) {
        this.dono = dono;
        this.codigo = codigo;
        this.endereco = endereco;
        this.valor = valor;
    }

    public Pessoa getDono() {
        return dono;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }
    
    public void vender(Pessoa comprador, double valor) {
        this.dono = comprador;
        this.valor = valor;
    }
    
    public String toString() {
        return "## Imóvel ##" +
                "\nCódigo: " + this.getCodigo() +
                "\nDono: " + this.getDono().getNome() +
                "\nEndereço: " + this.getEndereco() +
                "\nValor: " + this.getValor() +
                "\n";
    }
}
