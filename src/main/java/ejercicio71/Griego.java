package ejercicio71;

public class Griego extends Guerrero{
	//atributos
		//constructor1
		public Griego(String nombre, int edad, int fuerza) {
			super(nombre, edad, fuerza);
		}
		//constructor2
		public Griego() {
			super("GriegoX", 20, 8);
		}
		
		//m�todos:
		@Override
		public boolean retirarse() {
			System.out.println("RETIRADA");
			return super.retirarse();
		}
}
