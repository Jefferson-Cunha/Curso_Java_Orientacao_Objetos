package Estrutura_Repeticao;

import java.util.Scanner;

public class SwiteSemBreak {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.printf("Informe a Cor da sua faixa: ");
		String faixa = entrada.next();

		switch (faixa.toLowerCase()) {
		default:
			System.err.println("Informe uma cor válida!!");
			break;
		case "preta":
			System.out.println("Sabe o Bassai-Dai!");
		case "marrom":
			System.out.println("Sabe o Tekki Shodan!");
		case "roxa":
			System.out.println("Sabe o Heian Godan!");
		case "verde":
			System.out.println("Sabe o Heidan Yodan!");
		case "laranja":
			System.out.println("Sabe o Heidan Sandan!");
		case "vermelha":
			System.out.println("Sabe o Heidan Nidan!");
		case "amarela":
			System.out.println("Sebe o Heidan Shodan!");
		}

		entrada.close();

	}

}
