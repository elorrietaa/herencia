package herencia2;

public class Empleado extends Persona {

	//atributos
	public float sueldo;

	//get y set
	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	//metodos:
	public void cargarSueldo() {
		System.out.println("Introduce sueldo");
		sueldo=reader.nextFloat();
	}
	
	public void imprimirSueldo() {
		System.out.println("Sueldo:"+sueldo);
	}
	
}
