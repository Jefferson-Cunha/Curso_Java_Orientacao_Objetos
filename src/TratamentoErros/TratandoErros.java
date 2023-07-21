package TratamentoErros;

import streams.Aluno;

public class TratandoErros {
	public static void main(String[] args) {
		Aluno Aluno = new Aluno("Matheus", 10);
		
		
		try {
			Validar.ValidarAluno(Aluno);
		} catch (NumeroForaIntervaloExceotion |
				StringVaziaException e) {  
			System.out.println(e.getMessage());
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} 
		
		
		// Tbm tem o bloco finally, que será executado 
		// independente do resutado do Try/catch!
		
		

		System.out.println("Fim :)");

	}

}
