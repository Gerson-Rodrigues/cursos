package com.projeto.cursos.Model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity
@Table(name = "cursos")
public class Curso implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("_id")
    private Long id;

    @Column(name= "descricao", nullable = false)
    private String descricao;

    @Column(name = "alunos", nullable = false)
    private Long alunos;

    private LocalDate inicio;

    private LocalDate termino;

    @JoinColumn
    @ManyToOne
    private Categorias categoria;
}
