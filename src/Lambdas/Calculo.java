package Lambdas;

public interface Calculo {

	double executarSoma(double a, double b);

	default double executarMult(double a, double b) {
		return a * b;
	};

}
