package br.com.danilo.ProdutoServices.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.danilo.ProdutoServices.domain.Produto;
import br.com.danilo.ProdutoServices.repository.IProdutoRepository;

/**
 * @author danmoreira28
 *
 */

@Service
public class BuscarProduto {
	
	// ATRIBUTO
	private IProdutoRepository produtoRepository;
	
	// CONSTRUTOR
	@Autowired
	public BuscarProduto(IProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	// MÉTODO (1)
	public Page<Produto> buscar(Pageable pageable) {
		
		return produtoRepository.findAll(pageable);		
	}
}
