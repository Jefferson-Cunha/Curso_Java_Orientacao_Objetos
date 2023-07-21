package DesafioRelacionamento;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	String nomeCliente;
	
	final List <carrinho> Compras = new ArrayList<>();
	
	
	Cliente(String nome){
		this.nomeCliente = nome;
	}
	
	double getValorTotal(){
		double total = 0;
		
		for(carrinho compra: Compras) {
			total += compra.getValorTotal();
		}
			
		return total;
	}
	
		

	
	
	
	
}
