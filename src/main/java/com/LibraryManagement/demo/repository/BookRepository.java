package com.LibraryManagement.demo.repository;

import com.LibraryManagement.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
