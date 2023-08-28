package guiao8;

public abstract class VeiculoMotorizado implements KmPercorridosInterface {
    private String matricula;
    private String marca;
    private String modelo;
    private int potencia;

    private int ultimoTrajeto;
    private int distanciaTotal;

    public VeiculoMotorizado(String matricula, String marca, String modelo, int potencia) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;

        this.ultimoTrajeto = 0;
        this.distanciaTotal = 0;
    }

    // Getters
    public String getMatricula() {
        return this.matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getPotencia() {
        return this.potencia;
    }

    // Setters
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    // Object methods
    @Override
    public String toString() {
        return String.format("matrícula: %s, %s, %s, %d", matricula, marca, modelo, potencia);
    }

    // KmPercorridosInterface
    public void trajeto(int quilometros) {
        this.ultimoTrajeto = quilometros;
        this.distanciaTotal += quilometros;
    }

    public int ultimoTrajeto() {
        return this.ultimoTrajeto;
    }

    public int distanciaTotal() {
        return this.distanciaTotal;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        
        if(obj == null) return false;

        if(this.getClass() != obj.getClass()) return false;

        VeiculoMotorizado other = (VeiculoMotorizado) obj;
        if(!this.getMatricula().equals(other.getMatricula()) || !this.getMarca().equals(other.getMarca()) || !this.getModelo().equals(other.getModelo()) || this.getPotencia() != other.getPotencia()){
            return false;
        }

        return true;
    }
}
