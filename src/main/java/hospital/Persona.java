package hospital;

import java.util.Date;
import java.util.Scanner;

public class Persona {
	//atributos:
	protected String dni;
	protected String nombre;
	protected String apellido;
	protected Date fechaNac;
	protected String direccion;
	protected String ciudad;
	
	//constructor:
	public Persona(String dni, String nombre, String apellido, Date fechaNac, String direccion, String ciudad) {
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

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
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
	
	//métodos
	public Persona[] CargarDatos(Scanner reader, LeerDatos leerDatos) {
		
		//Declaracion e inicialización de variables
		Persona [] arrayPersonas = null;
		String dni;
		String nombre;
		String apellido;
		Date fechaNac;
		String direccion;
		String ciudad;
		int numeroPersonas = 0;
		//Inicio de programa
		numeroPersonas = leerDatos.RecogerOpcionInt(reader,0,100,"¿cuantas personas va a introducir? ");
		arrayPersonas = new Persona[numeroPersonas];
		
		for(int i = 0;i<numeroPersonas;i++)
		{
			dni= leerDatos.IntroducirYValidarFormatoDNI(reader);
			nombre = leerDatos.IntroducirTexto(reader, "Introduzca nombre: ");
			apellido = leerDatos.IntroducirTexto(reader, "Introduzca apellido: ");
			fechaNac= leerDatos.IntroducirYValidarFecha(reader);
			direccion = leerDatos.IntroducirTexto(reader, "Introduzca dirección: ");
			ciudad = leerDatos.IntroducirTexto(reader, "Introduzca ciudad: ");
			
			Persona persona = new Persona(dni, nombre, apellido, fechaNac, direccion, ciudad);
			arrayPersonas[i] = persona;
		}
		
		return arrayPersonas;
	}

	
	
}
