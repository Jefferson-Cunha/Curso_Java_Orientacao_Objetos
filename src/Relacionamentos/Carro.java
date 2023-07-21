package Relacionamentos;

public class Carro {

	Motor motor = new Motor();

	void acelerar() {
		if (motor.ligado == true && motor.fatorInjecao < 2.9) {
			motor.fatorInjecao += 0.4;
		}
	}

	void frear() {
		if (motor.ligado == true && motor.fatorInjecao >= 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}

	void ligar() {
		motor.ligado = true;
	}

	void desligar() {
		motor.ligado = false;
	}

}
