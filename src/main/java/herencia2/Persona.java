package herencia2;

import java.util.Scanner;

public class Persona {
	Scanner reader = new Scanner(System.in);
	LeerDatos leer = new LeerDatos();
	protected String nombre; 
	protected int edad;
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//metodos:
	public void cargarDatos() {
		System.out.println("Introduce nombre");
		nombre=reader.next();
		System.out.println("Introduce edad");
		edad=leer.RecogerOpcionInt(reader, 0, 150, "Introduzca su edad");
	}
	public void imprimirDatos() {
		System.out.println("Nombre:"+ nombre);
		System.out.println("Edad:"+ edad);
	}
	
	
	
}
