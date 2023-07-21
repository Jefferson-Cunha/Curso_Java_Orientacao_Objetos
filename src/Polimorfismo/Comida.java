package Polimorfismo;

public abstract class Comida {

	private double peso;
	
	
	protected Comida(double peso){
		this.peso = peso;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		} else {
			this.peso = 0;
		}
	}
			
	
}
