package com.banco.model.mapper;

import org.springframework.stereotype.Service;

import com.banco.model.Curso;
import com.banco.model.dto.CursoDTO;

@Service
public class CursoMapper {

	public Curso mapCursoDTOToCurso(CursoDTO cursoDTO) {
		Curso curso = new Curso(cursoDTO.getNome(), cursoDTO.getArea());

		return curso;
	}
}
