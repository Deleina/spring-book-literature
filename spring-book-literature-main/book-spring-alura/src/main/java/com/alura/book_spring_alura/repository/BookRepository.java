package com.alura.book_spring_alura.repository;

import com.alura.book_spring_alura.models.Book;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    @EntityGraph(attributePaths = "authors")
    @Query("SELECT b FROM Book b")
    List<Book> findAllWithAuthors();

    Book findByTitleIgnoreCase(String title);

    List<Book> findByLanguagesContains(String language);
}

