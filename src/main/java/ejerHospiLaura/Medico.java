package ejerHospiLaura;
import java.util.Date;

public class Medico extends Plantilla {
	
	private Servicio servicio;
	private Especialidad especialidad;
	private int numConsultorio;
	
	public Medico(String dni, String nombre, String apellido, Date fechaNacimiento, String direccion, String ciudad,
			int salario, int horaExtra, Servicio servicio, Especialidad especialidad, int numConsultorio) {
		
		super(dni, nombre, apellido, fechaNacimiento, direccion, ciudad, salario, horaExtra);
		this.servicio = servicio;
		this.especialidad = especialidad;
		this.numConsultorio = numConsultorio;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public int getNumConsultorio() {
		return numConsultorio;
	}

	public void setNumConsultorio(int numConsultorio) {
		this.numConsultorio = numConsultorio;
	}

	@Override
	public String toString() {
		return "Medico [servicio=" + servicio + ", especialidad=" + especialidad + ", numConsultorio=" + numConsultorio
				+ ", salario=" + salario + ", horaExtra=" + horaExtra + ", dni=" + dni + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion
				+ ", ciudad=" + ciudad + "]";
	}
	
}
