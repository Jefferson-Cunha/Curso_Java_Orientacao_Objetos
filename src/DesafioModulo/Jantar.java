package DesafioModulo;

public class Jantar {
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("João", 68.5);

		Comida c1 = new Comida("Feijão", 0.850);

		p1.Comer(p1.peso, c1.peso);

		System.out.println(p1.nome + " comeu " + c1.nome + " e agora está com: " + p1.peso + "Kg!");

		p1.Comer(p1.peso, c1.peso);

		System.out.println(p1.nome + " comeu " + c1.nome + " e agora está com: " + p1.peso  + "Kg!");

		
	
	}

}
