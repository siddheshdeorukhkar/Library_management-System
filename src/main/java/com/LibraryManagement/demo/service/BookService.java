package com.LibraryManagement.demo.service;

import com.LibraryManagement.demo.entity.Book;
import com.LibraryManagement.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAllBooks(){
        return bookRepository.findAll();
    }

    public Book findBookById(Long id){
        Book book= bookRepository.findById(id).orElseThrow(()-> new RuntimeException("Book Not Found!!"));
        return book;
    }

    public void createBook(Book book){
        bookRepository.save(book);
    }

    public void deleteBookById(Long id){
        Book book= bookRepository.findById(id).orElseThrow(()-> new RuntimeException("Book Not found to delete!!"));
        bookRepository.deleteById(book.getId());
    }

    public Book updateBookById(Long id, Book newBook){
        Book book = bookRepository.findById(id).orElseThrow(()->new RuntimeException("Book Not Found By Id!!"));
        book.setName(newBook.getName());
        book.setIsbn(newBook.getIsbn());
        book.setDescription(newBook.getDescription());
        return book;
    }

    public void updateBook(Book book){
        bookRepository.save(book);
    }
}
