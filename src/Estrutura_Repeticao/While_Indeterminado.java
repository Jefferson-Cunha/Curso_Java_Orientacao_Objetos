package Estrutura_Repeticao;

import java.util.Scanner;

public class While_Indeterminado {
	public static void main(String[] args) {

		// While_Indeterminado: Encera a repeticao somente quando uma condição for
		// verdadeira, somente quando o usuário desejar encerar que o programa finaliza.
		
		String Texto = null;
		
		System.out.println("Sistema desenvolvido para treinar While_Indeterminado!\n");
		System.out.println("Para encerar o programa escreva 'Sair'.");
		
		Scanner entrada = new Scanner(System.in);
		
		while(!"Sair".equalsIgnoreCase(Texto)) {
			System.out.printf("Você diz: ");
			Texto = entrada.next();
		}		
		
		System.out.println("\nObrigado por jogar!! \n:)");
		
		
		
		entrada.close();
		
		
		
		
		
		
		
	}

}
