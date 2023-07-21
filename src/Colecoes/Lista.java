package Colecoes;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;

public class Lista {
	
	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<>();
		lista.add(new Usuario("Maria"));
		// Outra forma de adicionar um usuário a lista
		
		Usuario u1 = new Usuario("João");
		lista.add(u1);
		
		
		
		System.out.println(lista.get(1));
		
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
		
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana"); // - Fila cheia retorno false
		fila.offer("Carlos"); // - Fila cheia retorna exceção
				
		//-Ambos leem, porém não remove
		
		fila.peek(); // - Fila vazia retorna Null
		fila.element(); // - Fila vazia retorna exceção 
		
		//- Ambos leem, porém remove
		
		System.out.println(fila.poll()); // - Fila vazia retorna Null
		fila.remove(); // - Fila vazia retorna exceção
		
		
		Deque<String> pilhaDeLivros = new ArrayDeque<>();
		
		pilhaDeLivros.add("O Pequeno Príncipe"); // - Pilha cheia retorno false
		pilhaDeLivros.push("Don Quixote"); // - Pilha cheia retorna exceção
	
		Map<Integer, String> usuarios = new HashMap<>();		
		
		usuarios.put(1, "Jefferson");
		usuarios.put(2, "Maria");
		usuarios.put(3, "João");
		
		
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " => ");
			System.out.println(registro.getValue());
		}
		
		
		
		
		
		
		
		
		
	}

}
