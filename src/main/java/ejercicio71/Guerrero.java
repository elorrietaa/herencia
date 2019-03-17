package ejercicio71;

public class Guerrero {
	//atributos:
	protected String nombre;
	protected int edad;
	protected int fuerza;
	protected boolean herido;
	protected boolean muerto;
	
	//constructor
	public Guerrero(String nombre, int edad, int fuerza) { 
		super();
		this.nombre = nombre;
		if (comprobarEdad(edad)==true) {
			this.edad = edad;
		}
		else {
			this.edad = 25;
		}
		if(comprobarFuerza(fuerza)==true) {
			this.fuerza = fuerza;
		}
		else {
			this.fuerza = 5;
		}
		this.herido = false;
		this.muerto = false;
	}

	//get y set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public boolean isHerido() {
		herido=true;
		return herido;
	}

	public void setHerido(boolean herido) {
		this.herido = herido;
	}

	public boolean isMuerto() {
		muerto=true;
		return muerto;
	}

	public void setMuerto(boolean muerto) {
		this.muerto = muerto;
	}
	
	//métodos 
	public boolean retirarse() {
		boolean decisionRetirarse=false;
		return decisionRetirarse;
		
	}
	
	public static boolean comprobarEdad(int edad) {
		boolean edadValidada=false;
		if(edad>=15 && edad<=60) {
			edadValidada=true;
		}
		else
		{
			edadValidada=false;
		}
		
		return edadValidada;
	}
	
	public static boolean comprobarFuerza(int f) {
		boolean fuerzaValidada=false;
		if(f>=1&& f<=10) {
			fuerzaValidada=true;
		}
		else
		{
			fuerzaValidada=false;
		}
		
		return fuerzaValidada;
	}

	@Override
	public String toString() {
		return "Guerrero:" + " Nombre: " + nombre + " Edad: " + edad+ " Fuerza: "+ fuerza+ " Herido: " + herido + "Muerto:" + muerto;
	}

	
}
