package com.banco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.model.Curso;
import com.banco.services.CursoServices;

@RestController
@RequestMapping("/curso")
public class CursoController {

	@Autowired
	private CursoServices cursoServices;
	
	@GetMapping
	public ResponseEntity<List<Curso>> getCursos(){
	
		List<Curso> lista = cursoServices.getCurso();
		
		return ResponseEntity.ok().body(lista);
	}

}
