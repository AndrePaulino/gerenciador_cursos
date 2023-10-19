package com.andrepaulino.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.andrepaulino.gerenciador_cursos.Aula;
import com.andrepaulino.gerenciador_cursos.Curso;

public class TesteCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java",
				"Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

		System.out.println(javaColecoes.getAulas());

		System.out.println("-".repeat(20));

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);

		List<Aula> aulas = new ArrayList<>(aulasImutaveis);

		Collections.sort(aulas);
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());

		System.out.println(javaColecoes);
	}

}
