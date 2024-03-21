package Clases_21_03_2024;

public interface TipoAve {
	public class Loros extends Ave{

		 	@Override
		    public void volar() {
		 		System.out.print("Ha volado con exito");
		    }

		    @Override
		    public void comer() {
		        // Implementación específica para loros
		    }

		    @Override
		    public void caminar() {
		        // Implementación específica para loros
		    }
	}
	public class Pinguinos extends Ave{

	 	@Override
	    public void volar() {
	        System.out.print("Pinguino no puede volar");
	    }

	    @Override
	    public void comer() {
	        // Implementación específica para loros
	    }

	    @Override
	    public void caminar() {
	        // Implementación específica para loros
	    }
}
}
