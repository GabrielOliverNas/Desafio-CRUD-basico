package com.api.desafio.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Livro {

    @Id
    private Integer id;

    private String nome;
    private Float preco;
    private Integer codigo;
    private Integer idCategoria;
    private Integer Paginas;

}
