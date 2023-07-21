package TratamentoErros;

import streams.Aluno;

public class Validar {
	private Validar() {}
	
	
	public static void ValidarAluno(Aluno Aluno){
		
		if(Aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo!");
		}
		
		if(Aluno.nome == null || Aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("Nome");
		}
		
		if(Aluno.nota < 0 || Aluno.nota > 10) {
			throw new NumeroForaIntervaloExceotion("Valor fora do intervalo");
		}
		
		
	}
}
