package com.LibraryManagement.demo.repository;

import com.LibraryManagement.demo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
