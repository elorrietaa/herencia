package troya;

public class Caballo {
	
	private int capacidad;
	private int ocupacion;
	private Guerrero[] listaOcupantes;
	
	public Caballo (int capacidad) {
		
		this.capacidad=capacidad;
		this.listaOcupantes= new Guerrero[capacidad];
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(int ocupacion) {
		this.ocupacion = ocupacion;
	}
	
	public int buscar (String nombre) {
		
		int posicion = -1;
		for(int i=0; i<ocupacion; i++) {
			
			if (nombre==listaOcupantes[i].getNombre()) {		
				return posicion = i; 	
			}
		}
		return posicion;
		
	}
	
	public void mostrarGuerreroPosicion (int pos) {
		
			
		if(listaOcupantes[pos] != null || ocupacion > listaOcupantes.length) {
			System.out.println(listaOcupantes[pos].toString());
		}else {
			System.out.println("No es posible");
		}
		
	}
	
	public void montarseEnCaballo(Guerrero guerrero) {
			
		if(ocupacion < listaOcupantes.length && guerrero.procedencia()==true) {
			
			listaOcupantes[ocupacion] = guerrero;
			ocupacion++;
			System.out.println("Guerrero Griego " + guerrero.nombre + " montado en caballo");
			
		}else {
	
			System.out.println("Atencion!!!");
			System.out.println("Guerrero Troyano " + guerrero.nombre + " intentando acceder al caballo");
		}
					
	}
	
	public void desmontarseEnCaballo(String nombre) {
		
		for(int i = 0; i < ocupacion; i++){
			
			if (nombre == listaOcupantes[i].getNombre())
			{
				for (int j=i; j < ocupacion; j++)
				{
					listaOcupantes[j] = listaOcupantes[j + 1];
				}
				ocupacion--;
			}
			
		}
	
	}
	
	public String mostrarCaballo() {
		
		String devuelve = "";

		for(int i =0; i<ocupacion; i++){
			devuelve = devuelve + "Griego: " + (i+1) + "\n" +  listaOcupantes[i].toString();
		}
		
		return devuelve + "Capacidad: " + capacidad + "\n" + "Ocupacion: " + ocupacion;
	}
	
	public int[] ordenarPorFuerza() {
		
		int [] arrayFuerza = new int [listaOcupantes.length];
		
		for(int i=0; i<ocupacion; i++){
			arrayFuerza[i]= listaOcupantes[i].getFuerza();
		}
		return arrayFuerza;
	}
	
	public  int[] burbuja (int[] desOrdenado) {
	  	
    	for(int j=1; j < desOrdenado.length; j++)
    	{
        	for (int i=0; i < desOrdenado.length - 1; i++) {
        		
        		if(desOrdenado[i] > desOrdenado[i+1]) {
        			
        			desOrdenado = intercambiar (desOrdenado, i , i+1);
        		}
        	}
    	}
    	
		return desOrdenado;			
    		
    }
        	
    	
    public int [] intercambiar (int [] vector, int i, int j) {
    		
    		int auxiliar = 0;
    		auxiliar = vector[i];
    		vector[i]=vector[j];
    		vector[j]=auxiliar;
    		return vector;		
    		
   }
    
    public void mostrarArrayOrdenadoFuerza(){
    	
    	System.out.println("Ordenacion de la fuerza de mayor a menor:");
		burbuja(ordenarPorFuerza());
		
		for(int i=0; i<ocupacion;i++) {
			if(ordenarPorFuerza()[i] == listaOcupantes[i].getFuerza()) {
				System.out.println("La fuerza de " + listaOcupantes[i].getNombre() + " es de: " + ordenarPorFuerza()[i]);
			}
		}
    }
    
    public void invertir(int[] array) {
 
        for (int i = ocupacion-1; i >= 0 ; i--) {
           System.out.println(array[i]);
        }
       
    }
    

}
