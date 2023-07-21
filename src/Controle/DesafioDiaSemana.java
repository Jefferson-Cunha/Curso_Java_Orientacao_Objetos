package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		
		System.out.println("Desafio dia da semana!\n");
		
		Scanner entrada = new Scanner(System.in);

		System.out.printf("Informe o dia da semana: ");
		String dia = entrada.next();
		
		
		if(dia.equalsIgnoreCase("Domingo")) {
			System.out.printf("Dia 1");
			System.exit(0);
		}
		if(dia.equalsIgnoreCase("Segunda")){
			System.out.printf("Dia 2");
			System.exit(0);
		}
		if(dia.equalsIgnoreCase("Terça") || dia.equalsIgnoreCase("Terca")) {
			System.out.printf("Dia 3");
			System.exit(0);
		}
		if(dia.equalsIgnoreCase("Quarta") || dia.equalsIgnoreCase("quarta-feira")) {
			System.out.printf("Dia 4");
			System.exit(0);
		}
		if(dia.equalsIgnoreCase("Quinta") || dia.equalsIgnoreCase("Quinta-feira")){
			System.out.printf("Dia 5");
			System.exit(0);
		}
		if(dia.equalsIgnoreCase("Sexta") || dia.equalsIgnoreCase("Sexta-feira")) {
			System.out.printf("Dia 6");
			System.exit(0);
		}
		if(dia.equalsIgnoreCase("Sabádo") || dia.equalsIgnoreCase("Sabado")){
			System.out.printf("Dia 7");
			System.exit(0);
		}
		
		
		
		
		
		
		entrada.close();
		
		
		
		
		
		
		
		
	}

}
