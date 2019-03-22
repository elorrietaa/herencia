package hospital;

public class Persona {
	//atributos:
	protected String dni;
	protected String nombre;
	protected String apellido;
	protected String fechaNac;
	protected String direccion;
	protected String ciudad;
	LeerDatos leerDatos = new LeerDatos();
	
	//constructor:
	public Persona(String dni, String nombre, String apellido, String fechaNac, String direccion, String ciudad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.direccion = direccion;
		this.ciudad = ciudad;
	}

	//get y set:
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	

	
	
}
