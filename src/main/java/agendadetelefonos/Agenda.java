package agendadetelefonos;

import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		// Declaracion e inicializacion de variables	
		CListaTfnos listaTelfnos = new CListaTfnos();
		Scanner reader = new Scanner(System.in);
		LeerDatos leerDatos = new LeerDatos();
		int opcion = -1;
		//Inicio de programa
		while (opcion !=5)
		{
			switch (opcion) {
				case 1: buscar(listaTelfnos);
						break;
				case 2: mostrarAgenda(listaTelfnos);
					break;
				case 3: anadirUnContacto(listaTelfnos);
					break;
				case 4: eliminar(listaTelfnos);
				break;
		
		}
		mostrarMenu();
		opcion = leerDatos.RecogerOpcionInt(reader,0,4, "Introduce una opción: ");
		}
				
				reader.close();
	}
	
	public static void mostrarMenu() {
		 
		//Inicio de programa
		System.out.println("\t Menu Principal");
		System.out.println("1.- Buscar");
		System.out.println("2.- Mostrar Agenda");
		System.out.println("3.- Añadir contacto");
		System.out.println("4.- Eliminar contacto");
		System.out.println("5.- Salir");
	}
	
	public static void buscar(CListaTfnos listaTelfnos) {
		Scanner reader = new Scanner(System.in);
		LeerDatos leerDatos = new LeerDatos();
		String nombreIntroducido="";		
		boolean personaEncontrada = false; 
		while(!personaEncontrada) {
			nombreIntroducido = leerDatos.IntroducirTexto(reader, "Introduzca nombre: ");
			personaEncontrada= listaTelfnos.mostrarPersona(nombreIntroducido);
		}
		
	}
	
	public static void mostrarAgenda(CListaTfnos listaTelfnos) {
		listaTelfnos.mostrarLista();
	}
	
	public static void anadirUnContacto(CListaTfnos listaTelfnos) {
		//Declaracion e inicialización de variables
		Scanner reader = new Scanner(System.in);
		LeerDatos leerDatos = new LeerDatos();
		String nombre;
		String email;
		int telefono;
	
		nombre = leerDatos.IntroducirTexto(reader, "Introduzca nombre: ");
		email = leerDatos.IntroducirTexto(reader, "Introduzca email: ");
		telefono= leerDatos.RecogerOpcionInt(reader,99999999,999999999,"Introduzca teléfono: ");
			
		CPersona persona1= new CPersona(nombre, email, telefono);
		listaTelfnos.anadir(persona1);
	}
	
	public static void eliminar(CListaTfnos listaTelfnos) {
		Scanner reader = new Scanner(System.in);
		LeerDatos leerDatos = new LeerDatos();
		int telBuscado;
		telBuscado= leerDatos.RecogerOpcionInt(reader,99999999,999999999,"Introduzca teléfono: ");
		listaTelfnos. eliminar(telBuscado);
	}
	
}
