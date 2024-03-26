package Clase_26_03_2024;

public class FactoriaAnimalConcreta implements IFactoriaAnimal {

	@Override
	public IAnimal getTipoAnimal(String s) {
		if(s == "Pato") {
			return new Pato();
		}
		return null;
	}

}