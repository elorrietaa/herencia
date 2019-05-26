package troya;

public class GuerraTroya {
	
	public static void main(String[] args) {
		
		// Crear un caballo con capacidad para 20 guerreros.
		Caballo caballo = new Caballo(20);

		//Crear 3 guerreros griegos (Aquiles, Agamenon y Ajax) 
		Griego griego1 = new Griego("Aquiles", 70, 9);
		Griego griego2 = new Griego("Agamenon", 20, 8);
		Griego griego3 = new Griego("Ajax", 20, 7);
		
		// y montarlos en el caballo.
		caballo.montarseEnCaballo(griego1);
		caballo.montarseEnCaballo(griego2);
		caballo.montarseEnCaballo(griego3);
		System.out.println("-------------------------------");
		
		//Mostrar caballo.
		System.out.println(caballo.mostrarCaballo());
		System.out.println(" ");
		
		//Crea otro guerrero griego anónimo y móntalo en el caballo y muestra el caballo.
		Griego griego4 = new Griego("Miguel", 20, 6);
		caballo.montarseEnCaballo(griego4);
		System.out.println(" ");
		System.out.println(caballo.mostrarCaballo());
		System.out.println(" ");
	
		//Buscar a Agamenon en el caballo y mostrar sus datos.
		System.out.println("Buscar a Agamenon en el caballo y mostrar sus datos" + "\n");
		caballo.mostrarGuerreroPosicion(caballo.buscar("Agamenon"));
		
		//Buscar a Odiseo en el caballo y comprobar que no existe.
		System.out.println("Buscar a Odiseo en el caballo");
		String nombre="Odiseo";
		if(caballo.buscar(nombre) == -1) {
			System.out.println("No existe");
		}else {
			caballo.mostrarGuerreroPosicion(caballo.buscar(nombre));
		}
		System.out.println(" ");
		
		//Crear 1 guerrero troyano (Paris).
		Troyano troyano1 = new Troyano("Paris", 108, 150);
		
		//Montarlo en el caballo y comprobar que no es posible.
		caballo.montarseEnCaballo(troyano1);
		System.out.println(" ");
		System.out.println(caballo.mostrarCaballo());
		
		//Ordenar la fuerza de los guerreros de mayor a menor.
		System.out.println(" ");
		caballo.mostrarArrayOrdenadoFuerza();
		
		//Ordenar al reves
		caballo.invertir(caballo.ordenarPorFuerza());
		
		//Desmontar a un guerrero del caballo.
		System.out.println(" ");
		System.out.println("Desmontar a Aquiles del caballo");
		System.out.println(" ");
		caballo.desmontarseEnCaballo("Aquiles");
		System.out.println(caballo.mostrarCaballo());
	
		
	}

}
