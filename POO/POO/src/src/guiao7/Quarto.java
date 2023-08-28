package guiao7;

public class Quarto extends Alojamento {
    private TipoDeQuarto tipo;

    public Quarto(String codigo, String nome, String local, double precoNoite, TipoDeQuarto tipo) {
        super(codigo, nome, local, precoNoite);
        this.tipo = tipo;
    }

    public TipoDeQuarto getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoDeQuarto tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String res = this.getClass() + " " + this.getCodigo() + " " + this.getNome() + " " + this.getLocal() + " " + this.getPrecoNoite() + " " + this.getTipo(); 
        return res;
    }


}
