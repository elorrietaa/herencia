package hospital;

import java.util.Scanner;

public class PrincipalHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LeerDatos leerDatos = new LeerDatos();
	Scanner reader = new Scanner(System.in);
	FuncionesHospital funciones = new FuncionesHospital();
	EmpleadoPlantilla [] arrayEmpleadosPlantilla =null;
	EmpleadoEventual [] arrayEmpleadosEventuales =null;
	Medico [] arrayMedicos =null;
	Paciente [] arrayPacientes=null;
	
	int opcion = -1;
	
	//Inicio de programa
			while (opcion !=0)
			{
				switch (opcion) {
					case 1: alumnos = funciones.CargarDatos(reader, leerDatos);
						break;
					case 2: if(alumnos != null) funciones.ProcesarDatos(alumnos);
						break;
					case 3: if(alumnos != null) funciones.MostrarDatos(alumnos);
						break;
					case 4: if(alumnos != null) funciones.MostrarDatosAlumno(alumnos,reader);
					break;
		
				}
				funciones.MostrarMenu();
				opcion = leerDatos.RecogerOpcionInt(reader,0,4, "Introduce una opción: ");
			}
			
			reader.close();
	}

}
