package empresa.dominio.repository.usecase.test;

import java.util.HashMap;
import java.util.Map;

public class ProdutoRepositoryMemoria implements ProdutoRepository {
    private Map<String, Produto> storage = new HashMap<>();

    @Override
    public void salvar(Produto produto) {
        storage.put(produto.getCodigo(), produto);
    }

    @Override
    public Produto buscarPorCodigo(String codigo) {
        return storage.get(codigo);
    }
}
