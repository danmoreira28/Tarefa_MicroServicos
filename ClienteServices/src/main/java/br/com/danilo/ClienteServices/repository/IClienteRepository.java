package br.com.danilo.ClienteServices.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.danilo.ClienteServices.domain.Cliente;


/**
 * @author danmoreira28
 *
 */

@Repository
public interface IClienteRepository extends MongoRepository<Cliente, String> {

	// PROCURAR POR CPF
	Optional<Cliente> findByCpf(Long cpf);

}