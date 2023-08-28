package guiao6;

import guiao5.*;

import java.time.*;

public class Aluno extends Pessoa{
    private int nMec;
    private Data dataInsc;

    private static int count = 100;

    public Aluno(String name, int cc, Data dataNasc, Data dataInsc){
        super(name, cc, dataNasc);
        this.nMec = count++;
        this.dataInsc = dataInsc;
    }

    public Aluno(String name, int cc, Data dataNasc){
        super(name, cc, dataNasc);
        this.nMec = count++;
        int day, month, year;

        day = LocalDate.now().getDayOfMonth();
        month = LocalDate.now().getMonth().getValue();
        year = LocalDate.now().getYear();

        this.dataInsc = new Data(day, month, year);
    }

    

    public int getnMec() {
        return this.nMec;
    }

    public Data getDataInsc() {
        return this.dataInsc;
    }

    public void setDataInsc(Data dataInsc) {
        this.dataInsc = dataInsc;
    }

    @Override
    public String toString() {
        return String.format("%s; Numero Mecanografico: %d",
                             this.getName(), this.getnMec());
    }


}
