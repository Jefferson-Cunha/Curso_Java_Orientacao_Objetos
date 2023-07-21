package Testes;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Roleta extends Numeros {

	public Roleta(int num, int direito, int esquerdo) {
		super(num, direito, esquerdo);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Numeros sorteado = new Numeros();

		Numeros num = new Numeros(0, 32, 26);
		Numeros num1 = new Numeros(1, 20, 33);
		Numeros num2 = new Numeros(2, 25, 21);
		Numeros num3 = new Numeros(3, 26, 35);
		Numeros num4 = new Numeros(4, 21, 19);
		Numeros num5 = new Numeros(5, 24, 10);
		Numeros num6 = new Numeros(6, 27, 34);
		Numeros num7 = new Numeros(7, 28, 29);
		Numeros num8 = new Numeros(8, 23, 30);
		Numeros num9 = new Numeros(9, 22, 31);
		Numeros num10 = new Numeros(10, 5, 23);
		Numeros num11 = new Numeros(11, 30, 36);
		Numeros num12 = new Numeros(12, 35, 28);
		Numeros num13 = new Numeros(13, 36, 27);
		Numeros num14 = new Numeros(14, 31, 20);
		Numeros num15 = new Numeros(15, 19, 32);
		Numeros num16 = new Numeros(16, 33, 24);
		Numeros num17 = new Numeros(17, 34, 25);
		Numeros num18 = new Numeros(18, 29, 22);
		Numeros num19 = new Numeros(19, 4, 15);
		Numeros num20 = new Numeros(20, 14, 1);
		Numeros num21 = new Numeros(21, 2, 4);
		Numeros num22 = new Numeros(22, 18, 9);
		Numeros num23 = new Numeros(23, 10, 8);
		Numeros num24 = new Numeros(24, 16, 5);
		Numeros num25 = new Numeros(25, 17, 2);
		Numeros num26 = new Numeros(26, 0, 3);
		Numeros num27 = new Numeros(27, 13, 6);
		Numeros num28 = new Numeros(28, 12, 7);
		Numeros num29 = new Numeros(29, 7, 18);
		Numeros num30 = new Numeros(30, 8, 11);
		Numeros num31 = new Numeros(31, 9, 14);
		Numeros num32 = new Numeros(32, 15, 0);
		Numeros num33 = new Numeros(33, 1, 16);
		Numeros num34 = new Numeros(34, 6, 17);
		Numeros num35 = new Numeros(35, 3, 12);
		Numeros num36 = new Numeros(36, 11, 13);

		List<Numeros> numerosRoleta = Arrays.asList(num, num1, num2, num3, num4, num5, num6, num7, num8, num9, num10,
				num11, num12, num13, num14, num15, num16, num17, num18, num19, num20, num21, num22, num23, num24, num25,
				num26, num27, num28, num29, num30, num31, num32, num33, num34, num35, num36);

		Scanner entrada = new Scanner(System.in);

		boolean sair = false;

		while (sair = true) {
			int n;
			System.out.print("");
			n = entrada.nextInt();
			sorteado = numerosRoleta.get(n);
			sorteado.lerVizinho();
		}

		System.out.println(sair);

		entrada.close();
	}
}
