package com.projeto.cursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.cursos.Model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{
    
}
