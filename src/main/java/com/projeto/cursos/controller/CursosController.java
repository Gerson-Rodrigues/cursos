package com.projeto.cursos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.cursos.Model.Curso;
import com.projeto.cursos.repository.CursoRepository;
import com.projeto.cursos.services.CursosService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/cursos")
@AllArgsConstructor
public class CursosController {

    @Autowired
    private final CursoRepository cJpaRepo;

    @Autowired
    private CursosService service;

    //@GetRequestMapping(method = RequestMethod.GET)
    @GetMapping
    public List<Curso> lista() {
        return cJpaRepo.findAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> criar(@RequestBody Curso curso) {
        try {
            service.Criar(curso);
            return ResponseEntity.status(HttpStatus.CREATED)
            .body("Cadastrado com Sucesso!!");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
            .body("Erro ao cadastrar: "+e.getMessage());
        }
    }
    
    /*@PutMapping
    @ResponseStatus(code = HttpStatus.UPDATE)
    public Curso editar(@RequestBody Curso curso) {
        return cJpaRepo.update(curso.setId(id));
    }*/
}
