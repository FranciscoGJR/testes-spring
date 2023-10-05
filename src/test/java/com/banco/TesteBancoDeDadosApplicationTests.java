package com.banco;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.banco.model.Curso;
import com.banco.services.CursoServices;

@SpringBootTest
class TesteBancoDeDadosApplicationTests {

	@Autowired
	private CursoServices cursoServices;
	
	@Test
	void contextLoads() {
		List<Curso> cursos = cursoServices.getCurso();
		
		System.out.println(cursos);
	}

}
