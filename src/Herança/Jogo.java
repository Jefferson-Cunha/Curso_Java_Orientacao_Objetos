package Herança;

public class Jogo {
	public static void main(String[] args) {

		Jogador j1 = new Jogador(10, 11);
		Heroi h1 = new Heroi(10, 15);
		Monstro m1 = new Monstro(10,11);

		m1.atacar(j1);

		System.out.println("Vida do jogador: " + j1.life);
		System.out.println("Vida do Monstro: " + m1.life);
		System.out.println("Vida do Herói: " + h1.life);

	}
}
