package Array;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		// Calcular a média com array
		Scanner entrada = new Scanner(System.in);
		double total = 0;

		System.out.println("Calcular média de alunos!!\n");
		System.out.printf("Informe a quantidade de notas: ");
		int qtnNotas = entrada.nextInt();

		Double[] notasAlunos = new Double[qtnNotas];

		for (int i = 0; i < notasAlunos.length; i++) {
			System.out.printf("Informe a " + (i + 1) + "º nota: ");
			Double ntDigitada = entrada.nextDouble();
			notasAlunos[i] = ntDigitada;
		}

		for (int i = 0; i < notasAlunos.length; i++) {
			total += notasAlunos[i];
		}
			
		System.out.println("\nMédia dos alunos: " + total / notasAlunos.length);
		
		
		entrada.close();

	}

}
