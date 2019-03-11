package herencia3;

import java.util.Arrays;

public class ListaMultimedia {
	//atributos
	private int contador = 0;
	private int maximoContador;
	private Multimedia [] arrayListaMultimedia;
	private int position = 0;
	
    //constructor:
	public ListaMultimedia(int maximoContador) {
		this.maximoContador = maximoContador;
		this.arrayListaMultimedia = new Multimedia[this.maximoContador]; //el constructor recibe un entero por parámetro indicando el número máximo de objetos que va a almacenar.
	}

	//get y set
	public int getContador() {
		return maximoContador;
	}

	public void setContador(int contador) {
		this.maximoContador = contador;
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
		int numeroObjetos=0;
		for(int i=0;i<arrayListaMultimedia.length;i++) {
			numeroObjetos=numeroObjetos+1;
		}
		System.out.println("El numeroObejtos del arrayListaMultimedia es:"+ numeroObjetos );
		return numeroObjetos;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ListaMultimedia [arrayListaMultimedia=").append(System.getProperty("line.separator")).append(Arrays.toString(arrayListaMultimedia))
				.append("]");
		return builder.toString();
	}

	
	
	public String toStringPrueba() {
		String imprimirLista = null;
		
		for(int i=0;i<arrayListaMultimedia.length;i++) {
			imprimirLista= "ListaMultimedia [arrayListaMultimedia=" + Arrays.toString(arrayListaMultimedia) + "]";
		}
		return imprimirLista;
	}


	

	
	
}
