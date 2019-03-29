package agendadetelefonos;

import java.util.ArrayList;

public class CListaTfnos {
	//atributo
	private ArrayList <CPersona> listaTelefonos;
	
	//constructor
	CListaTfnos(){
		listaTelefonos=new ArrayList<>();
	}
	
	public void anadir(CPersona objeto) {
		listaTelefonos.add(objeto);
	}
	
	public boolean eliminar(String telBuscado) {
		
		int pos = listaTelefonos.indexOf(telBuscado); //te busca el primero, si quieres el último lastindex
		if(pos!=-1) {
			System.out.print(telBuscado + "se ha encontrado en la posición "+ pos);
			listaTelefonos.remove(pos);
			System.out.print("el telefono: " + telBuscado + " se ha eliminado correctamente.");
			return true;
		}
			
		else {
			System.out.print(telBuscado + "no se ha encontrado");
			return false;
		}
			
	}
	
	public int buscar(String nombre) {
		int pos = listaTelefonos.indexOf(nombre); 
		if(pos!=-1) {
			return pos;
		}
			
		else {
			return -1;
		}
	}
	
	public CPersona registro(int i) {
			if(i>listaTelefonos.size() || i<listaTelefonos.size()) {
				System.out.println("Error, indice introducido fuera de los límites de la lista");
				return null;
			}
			else {
				return listaTelefonos.get(i); 
			}
	}
	
	public int longitud() {
		int numeroContactos = listaTelefonos.size();
		return numeroContactos;
	}
	
	public void mostrarLista() {
		System.out.println("LISTA CONTACTOS: ");
		for(int i=0;i<listaTelefonos.size();i++)
			{
			System.out.println("Nombre:"+ listaTelefonos.get(i).getNombre());
			System.out.println("Email:");
			System.out.println("Telefono:");
			}
	}
	
}
