package DesafioHerança;

public class Ferrari extends BaseCarro {

	public Ferrari(String nome, int VelocidadeMaxima) {
		super(nome, VelocidadeMaxima);
		FatorAceleracao = 32;
		
	}	
	
	public void getAcelerar() {
		super.acelerar();
	}

	@Override
	public  void frear() {
		if(velocidadeAtual > 0) {
			velocidadeAtual -= 24;
		}	else {
			velocidadeAtual = 0;
		}
	}
	
	public void getVelocidade(){
		super.Velocidade();
	}

}
