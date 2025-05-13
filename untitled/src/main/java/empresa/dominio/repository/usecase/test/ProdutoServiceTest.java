package empresa.dominio.repository.usecase.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoServiceTest {
    private ProdutoService produtoService;
    private ProdutoRepository produtoRepository;

    @BeforeEach
    public void setUp() {
        produtoRepository = new ProdutoRepositoryMemoria();
        produtoService = new ProdutoService(produtoRepository);
    }

    @Test
    public void testarCadastroDeProduto() {
        produtoService.cadastrarProduto("001", "Produto A", 50.0);
        Produto produto = produtoRepository.buscarPorCodigo("001");

        assertNotNull(produto);
        assertEquals("Produto A", produto.getNome());
        assertEquals(50.0, produto.getPreco());
    }

    @Test
    public void testarAlteracaoDePreco() {
        produtoService.cadastrarProduto("002", "Produto B", 30.0);
        produtoService.alterarPreco("002", 35.0);
        Produto produto = produtoRepository.buscarPorCodigo("002");

        assertNotNull(produto);
        assertEquals(35.0, produto.getPreco());
    }

    @Test
    public void testarAlteracaoPrecoProdutoNaoExistente() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            produtoService.alterarPreco("999", 40.0);
        });

        assertEquals("Produto não encontrado", exception.getMessage());
    }
}
