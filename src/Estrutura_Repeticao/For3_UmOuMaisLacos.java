package Estrutura_Repeticao;

import java.util.Scanner;

public class For3_UmOuMaisLacos {
	public static void main(String[] args) {
		int vl1;
		int vl2;
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Sistema para treina for com um ou mais laços internos!");
		
		System.out.printf("\nPrimeiro Laço: ");
		vl1 = entrada.nextInt();
		
		System.out.printf("Segundo Laço: ");
		vl2 = entrada.nextInt();
		
		for(int i = 0; i <= vl1; i++) {
			for(int j = 0; j <= vl2; j++) {
				System.out.printf("\nLaço 1: %d / Laço 2: %d", i, j);
			}
		}
		
		
		 
		 
		entrada.close();
		
		
		
		 
	}

}
