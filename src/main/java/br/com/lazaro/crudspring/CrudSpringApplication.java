package br.com.lazaro.crudspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.lazaro.crudspring.model.Curso;
import br.com.lazaro.crudspring.repository.CursoRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	public CommandLineRunner inserirCursosNoBancoDeDados(CursoRepository cursoRepository) {

		return args -> {

			cursoRepository.deleteAll();

			var c1 = new Curso();
			c1.setNome("Curso de Angular");
			c1.setCategoria("front-end");

			cursoRepository.save(c1);
			
		};
	}

}
