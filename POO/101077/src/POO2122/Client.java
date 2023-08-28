package POO2122;


public class Client {
    private String nome;
    private String localidade;

    public Client(String nome, String localidade) {
        this.nome = nome;
        this.localidade = localidade;
    }

    public String getNome() {
        return this.nome;

    }

    public String getLocalidade() {
        return this.localidade;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-30s", this.getNome(), this.getLocalidade());
    }
}
