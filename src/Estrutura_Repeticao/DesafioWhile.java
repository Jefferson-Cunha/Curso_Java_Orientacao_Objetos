package Estrutura_Repeticao;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		// Desafio: Receber notas entre 0 e 10, somando e cálculando a média.
		// Obs: Caso receber notas acima de 10, apresenta mensagem de erro.

		Scanner entrada = new Scanner(System.in);

		Double totalNotal = 0.0;
		Double controlador = 0.0;
		int repetidor = 0;
		Double mediaClasse;

		System.out.println("Sistema para cálcular a média da classe!\n");

		while (controlador != -1) {

			totalNotal += controlador;

			if (controlador >= 0 && controlador <= 10) {
				System.out.printf("Informe a " + (repetidor + 1) + "° nota: ");
				controlador = entrada.nextDouble();
				repetidor++;

			} else {
				System.err.println("\nInforme uma nota válida!!\n");
				controlador = 0.0;
				repetidor--;
			}

		}

		mediaClasse = totalNotal / (repetidor - 1);
		
		if(mediaClasse > 10) {
			mediaClasse = 10.0;
			System.out.println("\nParábens!! A classe foi aprovada na média geral!!");
			System.out.println("Média da classe: " + mediaClasse);
			
		} else if (mediaClasse >= 7) {
			System.out.println("\nParábens!! A classe foi aprovada na média geral!!");
			System.out.println("Média da classe: " + mediaClasse);
		} else if (mediaClasse <= 6.9) {
			System.out.println("\nA classe não foi aprovada na média geral!!");
			System.out.println("Média da classe: " + mediaClasse);
		}

		entrada.close();

	}

}
