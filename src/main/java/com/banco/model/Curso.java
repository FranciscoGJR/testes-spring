package com.banco.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;

@Entity
public class Curso implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "NOME", nullable = false)
	private String nome;

	@Column(nullable = false)
	private String area;

	@CreationTimestamp
	@Column(name = "data_de_criacao")
	private LocalDate dataDeCriacao;

	@UpdateTimestamp
	@Column(name = "data_de_atualizacao")
	private LocalDate dataDeAtualizacao;

	@Transient
	private Integer valorForaDoBanco;

	private void aposPersistirDados() {
		this.nome = this.nome + " POST";
	}

	@OneToMany(mappedBy = "curso")
	private List<Aluno> alunos = new ArrayList<>();

	public Curso(String nome, String area) {
		this.nome = nome;
		this.area = area;
	}

	public Curso() {
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", nome=" + nome + ", area=" + area + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public LocalDate getDataDeCriacao() {
		return dataDeCriacao;
	}

	public void setDataDeCriacao(LocalDate dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}

	public LocalDate getDataDeAtualizacao() {
		return dataDeAtualizacao;
	}

	public void setDataDeAtualizacao(LocalDate dataDeAtualizacao) {
		this.dataDeAtualizacao = dataDeAtualizacao;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

}
