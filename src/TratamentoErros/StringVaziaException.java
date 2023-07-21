package TratamentoErros;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {

	private String NomeDoAtributo;

	public StringVaziaException(String Atributo) {
		this.NomeDoAtributo = Atributo;
	}

	public String getMessage() {
		return String.format("O atributo %s está vazio", 
				NomeDoAtributo);
	}

}
