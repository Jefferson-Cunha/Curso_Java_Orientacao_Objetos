package Estrutura_Repeticao;

import java.util.Scanner;

public class While_Determinado {
	public static void main(String[] args) {
		
		// While determinado - Sabemos quantas vezes será necessário repetir o código 
		// Controlado por variável iniciada antes do trecho que vai ser executado!!
		
		
		// Exemplo While
		
		int contador = 1;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Sistema desenvolvido para treinar While determinado!!\n");
		System.out.printf("Informe quando vezes o programa vai repetir: ");
		int QtnRepeticao = entrada.nextInt();
		
		while(contador <= QtnRepeticao) {
			System.out.println("\nRepetiu: " + contador);
			contador++;
		}
		
		System.out.println("\nFim!! \n:)");
				
		
		entrada.close();
		
		
		
		
		
		
		
	}

}
