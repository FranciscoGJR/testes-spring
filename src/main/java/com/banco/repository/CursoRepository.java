package com.banco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.banco.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

	List<Curso> findCursoByNome(String nome);

	List<Curso> findCursoByNomeContaining(String valor);

	List<Curso> findCursoByNomeIgnoreCase(String valor);

	@Query(value = "Select nome_do_curso From curso_faculdade where area = 'Exatas'", nativeQuery = true)
	List<Curso> findByQueryPorArea();

	@Query(value = "Select nome_do_curso From curso_faculdade where area = :area", nativeQuery = true)
	List<Curso> findByQueryPorAreaInformada(@Param("area") String area);

}
