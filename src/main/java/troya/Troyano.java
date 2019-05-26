package troya;

public class Troyano extends Guerrero{

	public Troyano(String nombre, int edad, int fuerza) {
		super(nombre, edad, fuerza);
		
	}
	

	public Troyano (){
		
		this ("TroyanoX",18,10);
	} 
	
	public boolean retirarse(){
		 System.out.println("Accion: Retirarse");
		 System.out.println("Troyano: " + nombre);
		 System.out.println("Edad: " + edad + "Fuerza: " + fuerza);
		 System.out.println("Esta Herido --> Los Guerreros Troyanos NUNCA se retiran!!!");
		 return false;
	}
	
	public boolean procedencia() {
		return false;
	}
}



