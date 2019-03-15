package ejercicio71;

public class GuerraTroya {

	public static void main(String[] args) {
		Caballo caballo1 = new Caballo(20);
		Griego griego1 = new Griego("Aquiles", 20, 8);
		Griego griego2 =new Griego("Agamenon", 21, 9);
		Griego griego3 =new Griego("Ajax", 23, 10);
		
		caballo1.montarseEnCaballo(griego1);
		caballo1.montarseEnCaballo(griego2);
		caballo1.montarseEnCaballo(griego3);
		caballo1.montarseEnCaballo(griego3);
		
		for(int i=0; i<caballo1.getOcupacion();i++) {
			caballo1.mostrarCaballo(i);
		}
		System.out.println("-----------------------");
		Griego griego4 =new Griego();
		caballo1.montarseEnCaballo(griego4);
		for(int i=0; i<caballo1.getOcupacion();i++) {
			caballo1.mostrarCaballo(i);
		}
		
		System.out.println("-----------------------");
		caballo1.buscar("Odiseo");
		
		
	}

}
