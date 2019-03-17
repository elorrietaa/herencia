package ejercicio71;

public class Caballo {
	//atributos:
	private int capacidad; //representa el n�mero de guerreros griegos que puede haber dentro del caballo. No se podr� cambiar una vez le hemos dado valor.
	private int ocupacion; //representa el n�mero actual de griegos en el caballo.
	private Guerrero [] ocupantes; //array de objetos de la clase Guerrero.


	//constructor:
	public Caballo(int capacidad) {
		this.capacidad=capacidad;
		this.ocupacion=0;
		this.ocupantes = new Guerrero [capacidad];
	}
	
	
	
	//get y set:
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public int getCapacidad() {
		return capacidad;
	}

	public void setOcupacion(int ocupacion) {
		this.ocupacion = ocupacion;
	}
	public int getOcupacion() {
		return ocupacion;
	}

	public Guerrero [] getOcupantes() {
		return ocupantes;
	}

	public void setOcupantes(Guerrero [] ocupantes) {
		this.ocupantes = ocupantes;
	}

	//m�todos:
	public int buscar(String nombre) {
		int posicion=-1;
		for(int i=0; i<this.ocupacion;i++) {
			if(nombre.equals(ocupantes[i].getNombre())) {
				posicion=i;
				System.out.println(ocupantes[i].getNombre() + "Existe");
			}  
		}
		
		return posicion;
		
	}
	
	public void mostrarGuerreroPosicion(int pos) {
		if(pos==-1) {
			System.out.println("El guerrero no existe");
		}
		else {
				System.out.println("El guerrero: "+ ocupantes[pos].getNombre() + "Existe. Su posicion es:" +pos+ "Datos: " +ocupantes[pos].toString());
			}
	}
	
	
	
	public void montarseEnCaballo(Guerrero guerrero) {
		boolean caballoLleno=false;
		//varias formas:
		//1� instanceof
		//Poniendo un atributo boolean esTroyano=true;
		if(guerrero instanceof Griego) {
			
			if(this.ocupacion >= this.capacidad) {
				caballoLleno = true;
				System.out.println("El caballo est� lleno.");
			}
			else { 
				caballoLleno = false;
				
				ocupantes[ocupacion] = guerrero;
				this.ocupacion=ocupacion+1;
				System.out.println("Guerrero Griego"+ guerrero.getNombre() + " montado en caballo");
			}
		}
		else if(guerrero instanceof Troyano) {
			System.out.println("Atenci�n! Guerrero Troyano "+ guerrero.getNombre() +" Intendando acceder al caballo");
			//matar guerrero
			guerrero.isMuerto();
		}
	}
	
	
	public String mostrarCaballo(int pos) {
		return "Caballo: " + " Capacidad:" + capacidad + " Ocupacion: " + ocupacion + " Lista ocupantes: " + ocupantes[pos] ;
	}

	
	
	
	
	
	
	
}
