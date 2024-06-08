package com.alura.book_spring_alura;

import com.alura.book_spring_alura.principal.Principal;
import com.alura.book_spring_alura.repository.AuthorRepository;
import com.alura.book_spring_alura.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookSpringAluraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BookSpringAluraApplication.class, args);
	}

	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private AuthorRepository authorRepository;

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(bookRepository, authorRepository);
		principal.showMenu();
	}

}
