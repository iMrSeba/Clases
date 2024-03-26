package Clase_26_03_2024;

public class Connection {
	private static Connection instance;

	private Connection() {
		
	}

	public Connection getInstance() {
		
		if(instance == null) {
			instance = new Connection();
			System.out.print("Instancia creada");		
			return instance;
		}
		else {
			System.out.print("Instancia ya existe");		
			return instance;
		}
		
	}
	
}
