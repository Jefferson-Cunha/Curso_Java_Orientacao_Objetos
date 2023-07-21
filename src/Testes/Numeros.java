package Testes;

public class Numeros {

	
	private int num;
	private int direito;
	private int esquerdo;
	
	
		
	void lerVizinho(){
		System.out.println("E: " + getEsquerdo() + " D: " + getDireito() + "\n");
	}
	
	public Numeros(int num, int direito, int esquerdo){
		setNum(num);
		setDireito(direito);
		setEsquerdo(esquerdo);
	}


	public Numeros() {
		// TODO Auto-generated constructor stub
	}

	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public int getDireito() {
		return direito;
	}


	public void setDireito(int direito) {
		this.direito = direito;
	}


	public int getEsquerdo() {
		return esquerdo;
	}


	public void setEsquerdo(int esquerdo) {
		this.esquerdo = esquerdo;
	}
	
	
}
