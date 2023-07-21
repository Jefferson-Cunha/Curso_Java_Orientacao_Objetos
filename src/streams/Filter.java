package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function; 
import java.util.function.Predicate;

import Lambdas.Produto;

public class Filter {

	public static void main(String[] args) {

		Produto p1 = new Produto("Ipad", 2500.00, 0.25);
		Produto p2 = new Produto("Notebook", 3500.00, 0.25);
		Produto p3 = new Produto("Celular", 1500.00, 0.15);
		Produto p4 = new Produto("Monitor", 1355.00, 0.18);
		Produto p5 = new Produto("Gabinete", 500.00, 0.15);
		Produto p6 = new Produto("Teclado", 45.00, 0.15);

		Predicate<Produto> filtrarPreco = p -> p.getPreco() >= 1300.00;

		Predicate<Produto> filtrarDesconto = p -> p.getDesconto() >= 0.17;

		Function<Produto, String> produto = p -> p.getNome() + " " + p.getPreco();

		List<Produto> listaProdutos = Arrays.asList(p1, p2, p3, p4, p5, p6);

		listaProdutos.stream()
			.filter(filtrarPreco)
				.filter(filtrarDesconto)
					.map(produto)
						.forEach(System.out::println);

	}

}
