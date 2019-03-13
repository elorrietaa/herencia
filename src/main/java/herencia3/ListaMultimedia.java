package herencia3;

public class ListaMultimedia {
	//atributos
	private int contador = 0;
	private int maximoContador;
	private Multimedia [] arrayListaMultimedia; //Array de objetos multimedia
	private int position = 0;
	 
    //constructor:
	public ListaMultimedia(int maximoContador) {
		this.maximoContador = maximoContador;
		this.arrayListaMultimedia = new Multimedia[this.maximoContador]; //el constructor recibe un entero por parámetro indicando el número máximo de objetos que va a almacenar.
	}

	//get y set
	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public int getMaximoContador() {
		return maximoContador;
	}

	public void setMaximoContador(int contador) {
		this.maximoContador = maximoContador;
	}
	public Multimedia[] getArrayMultimedia() {
		return arrayListaMultimedia;
	}

	public void setArrayMultimedia(Multimedia[] arrayMultimedia) {
		this.arrayListaMultimedia = arrayMultimedia;
	}
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	
	//metodos:
	public int size() {
		return this.contador;
	}
	
	public boolean add(Multimedia m) {
		boolean listaLlena;
		this.contador=contador+1;
		if(this.contador > maximoContador) {
			listaLlena = true;
		}
		else
		{ 
			listaLlena = false;
			arrayListaMultimedia[this.contador-1] = m;
		}
			
		return listaLlena;
	}
	
	public Multimedia get(int posicion) {
		return arrayListaMultimedia[posicion];
	}

	public String toString(int pos) {
		
		return "arrayListaMultimedia:" + arrayListaMultimedia[pos] ;
	}



	

	
	
}
