package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MiExcepcion extends Exception {
	public MiExcepcion() {
		
	}
	
	public String ExceptionError() {
		return "Error X";
	}
	
public int RecogerOpcionInt(Scanner reader,int valorMin,int valorMax, String texto ) {
		
		//Declaracion e inicialización de variables
		int opcion = -1;
		boolean opcionCorrecta = false; 
		//Inicio de programa
		System.out.println(texto);
		while(opcion==-1)
		{
			try
			{ 
				opcion=reader.nextInt();
				while(opcion < valorMin || opcion > valorMax)
				{
					System.out.println("Introduce un valor númerico entre "+valorMin+" y "+valorMax);
					opcion=reader.nextInt();
				}
				reader.nextLine();
				opcionCorrecta = true;
			}
			catch(InputMismatchException ex)
			{
				System.out.println("Introduce un valor númerico entre "+valorMin+" y "+valorMax);
				reader.nextLine();
			}
			
		}
		return opcion;
	}
}

