package agendadetelefonos;

public class PruebaCListaTelfnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declarar listaTelefonos de tipo CListaTfnos
		CListaTfnos listaTelfnos = new CListaTfnos();
		CPersona persona1= new CPersona("Ana", "ana@gmail.com", 666000111);
		CPersona persona2= new CPersona("Juan", "juan@gmail.com", 666000222);
		CPersona persona3= new CPersona("Lara", "lara@gmail.com", 666000333);
		CPersona persona4= new CPersona("Ane", "ane@gmail.com", 666000444);
		listaTelfnos.anadir(persona1);
		listaTelfnos.anadir(persona2);
		listaTelfnos.anadir(persona3);
		listaTelfnos.anadir(persona4);
		
		listaTelfnos.mostrarLista();
		int posicionPersona=listaTelfnos.buscar("Lara");
		boolean telefonoEncontrado= listaTelfnos.eliminar(666000333);
		System.out.println("Telefono encontrado. " + telefonoEncontrado);
		
		listaTelfnos.mostrarLista();

	}

}
