package examen2EvalAlba;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
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
	


	/**
	 * Método: imprimirListaAlumnos, escribe en el fichero la lista de alumnos de la asignatura
	 * En el caso de que el fichero que se desea guardar no exista, mustra un mensaje por consola
	 * @param modelo
	 * @param vista
	 */
	public void imprimirListaAlumnos(Asignatura asignatura, Alumno [] alumnos) {
	
		FileWriter fichero = null;
        PrintWriter writer = null;
        try  
        {
        	File archivo = new File("C:\\workspace\\RETO4/listaAlumnos.txt");
        	if (!archivo.exists()) {
        	    System.out.println("OJO: ¡¡No existe el archivo de configuración!!");
        	    System.exit(0);
        	}
            fichero = new FileWriter("C:\\workspace\\marzo/listaAlumnos.txt", true); // true es para añadir al final de un fichero ya existente
            writer = new PrintWriter(fichero);
            //vista.detallesReserva.tFPrecioReserva.getX() 
			writer.println("*************************************************************************************");
			writer.println("     	 Asignatura      ");
			writer.println("*************************************************************************************");
			writer.println();
			writer.println("La asignatura es: Código asignatura: " + asignatura.getCod_Asignatura() + " , Nombre asignatura: " + asignatura.getNombre());
			writer.println();
			
			writer.println("*************************************************************************************");
			writer.println("     	 Lista alumnos:      ");
			writer.println("*************************************************************************************");
			writer.println();
			System.out.println("--------------------------------------------");
			for (int i = 0; i < asignatura.getNumero(); i++) {
				writer.println(
						alumnos[i].getNombre() + " - " + alumnos[i].getNota_examen() + " - " + alumnos[i].getNota_trabajo()
								+ " - " + alumnos[i].getNota_practica() + "-->" + alumnos[i].getNota_final());
			}
			System.out.println("--------------------------------------------");
			writer.println("*************************************************************************************");
			writer.println();
			
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
	}
	
}
