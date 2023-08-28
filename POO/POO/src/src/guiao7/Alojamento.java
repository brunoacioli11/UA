package guiao7;

public abstract class Alojamento {
    private String codigo;
    private String nome;
    private String local;
    private double precoNoite;
    private boolean disponibilidade;
    private double avaliacao;
    private int nAvaliacoes;

    public Alojamento(String codigo, String nome, String local, double precoNoite) {
        this.codigo = codigo;
        this.nome = nome;
        this.local = local;
        this.precoNoite = precoNoite;

        this.disponibilidade = true;
        this.avaliacao = 0f;
        this.nAvaliacoes = 0;
    }

    // Setters and Getters
    public String getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getLocal() {
        return this.local;
    }

    public double getPrecoNoite() {
        return this.precoNoite;
    }

    public boolean disponivel() {
        return this.disponibilidade;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setPrecoNoite(double preco) {
        this.precoNoite = preco;
    }
    
    // Instance methods
    public void checkin() {
        this.disponibilidade = false;
    }

    public void checkout() {
        this.disponibilidade = true;
    }
    public void checkout(double avaliacao) {
        this.disponibilidade = true;

        atualizarAvaliacao(avaliacao);
    }

    private void atualizarAvaliacao(double avaliacao) {
        this.nAvaliacoes++;

        this.avaliacao = (this.avaliacao+avaliacao)/nAvaliacoes;
    }

}
