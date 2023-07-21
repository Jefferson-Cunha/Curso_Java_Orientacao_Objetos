package Polimorfismo;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private Double peso;

	public String getNome() {
		return nome;
	}

	public Pessoa(String nome, String sobrenome, Double peso) {
		setNome(nome);
		setSobrenome(sobrenome);
		setPeso(peso);

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		}
	}
	
	
	public void Comer(Comida alimento) {
		this.peso += alimento.getPeso();
	}
	
	
	@Override
	public String toString() {
		
		return "Meu nome é: "+ getNome()+ " "+ getSobrenome() + "\nMeu peso atual é:" + getPeso();
	}

}
