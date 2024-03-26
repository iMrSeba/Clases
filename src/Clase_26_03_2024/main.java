package Clase_26_03_2024;

public class main {

	public static void main(String[] args) {
		IFactoriaAnimal ifa = new FactoriaAnimalConcreta();
		Pato pato = (Pato) ifa.getTipoAnimal("Pato");
		pato.hablar();
	}

}
