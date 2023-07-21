package Array;

public class Aula1 {
	public static void main(String[] args) {
			
		
		Double[] notasAlunos = new Double[3];
		
		notasAlunos[0] = 9.5;
		notasAlunos[1] = 8.7;
		notasAlunos[2] = 9.8;
		
		
		double total = 0;
		
		for(int i = 0; i < notasAlunos.length; i++) {
			total += notasAlunos[i];
		}
			
		System.out.println(total / notasAlunos.length);
		
	}

}
