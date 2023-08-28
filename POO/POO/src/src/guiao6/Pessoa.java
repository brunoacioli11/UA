package guiao6;

import guiao5.Data;

public class Pessoa {
    private String name;
    private int cc;
    private Data dataNasc;

    public Pessoa(String name, int cc, Data dataNasc) {
        assert validCC(cc);
        this.name = name;
        this.cc = cc;
        this.dataNasc = dataNasc;
    }

    public String getName()  {
        return this.name;
    }

    public int getCC() {
        assert validCC(cc);
        return this.cc;
    }

    public Data getDataNasc(){
        return this.dataNasc;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public void setCC(int cc) {
        this.cc = cc;
    }

    public void setDataNasc(Data dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Pessoa other = (Pessoa) obj;
        if(this.name.equals(other.name)){
            if(this.cc == other.cc) {
                if(this.dataNasc.equals(other.dataNasc)){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result;
        result = this.name.hashCode();
        result += this.dataNasc.hashCode();
        result += this.cc;
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s; CC: %d; Data de Nascimento: %s", name, cc, dataNasc);
    }

    public static boolean validCC(int cc) { return cc > 0;}

    public static void main(String[] args) {
        Pessoa m1 = new Pessoa("Maria Beatriz", 1234567, new Data(9,06,2022));
        Pessoa m2 = new Pessoa("Maria Beatriz", 1234567, new Data(9,06,2022));

        System.out.println(m1.equals(m2));
        System.out.printf("hashcodes: m1=%d , m2=%d%n", m1.hashCode(), m2.hashCode());
    }
}

