package Desafio_Pessoal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Aluno {

	private String nome;
	
	protected Aluno() {
		
	}

	protected final List<Curso> cursos = new ArrayList<>();

	public Aluno(String nome) {
		setNome(nome);
		
	}

	public void adicionarCurso(Curso Curso) {
		this.cursos.add(Curso);
		Curso.alunosMatriculados.add(this);

	}

	
	public void getListaCursos(){
		System.out.println("\nAluno " + this.getNome() + " está matriculado nos cursos abaixo!\n");
		Consumer<String> print = System.out::println;
		Function<Curso, String>	lerNome = al -> "" + al.getNome();		
		cursos.stream().map(lerNome).forEach(print);
		
		
	}

	// ----------------------- Gets e Sets

	

	private void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	
}
