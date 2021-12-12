package com.example.Desafiosdio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DesafiosDioApplication {

	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setTitulo("Curso Java");
		curso.setDescricao("Descricao java");
		curso.setCargaMentoria(0);

		Curso curso1 = new Curso();
		curso1.setTitulo("Curso lavarel");
		curso1.setDescricao("Descricao Lavarel");
		curso1.setCargaMentoria(8);

		Mentoria mentoria = new Mentoria();
		mentoria.setNome("Mentoria em java");
		mentoria.setDescricao("Descricao em java");
		mentoria.setData(LocalDate.now()); // cria data de criacao instataneo

		System.out.println(curso);
		System.out.println(curso1);
		System.out.println(mentoria);
	}




}
