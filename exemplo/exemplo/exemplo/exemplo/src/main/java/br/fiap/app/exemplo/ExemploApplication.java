package br.fiap.app.exemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //sinaliza classe principal
public class ExemploApplication {

	public static void main(String[] args) { //executa nossa aplicação
		SpringApplication.run(ExemploApplication.class, args);
	}

}
