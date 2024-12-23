package br.com.danilo.ProdutoServices.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.danilo.ProdutoServices.domain.Produto;
import br.com.danilo.ProdutoServices.domain.Produto.Status;

/**
 * @author danmoreira28
 *
 */

@Repository
public interface IProdutoRepository extends MongoRepository<Produto, String>{
	
	// MÉTODO - PROCURAR POR STATUS
	Page<Produto> findAllByStatus(Pageable pageable, Status status);
	
}
