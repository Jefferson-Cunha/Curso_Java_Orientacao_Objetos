package Estrutura_Repeticao;

public class For_Desafio {
	public static void main(String[] args) {
		
		
		
		for(String valor = "#"; !valor.equalsIgnoreCase("########");) {
			System.out.println(valor);
			valor += "#";
		}
	}

}
