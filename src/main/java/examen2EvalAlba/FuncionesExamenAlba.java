package examen2EvalAlba;
import java.util.Scanner;

public class FuncionesExamenAlba {
	
	
	
	public Alumno[] CargarDatosAlumno(Scanner reader, LeerDatos leerDatos, Alumno [] alumnos) {
		// TODO Auto-generated method stub
		
		//Declaracion e inicialización de variables
				int contador=1;
				int contadorProducto=0;
				String nombre;
				int cantidad;
				double precioUnitario;
				int tipoProducto;
			
				boolean continuar=true;
				//Declaro el array productos del obtejo Producto y lo inicializo a null.
				Alumno [] arrayAuxiliar=null;
				Alumno [] arrayAlumnos = null;
				
				//Inicio de programa
				System.out.println("Productos:");
				
				//creo el array: //se prodria inicializar en un array con +1

				while(continuar)
				{
					int cod_alumno;
					double nota_trabajo;
					double nota_practica;
					double nota_examen;
					
					arrayAuxiliar = arrayAlumnos;
					arrayAlumnos = new Alumno[contador];
					if(arrayAuxiliar!=null)
					{
						System.arraycopy(arrayAuxiliar, 0, arrayAlumnos, 0, arrayAuxiliar.length);
					}
					contadorProducto=contadorProducto+1;
					cod_alumno = leerDatos.RecogerOpcionInt(reader, 0,50, "Introduzca código alumno:");
					nombre=leerDatos.IntroducirTexto(reader,"Introduce nombre del alumno: "+ contadorProducto +" : ");
					nota_trabajo=leerDatos.RecogerOpcionDouble(reader,0,10,"¿Qué nota trabajo tiene? :");
					nota_practica=leerDatos.RecogerOpcionDouble(reader,0,10,"¿Qué nota practica tiene? :");
					nota_examen=leerDatos.RecogerOpcionDouble(reader,0,10,"¿Qué nota examen tiene? ");
						
					continuar = leerDatos.IntroducirRespuesta(reader, "¿Desea continuar introduciendo datos (S/N) ?  ");
					
					//Dar valores al array:
					Alumno objetoProducto = new Alumno(cod_alumno,nombre,nota_trabajo,nota_practica,nota_examen);

					arrayAlumnos[contador-1] = objetoProducto;
					contador=contador+1;
				}	
				return arrayAlumnos;
		
	}
	
}
