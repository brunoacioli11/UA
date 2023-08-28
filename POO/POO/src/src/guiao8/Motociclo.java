package guiao8;

public class Motociclo extends VeiculoMotorizado {
    private TipoMotociclo tipo;

    public Motociclo(String matricula, String marca, String modelo, int potencia, TipoMotociclo tipo) {
        super(matricula, marca, modelo, potencia);
        this.tipo = tipo; 
    }

    public TipoMotociclo getTipo(){
        return this.tipo;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", %s", this.tipo);
    }
    
}
