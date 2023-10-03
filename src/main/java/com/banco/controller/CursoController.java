package com.banco.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.model.Curso;
import com.banco.model.dto.CursoDTO;
import com.banco.model.mapper.CursoMapper;
import com.banco.services.CursoServices;

@RestController
@RequestMapping("/curso")
public class CursoController {

	@Autowired
	private CursoServices cursoServices;
	
	@Autowired
	private CursoMapper cursoMapper;

	@GetMapping
	public ResponseEntity<List<Curso>> getCursos() {
		List<Curso> lista = cursoServices.getCurso();

		return ResponseEntity.ok().body(lista);
	}
	
	@PostMapping("/salva")
	public ResponseEntity<Curso> save(@RequestBody CursoDTO cursoDTO) throws URISyntaxException{
		
		Curso novoCurso = cursoServices.save(cursoMapper.mapCursoDTOToCurso(cursoDTO));
		
		return ResponseEntity.created(new URI("curso/salva/" + novoCurso.getId())).body(novoCurso);
	}

}
