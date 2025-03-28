import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos = new ArrayList<>();

    // Método getter

    public List<Produto> getProdutos() {
        return produtos;
    }

    // +------------------+
    // | MOSTRAR PRODUTOS |
    // +------------------+
    public void mostrarProdutos(){
        if(produtos.isEmpty()){
            System.out.println("\nEstoque Vazio!");
            return;
        }

        System.out.println("\n\n========= PRODUTOS EM ESTOQUE =========");
        System.out.println("ID\t| Nome\t\t| Preço\t| Quantidade");
        System.out.println("---------------------------------------");

        for(Produto produto:produtos){
            System.out.printf("%d\t| %s\t| %.2f\t| %d%n",
                    produto.getId(),
                    produto.getNome(),
                    produto.getPreco(),
                    produto.getQuantidade()
            );
        }

        System.out.println("---------------------------------------");
        System.out.printf("Total de Produtos: %d%n", produtos.size());
        System.out.println("=======================================");
    }



    // +-------------------+
    // | ADICIONAR PRODUTO |
    // +-------------------+

    public void adicionarProduto(Produto produto) {
        if (produto != null && !produtos.contains(produto)) {
            produtos.add(produto);
            System.out.println("\nADICIONADO | Produto: " + produto.getId() + " | Nome: " + produto.getNome());
        } else {
            System.out.println("\nProduto já adicionado");
        }
    }

    // +-----------------+
    // | REMOVER PRODUTO |
    // +-----------------+
    public void removerProduto(Produto produto) {
        if (produto != null && produtos.contains(produto)) {
            produtos.remove(produto);
            System.out.println("\nREMOVIDO | Produto: " + produto.getId() + " | Nome: " + produto.getNome());
        }
        else {
            System.out.println("\nProduto já removido");
        }
    }

    // +-------------------+
    // | ATUALIZAR PRODUTO |
    // +-------------------+

    public void atualizarProduto(Produto produto){
        if(produto != null){
            // Encontra o index do produto
            int index = produtos.indexOf(produto);
            if (index != -1) {
                // Substitui o produto com as atualizações
                produtos.set(index, produto);
                System.out.println("\nATUALIZADO | Produto: " + produto.getId() + " | Nome: " + produto.getNome());
            }else {
                System.out.println("\nProduto não encontrado no estoque para atualização");
            }
        }else {
            System.out.println("\nProduto inválido para atualização");
        }
    }

}
