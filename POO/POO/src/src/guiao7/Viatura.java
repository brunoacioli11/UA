package guiao7;

public class Viatura {
    private char classe;
    private Motorizacao motorizacao;
    private boolean disponivel;

    public Viatura(char classe, Motorizacao motorizacao) {
        this.classe = classe;
        this.motorizacao = motorizacao;
        
        this.disponivel = false;
    }

    public char getClasse() {
        return this.classe;
    }

    public Motorizacao getMotorizacao() {
        return this.motorizacao;
    }

    public boolean disponivel() {
        return this.disponivel;
    }

    public void levantar() {
        this.disponivel = false;
    }

    public void entregar() {
        this.disponivel = true;
    }

    @Override
    public String toString(){
        String res;
        res = this.getClass() + " " + this.getClasse() + " " + this.getMotorizacao();

        return res;
    }

}
