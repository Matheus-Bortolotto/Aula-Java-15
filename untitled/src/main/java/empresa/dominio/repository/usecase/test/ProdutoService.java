package empresa.dominio.repository.usecase.test;

public class ProdutoService {
    private ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    // Cadastrar um novo produto
    public void cadastrarProduto(String codigo, String nome, double preco) {
        Produto produto = new Produto(codigo, nome, preco);
        produtoRepository.salvar(produto);
    }

    // Alterar o preço de um produto
    public void alterarPreco(String codigo, double novoPreco) {
        Produto produto = produtoRepository.buscarPorCodigo(codigo);
        if (produto != null) {
            produto.setPreco(novoPreco);
            produtoRepository.salvar(produto);
        } else {
            throw new RuntimeException("Produto não encontrado");
        }
    }
}

