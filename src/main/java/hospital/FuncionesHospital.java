package hospital;

import java.util.Scanner;

public class FuncionesHospital {
	public void MostrarMenu() {
		//Inicio de programa
		System.out.println("\t Menu Principal");
		System.out.println("1.- Registrar los datos de los empleados, los pacientes y los m�dicos.");
		System.out.println("2.- Registrar los datos de una cita m�dica");
		System.out.println("3.- Listar los datos de los m�dicos ordenados en forma descendente por la especialidad.");
		System.out.println("4.- Listar los datos (nombres y apellidos) de los pacientes atendidos por un m�dico determinado (ingresando su c�digo)");
		System.out.println("0.- Fin");
	}
	
	public void MenuRegistrarDatos() {
		System.out.println("Seleccione el tipo de persona de la que quiere introducir los datos:");
		System.out.println("Introduzca (EP) para introducir Empleados de la plantilla.");
		System.out.println("Introduzca (EE) para introducir Empleados eventuales.");
		System.out.println("Introduzca (P) para introducir Pacientes.");
		System.out.println("Introduzca (M) para introducir M�dicos.");
	}
	
	public void RegistrarDatos(Scanner reader) {
		String opcion="";
		EmpleadoPlantilla [] arrayEmpleadosPlantilla =null;
		EmpleadoEventual [] arrayEmpleadosEventuales =null;
		Medico [] arrayMedicos =null;
		Paciente [] arrayPacientes=null;
		FuncionesHospital funciones = new FuncionesHospital();
		LeerDatos leerDatos = new LeerDatos();
		
		while (opcion !="EP" || opcion !="EE"|| opcion !="P" ||opcion !="M" )
		{
			switch (opcion) {
				case "EP": arrayEmpleadosPlantilla = funciones.CargarDatos(reader, leerDatos);
					break;
				case "EE": if(alumnos != null) funciones.ProcesarDatos(alumnos);
					break;
				case "P": if(alumnos != null) funciones.MostrarDatos(alumnos);
					break;
				case "M": if(alumnos != null) funciones.MostrarDatosAlumno(alumnos,reader);
				break;
	
			}
			MenuRegistrarDatos();
			opcion = leerDatos.IntroducirTexto(reader, "Introduzca opci�n seleccionada: ");
		}
	}
	
}
