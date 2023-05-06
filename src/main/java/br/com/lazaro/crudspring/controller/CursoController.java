package br.com.lazaro.crudspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lazaro.crudspring.model.Curso;
import br.com.lazaro.crudspring.repository.CursoRepository;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/api/cursos")
@AllArgsConstructor
public class CursoController {
	
	private final CursoRepository cursoRepository;

	@GetMapping
	public List<Curso> listar() {
		return this.cursoRepository.findAll();
	}

}
