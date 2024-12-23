package br.com.danilo.ClienteServices.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author danmoreira28
 */

@Document(collection = "cliente")
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Cliente {
	@Id
	private String id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private Long cpf;
	
	private Long telefone;
}
