package Testes;

import Polimorfismo.Arroz;
import Polimorfismo.Comida;
import Polimorfismo.Pessoa;

public class PessoaTeste { 
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Vinicius", "Gloria", 85.9);
		Comida c1 = new Arroz(1.2);

		p1.Comer(c1);

		System.out.println(p1);

		p1.Comer(c1);

		System.out.println(p1);
	}
	
		
	
}
