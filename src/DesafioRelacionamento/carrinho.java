package DesafioRelacionamento;

import java.util.ArrayList;
import java.util.List;

public class carrinho {
	
	final List <item> itens = new ArrayList<>(); 
	
	
	void adicionarItem (Produto p, int qtde) {
		this.itens.add(new item(p, qtde));
	}
	
	
	double getValorTotal() {
		double total = 0;
		
		for(item itens: itens){
			total = itens.quantidade * itens.produto.preco;
		}
		
		return total;
	}
}
