package Relacionamentos;

import java.util.ArrayList;

public class Cliente {

	String cliente;

	ArrayList<Item> itens = new ArrayList<>();

	
	
	
// - Obtet Valor Total Carrinho	
	
	double getValorTotal() {
		double total = 0;

		for (Item item : itens) {
			total += item.quantidade * item.preco;
		}

		return total;
	}

	
// - Adicionar ao Carrinho	
	void adicionarProduto(String nomeP, int valorP, double precoP) {
		this.itens.add(new Item(nomeP, valorP, precoP));

	}
	
// - Obter Itens Carrinho

	void getItens() {
		System.out.println("Itens no carrinho! \n");

		for (Item carrinho : itens) {
			String compras = carrinho.nome;
			Double Valor = carrinho.preco;
			Integer Quant = carrinho.quantidade;
			Double total = carrinho.quantidade * carrinho.preco;

			System.out.printf("Nome: %s \nQuantidade: %d \nPreco: %.2f \nTotal item: %.2f\n\n", 
						compras, Quant, Valor,
					total);
		}
	}

}
