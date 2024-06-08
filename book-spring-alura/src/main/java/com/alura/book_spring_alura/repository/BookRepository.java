package com.alura.book_spring_alura.repository;

import com.alura.book_spring_alura.models.Book;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    //recuperar los autores junto con los libros en una sola consulta
    @EntityGraph(attributePaths = "authors")
    //todos los libros pero con el entityGraph para que me traiga los autores
    @Query("SELECT b FROM Book b")
    List<Book> findAllWithAuthors();

    Book findByTitleIgnoreCase(String title);

    List<Book> findByLanguagesContains(String language);
}

