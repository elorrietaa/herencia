package hospital;

import java.util.Scanner;

public class PrincipalHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LeerDatos leerDatos = new LeerDatos();
	Scanner reader = new Scanner(System.in);
	Medico medico = new Medico(null, null, null, null, null, null, 0, 0, null, null, 0);
	FuncionesHospital funciones = new FuncionesHospital();
	//1)	Registrar los datos de los empleados, los pacientes y los médicos.
	//Registramos empleados:
	EmpleadoPlantilla empleadoPlantilla1 = new EmpleadoPlantilla("22258295A", "Ana", "Fernández", "22-10-2019", "Calle 1", "Barakaldo", 3000, 120);
	EmpleadoPlantilla empleadoPlantilla2 = new EmpleadoPlantilla("22258296B", "Juan", "Fernández", "23-10-2019", "Calle 2", "Barakaldo", 3000, 120);
	EmpleadoPlantilla empleadoPlantilla3 = new EmpleadoPlantilla("22258296C", "Juan", "Fernández", "23-10-2019", "Calle 2", "Barakaldo", 3000, 120);

	//Registramos pacientes:
	String [] listaMedicamentos1= {"Paracetamol", "Ibuprofeno"};
	Paciente paciente1 = new Paciente("22258295A", "Paciente1","Apellido1","18-04-1955", "Calle 1", "Barakaldo", 1, 'M' , "A+",listaMedicamentos1);
	String [] listaMedicamentos2= {"Paracetamol", "Ibuprofeno", "Paracetamol"};
	Paciente paciente2 = new Paciente("22258295B", "Paciente2","Apellido2","18-04-1965", "Calle 1", "Barakaldo", 1, 'M' , "A+",listaMedicamentos2);
	String [] listaMedicamentos3= {"Paracetamol", "Ibuprofeno", "Paracetamol", "Fastum"};
	Paciente paciente3 = new Paciente("22258295C", "Paciente3","Apellido3","18-04-1975", "Calle 1", "Barakaldo", 1, 'H' , "A+",listaMedicamentos3);
	String [] listaMedicamentos4= {"Paracetamol", "Ibuprofeno", "Paracetamol", "Fastum"};
	Paciente paciente4 = new Paciente("22258295D", "Paciente4","Apellido4","18-04-1975", "Calle 1", "Barakaldo", 1, 'H' , "A+",listaMedicamentos4);
	String [] listaMedicamentos5= {"Paracetamol", "Ibuprofeno", "Paracetamol", "Fastum"};
	Paciente paciente5 = new Paciente("22258295E", "Paciente5","Apellido5","18-04-1975", "Calle 1", "Barakaldo", 1, 'H' , "A+",listaMedicamentos5);
	//Registramos médicos:
	Medico medico1 = new Medico("11111111M", "Medico1", "ApellidoM1", "18-04-1975", "Calle 1", "Barakaldo", 5000, 200, "Cirugía" ,"Cirujano", 1 );
	Medico medico2 = new Medico("22222222M", "Medico2", "ApellidoM2", "18-04-1975", "Calle 1", "Barakaldo", 5000, 200, "Oftalmología" ,"Oftalmólogo", 3 );
	Medico medico3 = new Medico("33333333M", "Medico3", "ApellidoM3", "18-04-1975", "Calle 1", "Barakaldo", 5000, 200, "Dermatología" ,"Dermatólogo", 2 );

	//Rellenamos los arrays:
	EmpleadoPlantilla [] arrayEmpleadosPlantilla = {empleadoPlantilla1, empleadoPlantilla2, empleadoPlantilla3};
	EmpleadoEventual [] arrayEmpleadosEventuales =null;
	Paciente [] arrayPacientes={paciente1, paciente2, paciente3, paciente4, paciente5};
	Medico [] arrayMedicos = {medico1, medico2, medico3};
	
	//2)	Registrar los datos de una cita médica.
	
	String servicioIntroducido;
	servicioIntroducido=leerDatos.IntroducirTexto(reader, "¿En qué servicio desea pedir cita?: ");
	Cita cita1=funciones.pedirCita(reader, servicioIntroducido, arrayMedicos, arrayPacientes);
	Cita cita2= new Cita(paciente1, medico1, "18-04-2018", "12:45");
	Cita [] arrayCitas = {cita1};
	for(int i=0; i<arrayCitas.length;i++) {
		System.out.println(arrayCitas[i].imprimirCita());
	}
	
	
	//3)	Listar los datos de los médicos ordenados en forma descendente por la especialidad.
	medico.ordenarEspecialidadDes(arrayMedicos);
	//4)	Listar los datos (nombres y apellidos) de los pacientes atendidos por un médico determinado (ingresando su código)
	String medicoIntroducido;
	medicoIntroducido=leerDatos.IntroducirTexto(reader, "Nombre médico determinado: ");
	
	}
	
	
}
