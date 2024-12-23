package br.com.danilo.ProdutoServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ProdutoServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutoServicesApplication.class, args);
	}

}