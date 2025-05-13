package empresa.dominio.repository.usecase.test;


public interface ProdutoRepository {
    void salvar(Produto produto);
    Produto buscarPorCodigo(String codigo);
}
