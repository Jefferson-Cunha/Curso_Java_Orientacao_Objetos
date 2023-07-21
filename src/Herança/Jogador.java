package Herança;

public class Jogador {

	
	int life = 100;
	int x = 10;
	int y = 11;
	
	
	
	
	Jogador(int x, int y){
		this.x = x;
		this.y = y;
	}
	

	boolean andar(Direcao direcao) {

		switch (direcao) {

		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case OESTE:
			y++;
			break;
		case SUL:
			x--;
			break;
		}

		return true;
	}
	
	
	boolean atacar(Jogador oponente) {
		
		int DeltaX = Math.abs(x - oponente.x);
		int DeltaY = Math.abs(y - oponente.y);
		
		
		if(DeltaX == 0 && DeltaY == 1) {
			oponente.life -= 10;
			return true;
		}else if(DeltaX == 1 && DeltaY == 0) {
			oponente.life -= 10;
			return true;
		}
		return false;		
	}
	

}
