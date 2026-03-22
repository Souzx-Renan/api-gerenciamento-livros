package trabalho.java.lista.exercicios.Produto.service;

import trabalho.java.lista.exercicios.Produto.entity.Produto;
import trabalho.java.lista.exercicios.Produto.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Indica que essa classe é um serviço do Spring
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    // Injeção de dependência via construtor
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    // Criar novo produto
    public Produto criarProduto(Produto produto) {
        return produtoRepository.save(produto); // save faz insert ou update
    }

    // Listar todos os produtos
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    // Buscar produto por ID
    public Optional<Produto> buscarProdutoPorId(Long id) {
        return produtoRepository.findById(id);
    }

    // Deletar produto por ID
    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}