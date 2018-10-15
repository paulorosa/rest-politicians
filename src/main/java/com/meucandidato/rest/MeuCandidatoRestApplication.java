package com.meucandidato.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.meucandidato")
@SpringBootApplication
public class MeuCandidatoRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeuCandidatoRestApplication.class, args);
	}
}
