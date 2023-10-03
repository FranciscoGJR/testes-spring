package com.banco.services;

import java.util.List;

import com.banco.model.Curso;

public interface CursoServices {

	public List<Curso> getCurso();

	public Curso save(Curso curso);
	
}
