package com.alura.literalura;

import com.alura.literalura.principal.*;
import com.alura.literalura.repository.*;
//import com.alura.literalura.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {
	@Autowired
	private BooksRepository booksRepository;
	private AutorRepository autorRepository;

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(booksRepository);
		principal.muestraMenu();
	}


	public static void main(String[] args) {
		SpringApplication.run(com.alura.literalura.LiteraluraApplication.class, args);
	}


}
