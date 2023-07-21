package DesafioHerança;

public class BaseCarro {

	String nome;
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual = 0;
	int FatorAceleracao = 8;

	protected BaseCarro(String nome,int velocidadeMax) {
		this.nome = nome;
		this.VELOCIDADE_MAXIMA = velocidadeMax;
	}

	   void acelerar() {
		if(velocidadeAtual + FatorAceleracao > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += FatorAceleracao;
		}
	}

	 void frear() {

		if (velocidadeAtual > 0) {  
			velocidadeAtual -= 6;
		}
		if (velocidadeAtual < 0) {
			velocidadeAtual = 0;
		}
	}
	 
	 
	 void Velocidade(){
			System.out.println("Velocidade atual (" + this.nome + "): " + velocidadeAtual);
		}
	 
	 

}
