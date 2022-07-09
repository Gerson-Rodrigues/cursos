package com.projeto.cursos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.cursos.Model.Curso;
import com.projeto.cursos.repository.CursoRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/cursos")
@AllArgsConstructor
public class CursosController {

    
    private final CursoRepository cJpaRepo;


    //@GetRequestMapping(method = RequestMethod.GET)
    @GetMapping
    public List<Curso> lista() {
        return cJpaRepo.findAll();
    }

    
}
