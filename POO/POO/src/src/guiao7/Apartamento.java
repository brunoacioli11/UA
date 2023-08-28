package guiao7;

public class Apartamento extends Alojamento{
    private int quartos;

    public Apartamento(String codigo, String nome, String local, double precoNoite, int quartos) {
        super(codigo, nome, local, precoNoite);

        this.quartos = quartos;
    }

    public int getNumDeQuartos() {
        return this.quartos;
    }

    public void setNumDeQuartos(int quartos) {
        this.quartos = quartos;
    } 

    @Override
    public String toString(){
        String res;
        res = this.getClass() + " " + this.getCodigo() + " " + this.getNome() + " " + this.getLocal() + " " + this.getPrecoNoite() + " " + this.getNumDeQuartos();
        return res;
    }
}
