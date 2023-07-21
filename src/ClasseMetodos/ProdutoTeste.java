package ClasseMetodos;

import java.util.Scanner;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		
		ClasseProduto p1 = new ClasseProduto();	
		System.out.println("Cadastro de produtos!!");
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Informe o nome do Produto: ");
		p1.nome = entrada.next();
		
		System.out.printf("Informe o Preço: ");
		
		p1.valor = entrada.nextDouble();
		
		System.out.printf("Informe o desconto: ");
		p1.desconto = entrada.nextDouble();
		
		
		System.out.println("Produto cadastrado com sucesso!!");
		System.out.println(p1.nome + " / " + p1.valor + " / " + p1.desconto);
		
		
		System.out.println("Preco com desconto: "+ p1.calcularDesconto(p1.valor, p1.desconto));
		
		
		entrada.close();
		
		
	}
	
}  
