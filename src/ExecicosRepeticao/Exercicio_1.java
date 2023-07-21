package ExecicosRepeticao;

import java.util.Scanner;
public class Exercicio_1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um número entre 1 e 10!!");
		System.out.print("Informe o número: ");
		int valor = entrada.nextInt();
		
		
		if(valor >= 1 && valor <= 10) {
			int modulo = valor %2;
			
			if(modulo == 0) {
				System.out.println("O valor " + valor + " é Par!" );
			} else {
				System.out.println("O valor " + valor + " é Impar!" );
			}
			
		} else {
			System.err.println("Informe um valor válido!!");
		}
		
		
		entrada.close();
	}

}
