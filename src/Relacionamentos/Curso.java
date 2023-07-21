package Relacionamentos;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	String nome;

	final List<Aluno1> alunosMatriculados = new ArrayList<>();

	void criarCurso(String nome) {
		this.nome = nome;
	}

	void adicionarAluno(Aluno1 aluno) {
		this.alunosMatriculados.add(aluno);
		aluno.cursos.add(this);
	}

	void listaDoCurso() {
		System.out.println("Matriculados no Curso " + this.nome + "\n");
		int i = 1;
		for (Aluno1 alunos : alunosMatriculados) {
			String lista = alunos.nome;
			System.out.println(i + ": " + lista);
			i++;
		}
	}

}
