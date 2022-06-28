public class Produto {
    protected String nome;
    protected double preco;

   public Produto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcular(int quantidadeDeProdutos) {
        return this.preco * quantidadeDeProdutos;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
