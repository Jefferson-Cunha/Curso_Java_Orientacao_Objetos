package Controle;

import java.util.Scanner;

public class CalculoNotaSemestre {
	public static void main(String[] args) {
		
		
		System.out.println("Grupo Educacional Carlos Drummond de Andrade!");
		System.out.println("Sistema desenvolvido para cálculo de notas! \n");
		Scanner entrada = new Scanner(System.in);
		
		//Captura das notas //
		
		System.out.printf("Informe a nota da AC1: ");
		Double ac1 = entrada.nextDouble();
		
		System.out.printf("Informe a nota da AC2: ");
		Double ac2 = entrada.nextDouble();
		
		System.out.printf("Informe a nota da AR: ");
		Double ar = entrada.nextDouble();
		
		System.out.printf("Informe a nota do PIO: ");
		Double Pio = entrada.nextDouble();
		
		//Cálculo Média
		
		Double media = (ac1 * 0.1 ) + (ac2 * 0.2) + (ar * 0.5) + (Pio * 0.2) / 1.0;
		
		//Verificar situação
		
		if(media > 7.0) {
			System.out.println("Aprovado Direto!!");
			System.out.println("Parabens!!");
			System.out.println("Sua média: " + media);
			System.exit(0);			
		} else if (media < 3.0) {
			System.out.println("\nVocê está de Reprovado!!");
			System.out.println("Sua média: " + media);
		} else {
			System.out.println("\nVocê está de Exame!! \n");
			System.out.println("Sua média: " + media);
			
			System.out.printf("\nInforme sua nota da Exame: ");
			Double exame = entrada.nextDouble();
			
			Double mediaFinal = (media + exame ) / 2;
			
			if (mediaFinal > 5) {
				System.out.println("\nAprovado com Exame!!");
				System.out.println("Parabens!!");
				System.out.println("Sua média: " + mediaFinal);
				System.exit(0);	
			} else {
				System.out.println("\nVocê foi reprovado neste semestre!");
				System.out.println("Sua média: " + mediaFinal);
				System.exit(0);	
			}
			
			
		}
		
		
		
		
		
		
		
		

		entrada.close();
		
	
}
	}
