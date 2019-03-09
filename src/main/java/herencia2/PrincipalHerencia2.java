package herencia2;

import java.util.Scanner;

public class PrincipalHerencia2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		Persona persona = new Persona();
		Empleado empleado = new Empleado();
		
		persona.cargarDatos();
		persona.imprimirDatos();
		
		empleado.cargarDatos();
		empleado.imprimirDatos();
		empleado.cargarSueldo();
		empleado.imprimirSueldo();
	}

}
