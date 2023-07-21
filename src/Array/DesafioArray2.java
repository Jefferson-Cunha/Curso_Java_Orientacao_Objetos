package Array;

import java.util.Scanner;

public class DesafioArray2 {

	public static void main(String[] args) {
		// Array de duas dimenções

		int qtnAlunos;
		int qtnNotas;
		double total = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.printf("Informe a quantidade de Alunos: ");
		qtnAlunos = entrada.nextInt();

		System.out.printf("Informe a quantidade de Notas: ");
		qtnNotas = entrada.nextInt();

		Double[][] notasAlunos = new Double[qtnAlunos][qtnNotas];

		for (int a = 0; a < notasAlunos.length; a++) {
			for (int n = 0; n < notasAlunos[a].length; n++) {
				System.out.printf("Informe a %dº nota do %dº aluno: ", a + 1, n + 1);
				notasAlunos[a][n] = entrada.nextDouble();
				total += notasAlunos[a][n];
			}

		}

		System.out.println("Média dos Alunos: " + total / (qtnAlunos * qtnNotas));

		entrada.close();

	}

}
