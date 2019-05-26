package ejerHospiLaura;
import java.util.Date;

public class Plantilla extends Empleado {
	
	protected int salario;
	protected int horaExtra;
	
	public Plantilla(String dni, String nombre, String apellido, Date fechaNacimiento, String direccion, String ciudad, int salario, int horaExtra) {
		super(dni, nombre, apellido, fechaNacimiento, direccion, ciudad);
		this.salario = salario;
		this.horaExtra = horaExtra;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getHoraExtra() {
		return horaExtra;
	}

	public void setHoraExtra(int horaExtra) {
		this.horaExtra = horaExtra;
	}
	
}
