package com.example.graphql;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringGraphQlAuthorsApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringGraphQlAuthorsApplication.class, args);

	}

	@Bean
	ApplicationRunner applicationRunner(AuthorRepository authorRepository, BookRepository bookRepository){
		return args -> {
			Author josh = authorRepository.save(new Author(null, "Josh Long"));
			Author mark = authorRepository.save(new Author(null, "Mark Maker"));

			bookRepository.saveAll(List.of(
					new Books("Reactive Spring", "Greater Works", new Author(null, "Stephen King")),
					new Books("How High I fly", "Greater Works", new Author(null, "Maverick"))
			));

		};

	}

}
