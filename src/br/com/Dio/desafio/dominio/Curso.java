package br.com.Dio.desafio.dominio;

public class Curso extends Conteudo{

	private int cargaHoraria;
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso => " + "Titulo: " + super.getTitulo() +
			   " Descricao: " + super.getDescricao() +
			   " Carga Horaria: " + this.cargaHoraria;
	}
	@Override
	public double calculoXP() {
		return XP_PADRAO  * this.cargaHoraria;
	}
}
