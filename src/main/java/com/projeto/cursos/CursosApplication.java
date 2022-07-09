package com.projeto.cursos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.projeto.cursos.Model.Curso;
import com.projeto.cursos.repository.CursoRepository;

@SpringBootApplication
public class CursosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursosApplication.class, args);
	}

	/*@Bean
	CommandLineRunner initDatabase(CursoRepository cJpaRepo) {
		return args -> {
			cJpaRepo.deleteAll();

			Curso c = new Curso();
			c.setName("Angular com Spring");
			c.setCategoria("Front-End");

			cJpaRepo.save(c);
		};
	}*/


}
