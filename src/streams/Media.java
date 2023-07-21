package streams;

public class Media {
	
	double nota;
	double quant;
	
	
	public Media adicionar(double notas) {
		nota += notas;
		quant++;
		return this;
	};
	
	
	public double getValor() {
		return nota / quant;
	};
	
	
	public static Media combinar(Media m1, Media m2){
		Media resultante = new Media();
		resultante.nota = m1.nota + m2.nota;
		resultante.quant = m1.quant + m2.quant;
		return resultante;
		
	};
	
}
