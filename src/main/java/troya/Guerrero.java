package troya;

public class Guerrero {
	
	protected String nombre;
	protected int edad;
	protected int fuerza;
	protected boolean herido;
	protected boolean muerto;
	
	
	
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

	public boolean getHerido() {
		return herido;
	}

	public void setHerido(boolean herido) {
		this.herido = herido;
	}

	public boolean getMuerto() {
		return muerto;
	}

	public void setMuerto(boolean muerto) {
		this.muerto = muerto;
	}
	
	

	public Guerrero(String nombre, int edad, int fuerza) {
		
		this.nombre = nombre;
		this.fuerza = fuerza;
		this.edad = edad;
		
		if (comprobarFuerza()==true) {
			
			this.fuerza = fuerza;
		} else {
			
			this.fuerza = 5;

		}
		
		if (comprobarEdad()==true) {
			
			this.edad = edad;
		} else {
			
			this.edad = 25;
		
		}
		
		
	}

	
	public boolean comprobarFuerza () {
		
		if (fuerza >= 1 && fuerza <= 10) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean comprobarEdad() {
		
		if (edad >= 14 && edad <= 60) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		return "Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "Fuerza: " + fuerza + "\n" + "Herido: " + herido + "\n" + "Muerto: " + muerto + "\n" + "---------------------" + "\n";
	}

	public boolean procedencia() {
		return true;
			
	}
}
	


