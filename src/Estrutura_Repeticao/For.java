package Estrutura_Repeticao;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		// For - Segue a mesma lógica do While_Determinado, aonde já se sabe a quantidade
		// de vezes que o código vai repetir.
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Sistema desenvolvido para treinar For!\n");
		
		System.out.printf("Informe quando vezes o programa vai repetir: ");
		int QntRepeticao = entrada.nextInt();
		
		System.out.println("");
		
		for(int contador = 1; contador <= QntRepeticao; contador++){
			System.out.println("Repetiu: " + contador);
		}
		
		
		System.out.println("\nFim!! \n:)");
		
		
		entrada.close();
		
		
		
	}

}
