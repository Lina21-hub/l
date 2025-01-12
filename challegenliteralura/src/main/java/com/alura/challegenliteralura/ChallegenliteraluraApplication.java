package com.alura.challegenliteralura;

import com.alura.challegenliteralura.principal.Principal;
import com.alura.challegenliteralura.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallegenliteraluraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ChallegenliteraluraApplication.class, args);
	}

	@Autowired
	private MenuService menuService;

	@Override
	public void run (String... args) throws Exception {
		Principal principal = new Principal(menuService);
		principal.EjecutarAplicacion();
	}

}
