package br.com.Dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
	
	private String nome;
	private String descricao;
	private final LocalDate dataInicio = LocalDate.now();
	private final LocalDate dataTermino = dataInicio.plusDays(45);
	private Set<Dev> devInscritos = new HashSet<Dev>();
	private Set<Conteudo> conteudos = new LinkedHashSet<Conteudo>();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Set<Dev> getDevInscritos() {
		return devInscritos;
	}
	public void setDevInscritos(Set<Dev> devInscritos) {
		this.devInscritos = devInscritos;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public LocalDate getDataTermino() {
		return dataTermino;
	}

	
	
}
