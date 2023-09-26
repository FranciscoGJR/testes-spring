package com.banco.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.model.Curso;
import com.banco.repository.CursoRepository;

@Service
public class CursoServices {

	@Autowired
	CursoRepository cursoRepository;

	public Curso create(Curso curso) {
		return cursoRepository.save(curso);
	}

	public List<Curso> findAll() {
		return cursoRepository.findAll();
	}

	public Curso findById(Integer id) throws Exception {
		Optional<Curso> cursoOptional = cursoRepository.findById(id);

		if (cursoOptional.isPresent()) {
			return cursoOptional.get();
		} else {
			throw new Exception("Curso não encontrado para o ID: " + id);
		}
	}

	public List<Curso> findCursoByNome(String nome) {
		return cursoRepository.findCursoByNome(nome);
	}

	public List<Curso> findCursoByNomeContaining(String valor) {
		return cursoRepository.findCursoByNomeContaining(valor);
	}

	public List<Curso> findCursoByNomeIgnoreCase(String valor) {
		return cursoRepository.findCursoByNomeIgnoreCase(valor);
	}

	public Integer deleteById(Integer id) {
		cursoRepository.deleteById(id);
		return id;
	}
}
