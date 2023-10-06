package com.banco.curso;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;

import com.banco.model.Curso;
import com.banco.services.CursoServices;

@TestInstance(Lifecycle.PER_CLASS)
class CursoTeste {
	
	@BeforeAll
	void iniciando(){
		System.out.println("Classe de teste CursoTeste iniciada");
	}
	
	@BeforeEach
	void antesDeCadaUm() {
		System.out.println("Testando um dos métodos");
	}

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
