package DesafioHerança;

public class Civic extends BaseCarro{
	
	
	public Civic (String nome, int VelocidadeMaxima){
		super(nome, VelocidadeMaxima);
	}
	
	
	public void getAcelerar() {
		super.acelerar();
	}
	
	
	public void getFrear() {
		super.frear();
	}
	
	
	public void getVelocidade(){
		super.Velocidade();
	}

}