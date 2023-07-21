package ClasseMetodos;

public class AreaCirc {
	
	double raio;
	static final double pi = 3.14;
	
	
	public AreaCirc(double raioInicial) {
		raio = raioInicial;

	}
	
	double calcArea(double raioInicial) {
		return raio * raio / pi;
	}
}
