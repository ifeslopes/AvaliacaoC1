public class Produto {

    private int codigo;
    private String nome;
    private int quantidade;
    private double precoDeVenda;
    private static int geradorDeCodigo =1;

    public Produto(){};
    public Produto(String nome, int quantidade, double precoDeVenda) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoDeVenda = precoDeVenda;
        this.codigo = geradorDeCodigo;
        geradorDeCodigo++;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", precoDeVenda=" + precoDeVenda +
                '}';
    }
}
