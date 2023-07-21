package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class CalcTeste {
	public static void main(String[] args) {
//
//		Calculo calculo = (x, y) -> x + y;
//
//		System.out.println(calculo.executarMult(2, 3));
//
//		System.out.println(calculo.executarSoma(2, 3));
//
//		BinaryOperator<Double> Calc1 = (x, y) -> x + y;
//
//		System.out.println(Calc1.apply(5.0, 6.0));
//
//		List<String> alunosAprovados = Arrays.asList("Bia", "Ana", "Maria", "Luís");
//
//		alunosAprovados.forEach(nome -> System.out.println("Meu nome é: " + nome + "\n"));
//
//		alunosAprovados.forEach(System.out::println);
//
//		alunosAprovados.forEach(nome -> meuImprimir(nome));

		Produto prod1 = new Produto("Notebook", 3500.00, 0.15);
		Produto prod2 = new Produto("Mouse", 45.00, 0.15);
		Produto prod3 = new Produto("Teclado", 59.90, 0.15);
		Produto prod4 = new Produto("Monitor", 1500.00, 0.15);
		Produto prod5 = new Produto("Touchpade", 25.50, 0.15);
		Produto prod6 = new Produto("Processador", 250.00, 0.15);

		prod1.isDesconto(prod6);

		List<Produto> listaProduto = Arrays.asList(prod1, prod2, prod3, prod4, prod5, prod6);

		// Consumer
		Consumer<Produto> lerLista = p -> System.out.println("Nome: " + p.nome + " Preco R$: " + p.preco);
		listaProduto.forEach(lerLista);

		// Função
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "ímpar";
		Function<String, String> oResultadoE = valor -> "O resultado é " + valor;

		System.out.println(parOuImpar.andThen(oResultadoE).apply(11));

		// BinaryOperator<T>

		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;

		System.out.println(media.apply(9.5, 7.2));

		// BiFunction<T, U, R>

		BiFunction<Double, Double, String> mediaGeral = (n1, n2) -> {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
		
		System.out.println(mediaGeral.apply(6.5, 5.5));

	}

	static void meuImprimir(String nome) {
		System.out.println("Oi meu nome é " + nome);
	}

}
