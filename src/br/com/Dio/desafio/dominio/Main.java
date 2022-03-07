package br.com.Dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Curso cursoJava = new Curso();
		cursoJava.setTitulo("Java");
		cursoJava.setDescricao("Descrição curso java");
		cursoJava.setCargaHoraria(80);
		
		Curso cursoJs = new Curso();
		cursoJs.setTitulo("JavaScript");
		cursoJs.setDescricao("Descrição curso JavaScript");
		cursoJs.setCargaHoraria(60);
		
		//System.out.println(cursoJava);
		System.out.println("-----------");
		//System.out.println(cursoJs);
		System.out.println("-----------");
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria para devs");
		mentoria.setDescricao("Mentoria Java");
		mentoria.setData(LocalDate.now());
		//System.out.println(mentoria);
		cursoJava.calculoXP();
		//System.out.println(cursoJava.calculoXP() );
		System.out.println("-----------");
		
		System.out.println("Criando o bootcamp");
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Bootcamp para Jrs.");
		bootcamp.getConteudos().add(cursoJs);
		bootcamp.getConteudos().add(cursoJava);
		bootcamp.getConteudos().add(mentoria);
		
		System.out.println("Criando o Dev");
		Dev devEdivan = new Dev();
		devEdivan.setNome("Edivan");
		devEdivan.inscreverBootcamp(bootcamp);
		System.out.println(devEdivan.getNome() + " Conteudos inscritos: " + devEdivan.getConteudosInscritos());
		devEdivan.progredir();
		devEdivan.progredir();
		devEdivan.progredir();
		System.out.println("Conteudos concluidos: " + devEdivan.getConteudosFinalizados());
		System.out.println("Conteudos inscritos: " + devEdivan.getConteudosInscritos());
		System.out.println("XP: " + devEdivan.calcularTotalXP());
		System.out.println("--");
		
		Dev devMarcos = new Dev();
		devMarcos.setNome("Marcos");
		devMarcos.inscreverBootcamp(bootcamp);
		System.out.println(devMarcos.getNome() + " Conteudos inscritos: " + devMarcos.getConteudosInscritos());
		devMarcos.progredir();
		System.out.println("Conteudos concluidos: " + devMarcos.getConteudosFinalizados());
		System.out.println("Conteudos inscritos: " + devMarcos.getConteudosInscritos());
		System.out.println("XP: " + devMarcos.calcularTotalXP());
		
		
		
		
	
	}

}
