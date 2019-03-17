package ejercicio71;

public class GuerraTroya {
	

	public static void main(String[] args) {
		int posicion;
		//2.    Crear un caballo con capacidad para 20 guerreros.
		Caballo caballo1 = new Caballo(20);
		//3.    Crear 3  guerreros griegos (Aquiles, Agamenon y Ajax) y montarlos en el caballo.
		Griego griego1 = new Griego("Aquiles", 20, 8);
		Griego griego2 =new Griego("Agamenon", 21, 9);
		Griego griego3 =new Griego("Ajax", 23, 10);
		
		caballo1.montarseEnCaballo(griego1);
		caballo1.montarseEnCaballo(griego2);
		caballo1.montarseEnCaballo(griego3);
		System.out.println("-----------------------");
		//4.    Mostrar caballo.
		System.out.println("DATOS caballo1:");
		for(int i=0; i<caballo1.getOcupacion();i++) {
			System.out.println(caballo1.mostrarCaballo(i));
		}
		System.out.println("-----------------------");
		//5.    Crea otro guerrero griego anónimo y móntalo en el caballo y muestra el caballo.
		Griego griego4 =new Griego();
		caballo1.montarseEnCaballo(griego4);
		System.out.println("DATOS caballo1:");
		for(int i=0; i<caballo1.getOcupacion();i++) {
			System.out.println(caballo1.mostrarCaballo(i));
		}
		System.out.println("-----------------------");
		
		//6.    Buscar a Agamenon en el caballo y mostrar sus datos.
		posicion=caballo1.buscar("Agamenon");
		caballo1.mostrarGuerreroPosicion(posicion);
		//7.    Buscar  a Odiseo en el caballo y comprobar que no existe.
		posicion=caballo1.buscar("Odiseo");
		caballo1.mostrarGuerreroPosicion(posicion);
		//8.    Crear 1 guerrero troyano (Paris).
		Troyano troyano1 = new Troyano("Paris",15,7);
		//9.    Montarlo en el caballo y comprobar que no es posible.
		caballo1.montarseEnCaballo(troyano1);
		
		
	}
 
}
