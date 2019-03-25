package hospital;

import java.util.Scanner;

public class FuncionesHospital {
	LeerDatos leerDatos = new LeerDatos();
	public Cita pedirCita(Scanner reader, String servicioIntroducido, Medico [] arrayMedico, Paciente [] arrayPaciente) {
		Cita cita1 = null;
		
		for(int i=0; i<arrayMedico.length; i++) {
			if(servicioIntroducido.equals(arrayMedico[i].getServicio())){
			 //introducir Datos cita
				
				int posPaciente=leerDatos.ComprobarDNIExistente(reader, arrayPaciente);
				Paciente pacienteCita=arrayPaciente[posPaciente];
				Medico medicoCita=arrayMedico[i];
				String fechaCita="18-04-2019";
				String horaCita="10:45";
				
				cita1=new Cita(pacienteCita, medicoCita, fechaCita, horaCita);
				
			}
			else {
				System.out.println("El servicio introducido no existe. ");
			}
		}
		return cita1;
	}
	
	public Cita listarDatosMedicoDeterminado(Scanner reader, String servicioIntroducido, Medico [] arrayMedico, Paciente [] arrayPaciente) {
		Cita cita1 = null;
		
		for(int i=0; i<arrayMedico.length; i++) {
			if(servicioIntroducido.equals(arrayMedico[i].getServicio())){
			 //introducir Datos cita
				
				int posPaciente=leerDatos.ComprobarDNIExistente(reader, arrayPaciente);
				Paciente pacienteCita=arrayPaciente[posPaciente];
				Medico medicoCita=arrayMedico[i];
				String fechaCita="18-04-2019";
				String horaCita="10:45";
				
				cita1=new Cita(pacienteCita, medicoCita, fechaCita, horaCita);
				
			}
			else {
				System.out.println("El servicio introducido no existe. ");
			}
		}
		return cita1;
	}
}
