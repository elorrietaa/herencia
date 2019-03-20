package hospital;

public class EmpleadoPlantilla extends Empleado {
	
	//atributos
	protected float salarioMensual;
	protected float porcentajeHoraExtra;
	
	//constructor:
	public EmpleadoPlantilla(String dni, String nombre, String apellido, String fechaNac, String direccion,
			String ciudad) {
		super(dni, nombre, apellido, fechaNac, direccion, ciudad);
		// TODO Auto-generated constructor stub
	}

	//get y set 
	public float getSalarioMensual() {
		return salarioMensual;
	}

	public void setSalarioMensual(float salarioMensual) {
		this.salarioMensual = salarioMensual;
	}

	public float getPorcentajeHoraExtra() {
		return porcentajeHoraExtra;
	}

	public void setPorcentajeHoraExtra(float porcentajeHoraExtra) {
		this.porcentajeHoraExtra = porcentajeHoraExtra;
	}
	
	
	
}
