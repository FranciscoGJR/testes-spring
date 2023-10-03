package com.banco.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.model.Curso;
import com.banco.repository.CursoRepository;
import com.banco.services.CursoServices;

@Service
public class CursoServiceImpl implements CursoServices {

	@Autowired
	CursoRepository cursoRepository;

	@Override
	public List<Curso> getCurso() {
		return cursoRepository.findAll();
	}

	@Override
	public Curso save(Curso curso) {
		return cursoRepository.save(curso);
	}

}
