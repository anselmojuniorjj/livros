package com.lista.lista.repository;

import com.lista.lista.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {

    /**
     * Encontra todos os livros de um mesmo autor.
     *
     * @param autor
     * @return
     */
    List<Livro> findByAutor(String autor);

    /**
     * Encontra um livro a partir do titulo.
     * Retorna uma lista pois podem existir mais
     * de um livro com o mesmo titulo.
     *
     * @param titulo
     * @return
     */
    List<Livro> findByTitulo(String titulo);

    /**
     * Encontra um livro a partir de seu isbn,
     * como isbn é único, apenas um livro pode ser encontrado.
     *
     * @param isbn
     * @return
     */
    List<Livro> findByIsbn(String isbn);
}
