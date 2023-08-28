package guiao6;

import guiao5.*;

public class Bolseiro extends Aluno{
    private double bolsaMensal;

    public Bolseiro(String nome, int cc, Data dataNasc, Data dataInsc, double bolsaMensal) {
        super(nome, cc, dataNasc, dataInsc);
        this.bolsaMensal = bolsaMensal;
    }

    public Bolseiro(String nome, int cc, Data dataNasc, double bolsaMensal) {
        super(nome, cc, dataNasc);
        this.bolsaMensal = bolsaMensal;
    }

    public double getBolsaMensal() {
        return this.bolsaMensal;
    }

    public void setBolsaMensal(double bolsaMensal) {
        this.bolsaMensal = bolsaMensal;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Bolsa: %s",
                                                 this.bolsaMensal);
    }
}
