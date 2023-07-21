package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio {

	public static void main(String[] args) {
		
		

		Produto p1 = new Produto("Ipad", 2500.00, 0.15);
		Produto p2 = new Produto("Notebook", 3500.00, 0.15);
		Produto p3 = new Produto("Celular", 1500.00, 0.15);
		Produto p4 = new Produto("Monitor", 1355.00, 0.15);
		Produto p5 = new Produto("Gabinete", 500.00, 0.15);
		Produto p6 = new Produto("Teclado", 45.00, 0.15);

		List<Produto> listaProduto = Arrays.asList(p1, p2, p3, p4, p5, p6);

		System.out.println("Lista de produtos! \n");

		Consumer<Produto> lerLista = p -> {			
			
			double precoFinal = p.preco * (1 - p.desconto);
			double valorImposto = Math.round((8.0/ 100) * precoFinal);

			Predicate<Produto> verificarImposto = vI -> precoFinal >= 2200.00;
			Predicate<Produto> verificarFrete = vF -> precoFinal <= 2500.00;

			Function<Boolean, String> isFrete = f -> f == true
					? "Volor do frete: R$75,00 \nValor total do " + p.nome + ": R$" + (precoFinal + valorImposto + 75) + "\n"
					: "Volor do frete: R$35,00 \nValor total do " + p.nome + ": R$" + (precoFinal + valorImposto + 35) + "\n";

			Function<Boolean, String> isImpostoMunicipal = i -> i == true ? "Valor do Imposto Municípal: R$" + valorImposto
					: "Não paga Imposto Municípal";
			Boolean i = verificarImposto.test(p);
			Boolean f = verificarFrete.test(p);

			System.out.printf("Preço de mercado do %s: R$%.2f." + "\nPreço com desconto: R$%.2f.\n", p.nome,p.preco, precoFinal);
			System.out.println(isImpostoMunicipal.apply(i));
			System.out.println(isFrete.apply(f));
						
		};

		listaProduto.forEach(lerLista);
		

	}
}
