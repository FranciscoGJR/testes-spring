package com.banco.curso;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.banco.model.Curso;
import com.banco.services.CursoServices;

class CursoTeste {

	@Autowired
	CursoServices cursoServices;

	@Test
	void testaCursosNaoVazio() {
		Curso curso = new Curso();

		assertNotNull(curso);
	}
	
	@Test
	void novoCursoSemAlunos() {
		Curso curso = new Curso();
		
		Assertions.assertTrue(curso.getAlunos().isEmpty());
	}
}
