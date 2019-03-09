package Herencia1;

public class MainHerencia1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Suma suma = new Suma();
		Resta resta = new Resta();
		
	
	suma.cargarValor1();
	suma.cargarValor2();
	suma.operar();
	System.out.println("Resultado suma:");
	suma.mostrarResultado();
	resta.cargarValor1();
	resta.cargarValor2();
	resta.operar();
	System.out.println("Resultado resta:");
	resta.mostrarResultado();
	}

	
	
	
	
	
	
	
	
	
	
}
