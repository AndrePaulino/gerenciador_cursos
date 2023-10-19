package com.andrepaulino.teste;

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

	}

}
