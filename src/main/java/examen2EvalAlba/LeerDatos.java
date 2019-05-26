package examen2EvalAlba;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LeerDatos {
	

	//public String IntroducirTexto(Scanner reader, String texto, int numerito, String texto) {
	public String IntroducirTexto(Scanner reader, String texto) {

		System.out.println(texto);		
		return reader.next();
	}
	
	public int RecogerOpcionInt(Scanner reader,int valorMin,int valorMax, String texto ) {
		
		//Declaracion e inicialización de variables
		int opcion = 0;
		boolean opcionCorrecta = false; 
		//Inicio de programa
		while(!opcionCorrecta)
		{
			try
			{ 
				System.out.println(texto);
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
	
	public double RecogerOpcionDouble(Scanner reader,double valorMin,double valorMax, String texto ) {
		
		//Declaracion e inicialización de variables
		double opcion = 0;
		boolean opcionCorrecta = false; 
		//Inicio de programa
		while(!opcionCorrecta)
		{
			try
			{
				System.out.println(texto);
				opcion=reader.nextDouble();
				while(opcion < valorMin || opcion > valorMax)
				{
					System.out.println("Introduce un valor númerico entre "+valorMin+" y "+valorMax);
					opcion=reader.nextDouble();
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
	
	public boolean IntroducirRespuesta(Scanner reader, String texto) {
		//Declaracion e inicialización de variables
		char respuesta;
		boolean continuar=true;
		//Inicio de programa
		System.out.println(texto);
		respuesta = reader.next().charAt(0);
		while(respuesta != 'S' && respuesta != 's' && respuesta != 'N' && respuesta != 'n')
		{
			System.out.println(texto);
			respuesta = reader.next().charAt(0);
		}
		if(respuesta == 's' || respuesta == 'S')
			continuar=true;
		else
			continuar=false;
	
		return continuar;
	}
	
	
	
}

