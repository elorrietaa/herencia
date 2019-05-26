package ejerHospiLaura;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HospitalMain {

	public static void main(String[] args) {
		
		DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		Date fechaNacimiento = null;
		Date fechaCita = null;
		Time horaCita = null;
		String[] medicamentosAlergias = new String[3];
		Hospital hospital = new Hospital(10,10,10,10);
		
		try {
			fechaNacimiento = new Date(df.parse("12-31-2002").getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			fechaCita = new Date(df.parse("12-31-2018").getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		// CREAR OBJETOS
		
		// crear empleados
		Plantilla empleadoPlantilla1 = new Plantilla("12345678-Z", "Pepito", "Grillo", fechaNacimiento, "c/pinocho, 1", "DisneyLand", 2000, 30);
		Plantilla empleadoPlantilla2 = new Plantilla("12345678-X", "Alan", "Walker", fechaNacimiento, "c/pinocho, 1", "DisneyLand", 2000, 30);
		Plantilla empleadoPlantilla3 = new Plantilla("12345678-Y", "Nombre3", "Grillo", fechaNacimiento, "c/pinocho, 1", "DisneyLand", 2000, 30);
		Eventual empleadoEventual1 = new Eventual("12345678-Z", "Pepito", "Grillo", fechaNacimiento, "c/pinocho, 1", "DisneyLand", 20, 300, "");
		Eventual empleadoEventual2 = new Eventual("12345678-X", "Alan", "Walker", fechaNacimiento, "c/pinocho, 1", "DisneyLand", 20, 300, "");
		Eventual empleadoEventual3 = new Eventual("12345678-Y", "Nombre3", "Grillo", fechaNacimiento, "c/pinocho, 1", "DisneyLand", 20, 300, "");
		
		// crear medicos
		Medico medico1 = new Medico("12345678-Z", "Pepito1", "Grillo", fechaNacimiento, "c/pinocho, 1", "DisneyLand", 2000, 30, Servicio.OFTALMOLOGIA, Especialidad.OFTALMOLOGO, 202);
		Medico medico2 = new Medico("12345678-X", "Pepito2", "Grillo", fechaNacimiento, "c/pinocho, 1", "DisneyLand", 2000, 30, Servicio.DERMATOLOGIA, Especialidad.DERMATOLOGO, 202);
		Medico medico3 = new Medico("12345678-Y", "Pepito3", "Grillo", fechaNacimiento, "c/pinocho, 1", "DisneyLand", 2000, 30, Servicio.CARDIOLOGIA, Especialidad.CARDIOLOGO, 202);
		
		// crear pacientes
		Paciente paciente1 = new Paciente("12345678-Z", "Pepito1", "Grillo", fechaNacimiento, "c/pinocho, 1", "DisneyLand", 345, 'M', GrupoSangre.AP, medicamentosAlergias);
		Paciente paciente2 = new Paciente("12345678-X", "Pepito2", "Grillo", fechaNacimiento, "c/pinocho, 1", "DisneyLand", 345, 'H', GrupoSangre.OP, medicamentosAlergias);
		Paciente paciente3 = new Paciente("12345678-Y", "Pepito3", "Grillo", fechaNacimiento, "c/pinocho, 1", "DisneyLand", 345, 'M', GrupoSangre.BN, medicamentosAlergias);
		
		// crear citas
		Cita cita1 = new Cita(empleadoPlantilla1, paciente1, Servicio.CARDIOLOGIA, medico1, fechaCita, horaCita);
		Cita cita2 = new Cita(empleadoPlantilla1, paciente2, Servicio.CARDIOLOGIA, medico1, fechaCita, horaCita);
		
		
		// REGISTRAR OBJETOS
		
		// registrar empleados
		if (hospital.añadirEmpleado(empleadoPlantilla1)) {
			System.out.println("Empleado '" + empleadoPlantilla1.getNombre() + "' añadido al registro");
		} else {
			System.out.println("No hay sitio para más empleados.");
		}
		
		if (hospital.añadirEmpleado(empleadoPlantilla2)) {
			System.out.println("Empleado '" + empleadoPlantilla2.getNombre() + "' añadido al registro");
		} else {
			System.out.println("No hay sitio para más empleados.");
		}
		
		if (hospital.añadirEmpleado(empleadoPlantilla3)) {
			System.out.println("Empleado '" + empleadoPlantilla3.getNombre() + "' añadido al registro");
		} else {
			System.out.println("No hay sitio para más empleados.");
		}
		
		if (hospital.añadirEmpleado(empleadoEventual1)) {
			System.out.println("Empleado '" + empleadoEventual1.getNombre() + "' añadido al registro");
		} else {
			System.out.println("No hay sitio para más empleados.");
		}
		
		if (hospital.añadirEmpleado(empleadoEventual2)) {
			System.out.println("Empleado '" + empleadoEventual2.getNombre() + "' añadido al registro");
		} else {
			System.out.println("No hay sitio para más empleados.");
		}
		
		if (hospital.añadirEmpleado(empleadoEventual3)) {
			System.out.println("Empleado '" + empleadoEventual3.getNombre() + "' añadido al registro");
		} else {
			System.out.println("No hay sitio para más empleados.");
		}
				
		// registrar medicos
		if (hospital.añadirMedico(medico1)) {
			System.out.println("Médico '" + medico1.getNombre() + "' añadido al registro");
		} else {
			System.out.println("No hay sitio para más médicos.");
		}
		
		if (hospital.añadirMedico(medico2)) {
			System.out.println("Médico '" + medico2.getNombre() + "' añadido al registro");
		} else {
			System.out.println("No hay sitio para más médicos.");
		}
		
		if (hospital.añadirMedico(medico3)) {
			System.out.println("Médico '" + medico3.getNombre() + "' añadido al registro");
		} else {
			System.out.println("No hay sitio para más médicos.");
		}
		
		// registrar pacientes
		if (hospital.añadirPaciente(paciente1)) {
			System.out.println("Pacientes '" + paciente1.getNombre() + "' añadido al registro");
		} else {
			System.out.println("No hay sitio para más pacientes.");
		}
		
		if (hospital.añadirPaciente(paciente2)) {
			System.out.println("Pacientes '" + paciente2.getNombre() + "' añadido al registro");
		} else {
			System.out.println("No hay sitio para más pacientes.");
		}
		
		if (hospital.añadirPaciente(paciente3)) {
			System.out.println("Pacientes '" + paciente3.getNombre() + "' añadido al registro");
		} else {
			System.out.println("No hay sitio para más pacientes.");
		}
		
		// registrar citas
		if (hospital.añadirCita(cita1)) {
			System.out.println("Cita añadido al registro");
		} else {
			System.out.println("No hay sitio para más pacientes.");
		}
		
		if (hospital.añadirCita(cita2)) {
			System.out.println("Cita añadido al registro");
		} else {
			System.out.println("No hay sitio para más pacientes.");
		}
		
		
		// MOSTRAR OBJETOS
		
		// mostrar medicos
		System.out.println("MOSTRAR MEDICOS:");
		hospital.mostrarMedicos();
		
		// mostrar medicos
		System.out.println("ORDENAR MEDICOS:");
		hospital.ordenarMedicosPorEspecialidad();
		
		// mostrar medicos
		System.out.println("MOSTRAR MEDICOS:");
		hospital.mostrarMedicos();
		
		// mostrar citas
		System.out.println("MOSTRAR CITAS:");
		hospital.mostrarCitas();
		
		// mostrar pacientes de un medico
		System.out.println("MOSTRAR PACIENTES POR MEDICO:");
		hospital.mostrarPacientesPorMedico(medico1);
		
	}

}
