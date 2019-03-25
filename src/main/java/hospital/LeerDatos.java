package hospital;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
	
	public float RecogerOpcionFloat(Scanner reader,float valorMin,float valorMax, String texto ) {
		
		//Declaracion e inicialización de variables
		float opcion = 0;
		boolean opcionCorrecta = false; 
		//Inicio de programa
		while(!opcionCorrecta)
		{
			try
			{
				System.out.println(texto);
				opcion=reader.nextFloat();
				while(opcion < valorMin || opcion > valorMax)
				{
					System.out.println("Introduce un valor númerico entre "+valorMin+" y "+valorMax);
					opcion=reader.nextFloat();
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

	public char IntroducirValidarSexo(Scanner reader) {
		//Declaracion e inicialización de variables
		char sexo = 'M';
		//Inicio de programa
		System.out.println("Introduce sexo (M ó H): ");
		sexo = reader.next().charAt(0);
		while(sexo != 'M' && sexo != 'm' && sexo != 'H' && sexo != 'h')
		{
			System.out.println("Introduce sexo (M ó H): ");
			sexo = reader.next().charAt(0);
		}
		if(sexo == 'm' || sexo == 'M')
			sexo = 'M';
		else
			sexo = 'H';
	
		return sexo;
	}
	
	public String IntroducirYValidarFormatoDNI (Scanner reader) {
		String dni="";
		boolean dniValidado=false;
		while(dniValidado==false) {
			System.out.println("Introduzca DNI: ");		
			dni = reader.next();
			if(dni.matches("([0-9]{8})([-]?)([A-Z]{1})"))
			{
				dniValidado=true;
			}	
			else {
				System.out.println("El formato del dni NO es valido. Por favor, introduzca un formato válido.");
				dniValidado=false;
			}
		}
		return dni;
	}
	
	public int ComprobarDNIExistente (Scanner reader, Paciente [] paciente) {
		int posPaciente = -1;
		boolean pacienteExiste=false;
		String dni=IntroducirYValidarFormatoDNI(reader);
		
		while(!pacienteExiste) {
			for(int i=0; i<paciente.length; i++) {
				if(dni.equals(paciente[i].dni)) {
					posPaciente=i;
					pacienteExiste=true;
					break;
				}
				else {
					System.out.println("El DNI introducido no pertenece a ningún paciente registrado.Por favor, introduzca un DNI válido.");
					pacienteExiste=false;
				}
			}
			
		}
		
		return posPaciente;
	}
	
	public Date IntroducirYValidarFecha (Scanner reader) {
		Date fecha = null;
		boolean fechaValida=false;
		while(fechaValida==false) {
			System.out.println("Introduzca fecha: ");
			String date = reader.next();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		
			try {
			    //Parsing the String
				fecha = dateFormat.parse(date);
				fechaValida=true;
			} catch (ParseException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			}
			System.out.println(fecha);	
			
		}
		
		return fecha;
	}
}
