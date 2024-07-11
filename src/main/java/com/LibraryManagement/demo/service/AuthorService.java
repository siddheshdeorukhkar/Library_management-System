package com.LibraryManagement.demo.service;

import com.LibraryManagement.demo.entity.Author;
import com.LibraryManagement.demo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> findAllAuthors(){
        List<Author> listOfAuthors = authorRepository.findAll();
        return listOfAuthors;
    }

    public Author findAuthorById(Long id){
        Author author= authorRepository.findById(id).orElseThrow(()->new RuntimeException("Author Not Found!!"));
        return author;
    }

    public void createAuthor(Author author){
        authorRepository.save(author);
    }

    public void deleteAuthorById(Long id){
        Author author= authorRepository.findById(id).orElseThrow(()->new RuntimeException("Author NOt Found To Delete"));
        authorRepository.deleteById(author.getId());
    }

    public Author updateAuthorById(Long id, Author newAuthor){
        Author author= authorRepository.findById(id).orElseThrow(()->new RuntimeException("Author with this id is not found"));
        author.setName(newAuthor.getName());
        author.setDescription(newAuthor.getDescription());
        return author;
    }

    public void updateAuthor(Author author){
        authorRepository.save(author);
    }
}
