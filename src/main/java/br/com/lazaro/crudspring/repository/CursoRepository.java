package br.com.lazaro.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lazaro.crudspring.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
	
}
