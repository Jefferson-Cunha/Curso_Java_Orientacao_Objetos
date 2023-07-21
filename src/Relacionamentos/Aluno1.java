package Relacionamentos;

import java.util.ArrayList;
import java.util.List;

public class Aluno1 {
	
  	String nome;
	
	final List<Curso> cursos = new ArrayList <>();	 
	
	void matricularAluno(String nome) {
		this.nome = nome;
	} 
	
	
	void adicionarCurso(Curso curso){
		this.cursos.add(curso);
		curso.alunosMatriculados.add(this);		
	}

	
	void listaCursos() {
		System.out.println("O aluno " + this.nome + " está matriculado nos Cursos: \n");
		
		int i = 1;
		
		for(Curso curso: cursos){
			String lista = curso.nome;
			System.out.println(i + ": " + lista);
			i++;
		}
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	

}