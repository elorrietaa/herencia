package ejerHospiLaura;
import java.util.Date;

public class Eventual extends Empleado {
	
	private int honorariosHora;
	private int numHorasTotales;
	private String fechaFinContrato;
	
	public Eventual(String dni, String nombre, String apellido, Date fechaNacimiento, String direccion, String ciudad, int honorariosHora, int numHorasTotales, String fechaFinContrato) {
		super(dni, nombre, apellido, fechaNacimiento, direccion, ciudad);
		this.honorariosHora = honorariosHora;
		this.numHorasTotales = numHorasTotales;
		this.fechaFinContrato = fechaFinContrato;
	}

	public int getHonorariosHora() {
		return honorariosHora;
	}

	public void setHonorariosHora(int honorariosHora) {
		this.honorariosHora = honorariosHora;
	}

	public int getNumHorasTotales() {
		return numHorasTotales;
	}

	public void setNumHorasTotales(int numHorasTotales) {
		this.numHorasTotales = numHorasTotales;
	}

	public String getFechaFinContrato() {
		return fechaFinContrato;
	}

	public void setFechaFinContrato(String fechaFinContrato) {
		// validar fecha
		this.fechaFinContrato = fechaFinContrato;
	}

}
