package herencia3;

public class PrincipalHerencia3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PRIMERA PARTE:");
		
		ListaMultimedia arrayListaMultimedia  = new ListaMultimedia (10); //(10) es del constructor, tengo un constructor solo con un int position
		
		Pelicula pelicula1 = new Pelicula("Titulo1", "Autor1", "Formato1", 10 , "Aitor", "Ana");
		Pelicula pelicula2 = new Pelicula("Titulo2", "Autor2", "Formato2", 20 , "Luis", "Rebeca");
		Pelicula pelicula3 = new Pelicula("Titulo3", "Autor3", "Formato3", 30 , "Juan", "Lara");
		
		arrayListaMultimedia.add(pelicula1);
		arrayListaMultimedia.add(pelicula2);
		arrayListaMultimedia.add(pelicula3);
		
		//para ver si las he metido
		System.out.println("PELICULA 1:");
		System.out.println(pelicula1.toString());
		System.out.println("PELICULA 2:");
		System.out.println(pelicula2.toString());
		System.out.println("PELICULA 3:");
		System.out.println(pelicula3.toString());
		
		
		//ver todo
		System.out.println("LISTA MULTIMEDIA:_______________________________");
		System.out.println(arrayListaMultimedia.toString());
		
		System.out.println("LISTA MULTIMEDIA PRUEBA:________________________");
		System.out.println(arrayListaMultimedia.toStringPrueba());
	
		// método size: devuelve el número de objetos que hay en la lista.
		arrayListaMultimedia.size();
		
		System.out.println("SEGUNDA PARTE:");
		ListaMultimedia arrayListaMultimedia2  = new ListaMultimedia (20);
		
		Disco disco1 = new Disco("Titulo5", "Autor5", "Formato5", 50, "ROCK");
		Disco disco2 = new Disco("Titulo6", "Autor6", "Formato6", 60, "POP");
		Disco disco3 = new Disco("Titulo7", "Autor7", "Formato7", 70, "OPERA");
		arrayListaMultimedia2.add(disco1);
		arrayListaMultimedia2.add(disco2);
		arrayListaMultimedia2.add(disco3);
		System.out.println("LISTA MULTIMEDIA:_______________________________");
		System.out.println(arrayListaMultimedia2.toString());
		// método size: devuelve el número de objetos que hay en la lista.
		arrayListaMultimedia.size();
		// método size: devuelve el número de objetos que hay en la lista2.
		arrayListaMultimedia2.size();
	}

}
