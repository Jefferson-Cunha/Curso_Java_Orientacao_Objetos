package DesafioModulo;

public class Pessoa {

	String nome;
	Double peso;
		
	
	Pessoa(String nome, Double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	
	Double Comer(Double pesoPessoa, Double pesoComida){
		
		Double soma = pesoPessoa += pesoComida;
		this.peso = soma;
		return soma;
		
		
	}
	
	
}
