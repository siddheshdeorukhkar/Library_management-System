package com.LibraryManagement.demo.repository;

import com.LibraryManagement.demo.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
