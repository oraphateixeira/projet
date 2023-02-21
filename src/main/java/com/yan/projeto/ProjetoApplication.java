package com.yan.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.yan.projeto.domain")
public class ProjetoApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
	}

}
