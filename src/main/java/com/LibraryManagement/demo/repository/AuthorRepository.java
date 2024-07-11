package com.LibraryManagement.demo.repository;

import com.LibraryManagement.demo.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
