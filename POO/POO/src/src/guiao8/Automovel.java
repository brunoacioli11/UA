package guiao8;

public class Automovel extends VeiculoMotorizado {
    private int quadro;
    private int bagageira;

    public Automovel(String matricula, String marca, String modelo, int potencia, int quadro, int bagageira) {
        super(matricula, marca, modelo, potencia);
        this.quadro = quadro;
        this.bagageira = bagageira;
    }

    public int getQuadro() {
        return this.quadro;
    }

    public int getBagageira(){
        return this.bagageira;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", %d, %d", quadro, bagageira);
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)) return false;
        System.out.println("Entrou if");
        Automovel other = (Automovel) obj;
        if(this.getQuadro() != other.getQuadro() || this.getBagageira() != other.getBagageira()) {
            return false;
        }
        return true;
    }
    
}
