package Relacionamentos;

public class AlunoTeste {
	public static void main(String[] args) {
		
		
		Aluno1 aluno1 = new Aluno1();
		Aluno1 aluno2 = new Aluno1();
		Aluno1 aluno3 = new Aluno1();
		Aluno1 aluno4 = new Aluno1();
		Aluno1 aluno5 = new Aluno1();
		
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		Curso curso3 = new Curso();
		
		
		aluno1.matricularAluno("Matheus");
		aluno2.matricularAluno("Ricardo");
		aluno3.matricularAluno("Felipe");
		aluno4.matricularAluno("Nicolle");
		aluno5.matricularAluno("Fernanda");
				
		
		curso1.criarCurso("JavaScript");
		curso2.criarCurso("DataBase");
		curso3.criarCurso("React Native");
		
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno3);
		curso1.adicionarAluno(aluno5);
		curso1.adicionarAluno(aluno4);
		
		curso1.listaDoCurso();
		
		
	}

}
