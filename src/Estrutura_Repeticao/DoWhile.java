package Estrutura_Repeticao;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// Do_While: Deferente do While, neste caso o código é executar uma vez antes de
		// consultar o controlado.

		String Texto;

		System.out.println("Sistema desenvolvido para treinar While_Indeterminado!\n");
		System.out.println("Para encerar o programa escreva 'Sair'.");
		
		Scanner entrada = new Scanner(System.in);
		do {
			
			System.out.printf("\nVocê diz: ");
			Texto = entrada.next();
						
		} while(!Texto.equalsIgnoreCase("sair"));

		entrada.close();
		System.out.printf("\nObrigado por jogar!! \n:)");
	}

}
