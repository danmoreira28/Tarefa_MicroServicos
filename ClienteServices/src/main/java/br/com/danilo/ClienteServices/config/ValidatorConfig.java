package br.com.danilo.ClienteServices.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import jakarta.validation.Validator;

/**
 * @author danmoreira28
 */

@Configuration
public class ValidatorConfig {

	@Bean
	public Validator validatorFactory() {
		LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
		return bean;
	}
}
