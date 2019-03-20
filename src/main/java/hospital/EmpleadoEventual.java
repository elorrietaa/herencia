package hospital;

public class EmpleadoEventual extends Empleado{
	//atributos:
	protected float salarioHora;
	protected int numeroHorasNormales;
	protected int numeroHorasExtras;
	protected int numeroHorasTotales;
	protected String fechaFinContraro;
	
	//constructor
	public EmpleadoEventual(String dni, String nombre, String apellido, String fechaNac, String direccion,
			String ciudad) {
		super(dni, nombre, apellido, fechaNac, direccion, ciudad);
		
	}

	public float getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(float salarioHora) {
		this.salarioHora = salarioHora;
	}

	public int getNumeroHorasNormales() {
		return numeroHorasNormales;
	}

	public void setNumeroHorasNormales(int numeroHorasNormales) {
		this.numeroHorasNormales = numeroHorasNormales;
	}

	public int getNumeroHorasExtras() {
		return numeroHorasExtras;
	}

	public void setNumeroHorasExtras(int numeroHorasExtras) {
		this.numeroHorasExtras = numeroHorasExtras;
	}

	public int getNumeroHorasTotales() {
		return numeroHorasTotales;
	}

	public void setNumeroHorasTotales(int numeroHorasTotales) {
		this.numeroHorasTotales = numeroHorasTotales;
	}

	public String getFechaFinContraro() {
		return fechaFinContraro;
	}

	public void setFechaFinContraro(String fechaFinContraro) {
		this.fechaFinContraro = fechaFinContraro;
	}
	
	
}
