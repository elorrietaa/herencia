package hospital;

import java.util.Date;
import java.util.Scanner;

public class EmpleadoEventual extends Empleado{
	//atributos:
	protected float salarioHora;
	protected int numeroHorasNormales;
	protected int numeroHorasExtras;
	protected int numeroHorasTotales;
	protected Date fechaFinContraro;
	
	//constructor
	public EmpleadoEventual(String dni, String nombre, String apellido, Date fechaNac, String direccion,
			String ciudad, float salarioHora, int numeroHorasTotales, Date fechaFinContraro  ) {
		super(dni, nombre, apellido, fechaNac, direccion, ciudad);
		this.salarioHora=salarioHora;
		this.numeroHorasTotales=numeroHorasTotales;
		this.fechaFinContraro=fechaFinContraro;
	}
	
	//get y set
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

	public Date getFechaFinContraro() {
		return fechaFinContraro;
	}

	public void setFechaFinContraro(Date fechaFinContraro) {
		this.fechaFinContraro = fechaFinContraro;
	}
	
public EmpleadoEventual[] CargarDatos(Scanner reader, LeerDatos leerDatos) {
		
		//Declaracion e inicialización de variables
		EmpleadoEventual [] arrayEmpleadoEventual = null;
		//atributos persona:
		String dni;
		String nombre;
		String apellido;
		Date fechaNac;
		String direccion;
		String ciudad;
		//atributos propios:
		float salarioHora;
		int numeroHorasNormales;
		int numeroHorasExtras;
		int numeroHorasTotales;
		Date fechaFinContraro;
		
		int numeroPersonas = 0;
		//Inicio de programa
		numeroPersonas = leerDatos.RecogerOpcionInt(reader,0,100,"¿cuantas personas va a introducir? ");
		arrayEmpleadoEventual = new EmpleadoEventual[numeroPersonas];
		
		for(int i = 0;i<numeroPersonas;i++)
		{
			dni= leerDatos.IntroducirYValidarFormatoDNI(reader);
			nombre = leerDatos.IntroducirTexto(reader, "Introduzca nombre: ");
			apellido = leerDatos.IntroducirTexto(reader, "Introduzca apellido: ");
			fechaNac= leerDatos.IntroducirYValidarFecha(reader);
			direccion = leerDatos.IntroducirTexto(reader, "Introduzca dirección: ");
			ciudad = leerDatos.IntroducirTexto(reader, "Introduzca ciudad: ");
			
			salarioHora=leerDatos.RecogerOpcionFloat(reader, 0, 1000, "Introduzca salario/Hora: ");
			numeroHorasNormales=leerDatos.RecogerOpcionInt(reader, 0, 1000, "Introduzca horas normales: ");
			numeroHorasExtras=leerDatos.RecogerOpcionInt(reader, 0, 1000, "Introduzca horas extras: ");
			numeroHorasTotales=numeroHorasNormales+numeroHorasExtras;
			fechaFinContraro=leerDatos.IntroducirYValidarFecha(reader);
			
			EmpleadoEventual empleadoEventual = new EmpleadoEventual(dni, nombre, apellido, fechaNac, direccion, ciudad,salarioHora, numeroHorasTotales, fechaFinContraro);
			arrayEmpleadoEventual[i] = empleadoEventual;
		}
		
		return arrayEmpleadoEventual;
}
}
