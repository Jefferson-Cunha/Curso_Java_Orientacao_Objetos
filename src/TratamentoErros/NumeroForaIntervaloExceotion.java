package TratamentoErros;

@SuppressWarnings("serial")
public class NumeroForaIntervaloExceotion extends RuntimeException {

	private String NomeDoAtributo;

	public NumeroForaIntervaloExceotion(String Atributo) {
		this.NomeDoAtributo = Atributo;
	}

	public String getMessage() {
		return String.format("O Atributo %s está fora do intervalo!", 
				NomeDoAtributo);
	}
}
