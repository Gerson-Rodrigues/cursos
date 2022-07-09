package com.projeto.cursos.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.cursos.Model.Curso;
import com.projeto.cursos.repository.CursoRepository;

@Service
public class CursosService {
    
    @Autowired
    CursoRepository cRepo;

    @Transactional
    public void Criar(Curso curso) {
        validaDt(curso);
        cRepo.save(curso);
    }

    private void validaDt(Curso curso) {
        if (curso.getInicio().isAfter(curso.getTermino())) {
            throw new RuntimeException();
        }
    }
}
