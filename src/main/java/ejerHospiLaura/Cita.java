package ejerHospiLaura;
import java.sql.Time;
import java.util.Date;

public class Cita {
	
	private Empleado empleadoAtiende;
	private Paciente paciente;
	private Servicio servicio;
	private Medico medico;
	private Date fecha;
	private Time hora;
	
	public Cita(Empleado empleadoAtiende, Paciente paciente, Servicio servicio, Medico medico, Date fecha, Time hora) {
		this.empleadoAtiende = empleadoAtiende;
		this.paciente = paciente;
		this.servicio = servicio;
		this.medico = medico;
		this.fecha = fecha;
		this.hora = hora;
	}

	public Empleado getEmpleadoAtiende() {
		return empleadoAtiende;
	}

	public void setEmpleadoAtiende(Empleado empleadoAtiende) {
		this.empleadoAtiende = empleadoAtiende;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	@Override
	public String toString() {
		return "Cita [empleadoAtiende=" + empleadoAtiende.toString() + ", servicio=" + servicio + ", medico=" + medico + ", fecha="
				+ fecha + ", hora=" + hora + "]";
	}
	
}
