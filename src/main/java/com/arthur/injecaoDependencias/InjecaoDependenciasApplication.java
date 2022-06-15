package com.arthur.injecaoDependencias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InjecaoDependenciasApplication {

	public static void main(String[] args) {
		SpringApplication.run(InjecaoDependenciasApplication.class, args);

		Cliente cliente = new Cliente("1234567" ,"Arthur","arthur@gmail.com" , "(81)98788-8877");
		Servidor servidor = new Servidor();
		servidor.executar(cliente);
	}

}
