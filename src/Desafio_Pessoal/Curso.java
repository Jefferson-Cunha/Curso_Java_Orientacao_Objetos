package Desafio_Pessoal;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	protected final List<Aluno> alunosMatriculados = new ArrayList<>();

	private String nome;
		

	public Curso(String nome) {
		setNome(nome);
	};

	public void adicionarAluno(Aluno aluno) {
		this.alunosMatriculados.add(aluno);
		aluno.cursos.add(this);

	}

	public void getListaAlunos() {
		int i = 1;
		System.out.println("\nLista de alunos do curso " + getNome());
		for (Aluno al : alunosMatriculados) {
			String nome = al.getNome();
			System.out.println(i + ") " + nome);
			i++;

		}

	}
	
	
					//------ Get e Set

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
