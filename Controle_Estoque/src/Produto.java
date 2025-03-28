public class Produto {
    private int id;
    private String nome;
    private int quantidade;
    private double preco;
    private String fornecedor;

    public Produto(int id, String nome, int quantidade, double preco, String fornecedor)
    {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }

    // Getters

    public int getId() {return id;}
    public String getNome() {return nome;}
    public int getQuantidade() {return quantidade;}
    public double getPreco() {return preco;}
    public String getFornecedor(){return fornecedor;}

    // Setters
    public void setId(int id){this.id = id;}
    public void setNome(String nome){this.nome = nome;}
    public void setQuantidade(int quantidade){this.quantidade = quantidade;}
    public void setPreco(double preco){this.preco = preco;}
    public void setFornecedor(String fornecedor){this.fornecedor = fornecedor;}

}
