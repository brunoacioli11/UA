package guiao7;

import java.util.*;

public class Agencia {
    private String nome;
    private String endereco;
    
    private ArrayList<Alojamento> alojamentos = new ArrayList<>();
    private ArrayList<Viatura> viaturas = new ArrayList<>();

    public Agencia(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }
    
    public String getEndereco() {
        return this.endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void addAlojamento(Alojamento alojamento) {
        this.alojamentos.add(alojamento);
    }

    public void addViatura(Viatura viatura) {
        this.viaturas.add(viatura);
    }

    public void listAlojamento(){
        for(Alojamento a: alojamentos){
            System.out.println(a);
            //System.out.println(a.getClass() + " " + a.getCodigo() + " " + a.getNome() + " " + a.getLocal() + " " + a.getPrecoNoite());
        }
    }

    public void listViaturas() {
        for(Viatura a: viaturas) {
            System.out.println(a);
            //System.out.println(a.getClass() + " " + a.getClasse() + " " + a.getMotorizacao());
        }
    }

}