package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Lu", "Ana", "Gui", "Luccas");

//		System.out.println("Usando o Iterator");
//
//		Iterator<String> iterator = aprovados.iterator();
//
//		while (iterator.hasNext()) {
//		}
//
//		System.out.println("\nUsando Streams...");
//
//		Stream<String> stream = aprovados.stream();
//		stream.forEach(System.out::println);
		
		
		// Criando Streams
		
		Consumer<String> print = System.out::println;
		
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		
		langs.forEach(print);
		
		String [] maisLang = {"Python ", "Lisp ", "Perl ", "Go \n"};
		
		Stream.of(maisLang).forEach(print);
		
		aprovados.forEach(print);		
		
		
		
		
		
		
		
		

	}
  
}
