package br.com.Dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	
	LocalDate data;
	

	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Mentoria => " + "Titulo: " + super.getTitulo() +
			   " Descricao: " + super.getDescricao() +
			   " Data: " + this.data;
	}
	@Override
	public double calculoXP() {
		return XP_PADRAO + 20;
	}
	
  
}
