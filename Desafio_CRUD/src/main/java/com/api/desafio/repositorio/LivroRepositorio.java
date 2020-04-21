package com.api.desafio.repositorio;

import com.api.desafio.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LivroRepositorio extends JpaRepository<Livro, Integer> {

    Optional<Livro> findById(Integer id);

}
