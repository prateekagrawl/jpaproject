package com.example.jpaproject;

import com.example.jpaproject.domain.Book;
import com.example.jpaproject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaprojectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JpaprojectApplication.class, args);
	}

	@Autowired
	BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {
		Book b = new Book();
		b.setAuthor("John");
		b.setTitle("Introduction to hibernate");
		bookRepository.save(b);
	}
}
