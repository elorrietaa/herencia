package troya;

public class Griego extends Guerrero{

	public Griego(String nombre, int edad, int fuerza) {
		super(nombre, edad, fuerza);
		
	}
	
	public Griego (){
		
		this ("GriegoX",20,8);
	} 
	
	public boolean retirarse(){
		
		if (herido==true && muerto==false) {
			System.out.println("Accion: Retirarse");
			System.out.println("Griego: " + nombre);
			System.out.println("Edad: " + edad + "Fuerza: " + fuerza);
			System.out.println("Esta Herido --> RETIRADA");
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean procedencia() {
		return true;
	}
}