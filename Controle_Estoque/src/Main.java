import java.io.*;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        // Criando produtos
        Produto produtoA = new Produto(1,"Produto A", 10, 35.45,"Fornecedor A");
        Produto produtoB = new Produto(2,"Produto B", 5, 6.85,"Fornecedor B");
        Produto produtoC = new Produto(3,"Produto C", 4, 42.88,"Fornecedor C");
        Produto produtoD = new Produto(4,"Produto D", 9, 90.00,"Fornecedor D");
        Produto produtoE = new Produto(5,"Produto E", 27, 20.65,"Fornecedor E");
        Produto produtoF = new Produto(6,"Produto F", 20, 50.65,"Fornecedor F");

        // Adicionando produtos ao estoque
        estoque.adicionarProduto(produtoA);
        estoque.adicionarProduto(produtoB);
        estoque.adicionarProduto(produtoC);
        estoque.adicionarProduto(produtoD);
        estoque.adicionarProduto(produtoE);
        estoque.adicionarProduto(produtoF);

        // Mostrando estoque
        estoque.mostrarProdutos();

        // Removendo produto do estoque
        estoque.removerProduto(produtoF);

        // Mostrando estoque
        estoque.mostrarProdutos();

        produtoA.setQuantidade(7);
        estoque.atualizarProduto(produtoA);

        // Mostrando estoque
        estoque.mostrarProdutos();

    }
}