package com.api.desafio.controllers;

import com.api.desafio.models.Livro;
import com.api.desafio.repositorio.LivroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HomeController {

    @Autowired
    LivroRepositorio livroRepositorio;

    @GetMapping("/livros")
    public List<Livro> listaLivros(){
        return livroRepositorio.findAll();
    }
    @GetMapping("/buscar/{id}")
    public Optional<Livro> listaLivros(@PathVariable(value = "id") Integer id){
        return livroRepositorio.findById(id);
    }
    @PostMapping("add/livro")
    public Livro salvaLivro(@RequestBody Livro livro){
        return livroRepositorio.save(livro);
    }
    @DeleteMapping("deletar/{id}")
    public void deletaLivro(@RequestBody Livro livro){
        livroRepositorio.delete(livro);
    }
    @PutMapping("/atualizar")
    public Livro atualizarLivro(@RequestBody Livro livro){
        return livroRepositorio.save(livro);
    }
}
