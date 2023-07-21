package ClasseMetodos;

public class ClasseProduto {

	String nome;
	Double valor;
	Double desconto;

	 
	
	
	
	
	
	
	
	
	
	
	
	double calcularDesconto(double preco, double desconto) {
		double precoFinal = preco * (1 - desconto);

		return precoFinal;
	}

	
	
	
	
	
}
