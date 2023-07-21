package Relacionamentos;

public class ClienteTeste {
	public static void main(String[] args) {

		Cliente compra1 = new Cliente();
		
		compra1.cliente = "Matheus";
		
		compra1.adicionarProduto("Caneta", 20, 0.50);
		compra1.adicionarProduto("Lapís", 20, 0.25);
		compra1.adicionarProduto("Caderno", 2, 25.00);
		compra1.adicionarProduto("Livros", 5, 35.00);
		compra1.adicionarProduto("Mochila", 1, 55.00);
		compra1.adicionarProduto("Sapato", 1, 65.00);
		compra1.adicionarProduto("Caderno de desehho", 2, 5.00);
		
		
		
		
		compra1.getItens();
		
		System.out.println("Total Carinho: " + compra1.getValorTotal());
		
		
		
		
		
		

	}

}
