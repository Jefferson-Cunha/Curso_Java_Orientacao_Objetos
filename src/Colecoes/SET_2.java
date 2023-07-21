package Colecoes;

import java.util.SortedSet;
import java.util.TreeSet;


public class SET_2 {
	public static void main(String[] args) {
		
		SortedSet <String> lista = new TreeSet<>();
		
		lista.add("Junior");
		lista.add("Viola");
		lista.add("Thiago");
		lista.add("Caio");
		lista.add("Marcelo"); 
		lista.add("Jhennifer");
				
		for(String nomes: lista) {
			System.out.println(nomes);
		}
		
		
		
	}

}
