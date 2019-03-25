package hospital;

public class Cita {
	//atributos:
	private Paciente pacienteCita;
	private Medico medicoCita;
	private String fechaCita;
	private String horaCita;
	
	public Cita(Paciente pacienteCita, Medico medicoCita, String fechaCita, String horaCita) {
		super();
		this.pacienteCita = pacienteCita;
		this.medicoCita = medicoCita;
		this.fechaCita = fechaCita;
		this.horaCita = horaCita;
	}

	public Paciente getPacienteCita() {
		return pacienteCita;
	}

	public void setPacienteCita(Paciente pacienteCita) {
		this.pacienteCita = pacienteCita;
	}

	public Medico getMedicoCita() {
		return medicoCita;
	}

	public void setMedicoCita(Medico medicoCita) {
		this.medicoCita = medicoCita;
	}

	public String getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(String fechaCita) {
		this.fechaCita = fechaCita;
	}

	public String getHoraCita() {
		return horaCita;
	}

	public void setHoraCita(String horaCita) {
		this.horaCita = horaCita;
	}
	
	//métodos:
	public String imprimirCita() {
		String verCita="";
		verCita="Paciente: " + pacienteCita.nombre + "Médico: " + medicoCita.nombre + "Fecha de la cita: " + this.fechaCita + "Hora cita: " + this.horaCita;
		return verCita;
		
	}
	
}
