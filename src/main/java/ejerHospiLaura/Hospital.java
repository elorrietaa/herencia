package ejerHospiLaura;

public class Hospital {
	
	private Empleado[] empleados;
	private Medico[] medicos;
	private Paciente[] pacientes;
	private Cita[] citas;
	private int numEmpleados;
	private int numMedicos;
	private int numPacientes;
	private int numCitas;
	private int numMaxEmpleados;
	private int numMaxMedicos;
	private int numMaxPacientes;
	private int numMaxCitas;
	
	public Hospital(int numMaxEmpleados, int numMaxMedicos, int numMaxPacientes, int numMaxCitas) {
		this.numMaxEmpleados = numMaxEmpleados;
		this.numMaxMedicos = numMaxMedicos;
		this.numMaxPacientes = numMaxPacientes;
		this.numMaxCitas = numMaxCitas;
		this.empleados = new Empleado[numMaxEmpleados];
		this.medicos = new Medico[numMaxMedicos];
		this.pacientes = new Paciente[numMaxPacientes];
		this.citas = new Cita[numMaxCitas];
	}

	public boolean añadirEmpleado(Empleado empleado) {
		if (numEmpleados < numMaxEmpleados) {
			empleados[numEmpleados] = empleado;
			numEmpleados++;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean añadirMedico(Medico medico) {
		if (numMedicos < numMaxMedicos) {
			medicos[numMedicos] = medico;
			numMedicos++;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean añadirPaciente(Paciente paciente) {
		if (numPacientes < numMaxPacientes) {
			pacientes[numPacientes] = paciente;
			numPacientes++;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean añadirCita(Cita cita) {
		if (numCitas < numMaxCitas) {
			citas[numCitas] = cita;
			numCitas++;
			return true;
		} else {
			return false;
		}
	}
	
	public void mostrarMedicos() {
		System.out.println("MEDICOS:");
		for(int i = 0; i < numMedicos; i++) {
			String string = "";
			string += medicos[i].toString() + "\n";
			System.out.println(string);
		}
	}
	
	public void mostrarCitas() {
		for(int i = 0; i < numCitas; i++) {
			String string = "";
			string += citas[i].toString();
			System.out.println(string);
		}
	}
	
	public void ordenarMedicosPorEspecialidad() {
		boolean desorden = true;
		while (desorden) {
			desorden = false;
			for (int i = 0; i < medicos.length-1; i++) {
				if( medicos[i] == null || medicos[i+1] == null ) {
					continue;
				}
				if( medicos[i].getEspecialidad().compareTo(medicos[i+1].getEspecialidad()) < 0) {
					Medico auxiliar = medicos[i+1];
					medicos[i+1] = medicos[i];
					medicos[i] = auxiliar;
					desorden = true;
				}
			}
		}
	}
	
	public void mostrarPacientesPorMedico(Medico medico) {
		for(int i = 0; i < this.numCitas; i++) {
			if (medico.getNombre() == citas[i].getMedico().getNombre()) {
				System.out.println(citas[i].getPaciente().getNombre());
			}
		}
	}
	
}
