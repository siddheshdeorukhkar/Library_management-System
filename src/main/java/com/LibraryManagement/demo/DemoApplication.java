package com.LibraryManagement.demo;

import com.LibraryManagement.demo.entity.Author;
import com.LibraryManagement.demo.entity.Book;
import com.LibraryManagement.demo.entity.Category;
import com.LibraryManagement.demo.entity.Publisher;
import com.LibraryManagement.demo.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialCreate(BookService bookService){
		return (args)->{
			Book book1= new Book("1001","Yoga Practices","this is the first book");
			Author author1= new Author("Author1", "This is 1st author");
			Category category1= new Category("Mental Health");
			Publisher publisher1= new Publisher("First Publisher");
			book1.addAuthor(author1);
			book1.addCategory(category1);
			book1.addPublisher(publisher1);
			bookService.createBook(book1);

			Book book2= new Book("1002","Sports","this is the sports related book");
			Author author2= new Author("Author2", "This is 2nd author");
			Category category2= new Category("Physical Health");
			Publisher publisher2= new Publisher("Second publisher");
			book2.addAuthor(author2);
			book2.addCategory(category2);
			book2.addPublisher(publisher2);
			bookService.createBook(book2);
		};
	}

}
