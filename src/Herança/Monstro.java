package Herança;

public class Monstro extends Jogador {
	
	
	Monstro(int x, int y){
		super(x, y);
	}

	boolean atacar(Jogador oponente) {

		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);

		return ataque1 || ataque2;
	}

}
