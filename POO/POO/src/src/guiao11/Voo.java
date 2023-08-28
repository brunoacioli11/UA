package guiao11;

import java.io.*;
import java.util.*;

public class Voo {
    private String hora;
    private String voo;
    private String companhia;
    private String origem;
    private String atraso;
    private String obs;

    private Map<String,String> companhias = new HashMap<>();

    public Voo(String hora, String voo, String origem, String atraso) throws IOException {
        this.hora = hora;
        this.voo = voo;
        this.origem = origem;
        this.atraso = atraso;
        getCompanhias();
        

        if(this.atraso.isEmpty()) {
            this.obs = "";
        } else {
            this.obs = "Previsto " + this.previsao();
        }

        this.companhia = companhias.get(this.voo.substring(0, 2));
    }

    public String getHora() {
        return this.hora;
    }

    public String getVoo(){
        return this.voo;
    }

    public String getOrigem() {
        return this.origem;
    }

    public String getAtraso() {
        return this.atraso;
    }

    public String getObs() {
        return this.obs;
    }

    public String getCompanhia() {
        return this.companhia;
    }

    public int getAtrasoEmSeg() {
        int horaAtraso = Integer.parseInt(this.atraso.substring(0, 2)) * 3600;
        int minAtraso = Integer.parseInt(this.atraso.substring(3,5)) * 60;
        
        return horaAtraso + minAtraso;
    }

    public String previsao() {
        int horaVoo = Integer.parseInt(this.hora.substring(0,2));
        int minVoo = Integer.parseInt(this.hora.substring(3,5));
        int horaAtraso = Integer.parseInt(this.atraso.substring(0, 2));
        int minAtraso = Integer.parseInt(this.atraso.substring(3,5));

        int horaPrevisao = (horaVoo + horaAtraso + (minVoo + minAtraso)/60) % 24;
        int minPrevisao = (minVoo + minAtraso)%60;

        return String.format("%02d:%02d", horaPrevisao, minPrevisao);

    }

    @Override
    public String toString() {
        return String.format("%-7s %-8s %-20s %-21s %-7s %-40s", this.hora, this.voo, this.companhia, this.origem, this.atraso, this.obs);
    }

    

    private void getCompanhias() throws IOException{
        Scanner sc = new Scanner(new File("C:/POO/guiaoPOO/POO/src/guiao11/companhias.txt"));

        while(sc.hasNextLine()){
            String[] aux = sc.nextLine().split("\t");
            companhias.put(aux[0],aux[1]);
        }
        sc.close();
    }


}
