package Testes;

import Desafio_Pessoal.Aluno;
import Desafio_Pessoal.Curso;

public class SistemaEscola {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Vinicius");
		Aluno a2 = new Aluno("Jefferson");
		Aluno a3 = new Aluno("Ana");
		Aluno a4 = new Aluno("Maria");
		
		Curso c1 = new Curso("Musica");
		Curso c2 = new Curso("Informática");
		Curso c3 = new Curso("Ciência");
		Curso c4 = new Curso("História");
		
		c1.adicionarAluno(a1);
		c1.adicionarAluno(a2);
		c1.adicionarAluno(a3);
		
		
		c2.adicionarAluno(a1);
		c2.adicionarAluno(a4);
		
		c3.adicionarAluno(a3);
		c3.adicionarAluno(a3);
		
		c4.adicionarAluno(a1);
		
//		
//		c1.lerListaAlunos();
//		c2.lerListaAlunos();
//		c3.lerListaAlunos();
//		c4.lerListaAlunos();
//		
//		a1.adicionarCurso(c2);
//		
		c2.getListaAlunos();
		
		a1.getListaCursos();

		
		
		
	}
}
