package br.com.Dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private String nome;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<Conteudo>();
	private Set<Conteudo> conteudosFinalizados = new LinkedHashSet<Conteudo>();

	public void inscreverBootcamp(Bootcamp boot) {
		this.conteudosInscritos.addAll(boot.getConteudos());
		boot.getDevInscritos().add(this);
	}

	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosFinalizados.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		}else {
			System.err.println("Você não está matriculado em nenhum conteudo.");
		}
	}
	
	public double calcularTotalXP() {
		return conteudosFinalizados
				.stream()
				.mapToDouble(conteudo -> conteudo.calculoXP()).sum();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getConteudosFinalizados() {
		return conteudosFinalizados;
	}

	public void setConteudosFinalizados(Set<Conteudo> conteudosFinalizados) {
		this.conteudosFinalizados = conteudosFinalizados;
	}

	
}
