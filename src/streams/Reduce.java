package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import Lambdas.Produto;

public class Reduce {

	public static void main(String[] args) {

		Produto p1 = new Produto("Ipad", 2500.00, 0.25);
		Produto p2 = new Produto("Notebook", 3500.00, 0.25);
		Produto p3 = new Produto("Celular", 1500.00, 0.15);
		Produto p4 = new Produto("Monitor", 1355.00, 0.18);
		Produto p5 = new Produto("Gabinete", 500.00, 0.15);
		Produto p6 = new Produto("Teclado", 45.00, 0.15);
		Produto p7 = new Produto("Celular", 3500.00, 0.16);

		List<Produto> listaProdutos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

		// Reduce #01

		Function<Produto, Double> obterPreco = tc -> tc.getPreco();
		BinaryOperator<Double> totalCarrinho = (p, n) -> p + n;
		Double total = listaProdutos.stream().map(obterPreco).reduce(totalCarrinho).get();

		System.out.println(total);

		// ----------------------------------------------------

		// Reduce #02

		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Julia", 6.1);
		Aluno a3 = new Aluno("Maria", 5.6);
		Aluno a4 = new Aluno("Eduarda", 10);
		Aluno a5 = new Aluno("Jaqueline", 6.8);
		Aluno a6 = new Aluno("Juliana", 9.3);

		List<Aluno> listaAlunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovados = a -> a.nota >= 7;
		
		
		Function<Aluno, Double> apenasNota = n -> n.nota;
		
		BinaryOperator<Double> somatoria = (n, t) -> n + t;
		
		
		Double totalNotas = listaAlunos.stream().filter(aprovados).map(apenasNota).reduce(somatoria).get();
		
		System.out.println(totalNotas.floatValue());
		
		listaAlunos.stream().filter(aprovados).map(apenasNota).reduce(somatoria).ifPresent(System.out::println);
		
		
		
		// ---------------------------------------------------
		
		// Reduce #03
		
		List<Aluno> listaAlunos02 = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		
		BiFunction<Media, Double, Media> calcMedia = (media, nota) -> media.adicionar(nota);
		
		BinaryOperator<Media> combinar = (m1, m2) -> Media.combinar(m1, m2);
		
		
		Media media = listaAlunos02.stream()
				.filter(aprovados)
				.map(apenasNota)
				.reduce(new Media(),calcMedia, combinar);
		
		
		System.out.println("A média dos aprovados é: " + media.getValor());
		
	
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}