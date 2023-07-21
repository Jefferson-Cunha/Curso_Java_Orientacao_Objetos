package Lambdas;

import java.util.function.Predicate;

public class Produto {

	final String nome;
	final double preco;
	final Double desconto;

	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;

	}
	// Verificar se cliente está elegível para receber desconto de 10%!!

	public void isDesconto(Produto produto) {

		Predicate<Produto> isDesconto = prod -> prod.preco >= 2050.00;

		if (!isDesconto.test(produto)) {
			double desconto = (produto.preco * (1 - produto.desconto));
			System.out.println("Produto com desconto: " + desconto);
		} else {
			System.out.println("Protudo sem desconto: " + produto.preco);
		}

	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public Double getDesconto() {
		return desconto;
	}
	
	
	

}
