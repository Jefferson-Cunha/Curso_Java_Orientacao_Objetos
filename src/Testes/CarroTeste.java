package Testes;

import DesafioHerança.Civic;
import DesafioHerança.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {
 
		Civic c1 = new Civic("Civic", 220);
		Ferrari f1 = new Ferrari("Ferrari", 325);

		c1.getAcelerar();
		c1.getAcelerar();

		f1.getAcelerar();
		f1.getAcelerar();
		f1.getAcelerar();

		c1.getVelocidade();
		f1.getVelocidade();

		System.out.println("---------------------");

		f1.frear();
		f1.frear();
		f1.frear();
		f1.frear();
		f1.frear();

		c1.getFrear();
		c1.getFrear();
		c1.getFrear();
		c1.getFrear();
		c1.getFrear();

		c1.getVelocidade();
		f1.getVelocidade();

	}
}
