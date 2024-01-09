package com.natrix.EazyBankBackendApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
/*@EnableJpaRepositories("com.natrix.EazyBankBackendApp.repository")
@EntityScan("com.natrix.EazyBankBackendApp.model")*/
public class EasyBankBackendAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyBankBackendAppApplication.class, args);
	}

}
